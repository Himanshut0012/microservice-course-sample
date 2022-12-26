package com.currencywe.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CurrencyExchange {

	@Id
	
	private long id;
	@Column(name = "country_from")
	private String from;
	@Column(name="country_to")
	private String to;
	private BigDecimal exchangeRate;
	private String environment;
	public CurrencyExchange() {
	}
	public CurrencyExchange(long id, String from, String to, BigDecimal exchangeRate) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.exchangeRate = exchangeRate;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	
}
