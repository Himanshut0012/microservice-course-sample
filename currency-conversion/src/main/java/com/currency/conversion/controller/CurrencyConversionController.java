package com.currency.conversion.controller;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.currency.conversion.config.CurrencyExchangeProxy;
import com.currency.conversion.model.CurrencyConversion;

@RestController
public class CurrencyConversionController {

	@Autowired
	private CurrencyExchangeProxy  proxy;
	
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateCurrencyConversion(
			@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity) {
		
		HashMap<String , String> uriVariable= new HashMap<>();
		uriVariable.put("from", from);
		uriVariable.put("to", to);
		
		ResponseEntity<CurrencyConversion> responseEntity = new RestTemplate()
				.getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", 
						CurrencyConversion.class, uriVariable);
		
		CurrencyConversion currencyConversion = responseEntity.getBody();
//		BigDecimal calculatedAmount=(BigDecimal) currencyConversion.getExchangeRate();
		return new CurrencyConversion(currencyConversion.getId(),from,to,currencyConversion.getExchangeRate(),
				quantity,  quantity.multiply(currencyConversion.getExchangeRate()), currencyConversion.getEnvironment()+" "+" rest template");
	}
	
	
	
	
	@GetMapping("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateCurrencyConversionFeign(
			@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity) {
		
		CurrencyConversion currencyConversion= proxy.retriveExchaneValue(from, to);
		return new CurrencyConversion(currencyConversion.getId(),from,to,currencyConversion.getExchangeRate(),
				quantity,  quantity.multiply(currencyConversion.getExchangeRate()), currencyConversion.getEnvironment()+" "+"FEIGN");
	}
	
}
