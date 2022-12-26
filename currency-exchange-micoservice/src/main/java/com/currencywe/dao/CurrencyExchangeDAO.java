package com.currencywe.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.currencywe.model.CurrencyExchange;

@Repository
public interface CurrencyExchangeDAO extends JpaRepository<CurrencyExchange, Long> {

	CurrencyExchange findByFromAndTo(String from, String to);
}
