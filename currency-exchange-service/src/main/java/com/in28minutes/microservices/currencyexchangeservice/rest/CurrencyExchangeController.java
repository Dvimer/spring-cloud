package com.in28minutes.microservices.currencyexchangeservice.rest;

import com.in28minutes.microservices.currencyexchangeservice.dao.ExchangeValueJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Objects;

@RestController
public class CurrencyExchangeController
{
	@Autowired
	private ExchangeValueJpaRepository repository;
	@Autowired
	private Environment environment;

	@GetMapping("/currency-exchange-service/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to)
	{
		ExchangeValue exchangeValue = repository.findByFromAndTo(from,to);
		exchangeValue.setPort(environment.getProperty("local.server.port",Integer.class));
		return exchangeValue;
	}
}
