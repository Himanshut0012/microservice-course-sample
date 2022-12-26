package com.currency.conversion.model;

import java.math.BigDecimal;

public class CurrencyConversion {

	private Long id;
	private String from;
	private String to;
	private BigDecimal exchangeRate;
	private BigDecimal quantity;
	private BigDecimal calculatedAmount;
	private String environment;
	
	public CurrencyConversion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrencyConversion(Long id, String from, String to, BigDecimal exchangeRate, BigDecimal quantity,
			BigDecimal calculatedAmount, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.exchangeRate = exchangeRate;
		this.quantity = quantity;
		this.calculatedAmount = calculatedAmount;
		this.environment = environment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getCalculatedAmount() {
		return calculatedAmount;
	}

	public void setCalculatedAmount(BigDecimal calculatedAmount) {
		this.calculatedAmount = calculatedAmount;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	
}
