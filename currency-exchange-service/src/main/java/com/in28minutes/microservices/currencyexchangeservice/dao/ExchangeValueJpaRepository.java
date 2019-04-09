package com.in28minutes.microservices.currencyexchangeservice.dao;

import com.in28minutes.microservices.currencyexchangeservice.rest.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueJpaRepository extends JpaRepository<ExchangeValue, Long>
{
	ExchangeValue findByFromAndTo(String from,String to);
}
