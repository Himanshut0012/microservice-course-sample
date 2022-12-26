package com.currencywe.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.currencywe.dao.CurrencyExchangeDAO;
import com.currencywe.model.CurrencyExchange;

@RestController
public class CurrencyExcangeController {
	@Autowired
	private Environment environment;
	
	@Autowired
	private CurrencyExchangeDAO currencyExchangeDAO;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retriveExchaneValue(
			@PathVariable String from,
			@PathVariable String to) {
		
//		 CurrencyExchange currencyExchange = new CurrencyExchange(100L, from, to, BigDecimal.valueOf(82.55));
		 CurrencyExchange currencyExchange = currencyExchangeDAO.findByFromAndTo(from, to);
		 if(currencyExchange==null)
			throw new RuntimeException("Unable to find data");
		 String port = environment.getProperty("local.server.port");
		 currencyExchange.setEnvironment(port);
		 return currencyExchange;
	}
}
