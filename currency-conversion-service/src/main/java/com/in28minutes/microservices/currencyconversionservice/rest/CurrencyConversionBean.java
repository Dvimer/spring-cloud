package com.in28minutes.microservices.currencyconversionservice.rest;

import java.math.BigDecimal;

public class CurrencyConversionBean
{

	private Long id;

	private String from;

	private String to;
	private BigDecimal conversionMultiple;
	private BigDecimal quantity;
	private BigDecimal totalCalcuatedAmount;
	private int port;

	public CurrencyConversionBean()
	{
	}

	public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity, BigDecimal totalCalcuatedAmount, int port)
	{
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalCalcuatedAmount = totalCalcuatedAmount;
		this.port = port;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getFrom()
	{
		return from;
	}

	public void setFrom(String from)
	{
		this.from = from;
	}

	public String getTo()
	{
		return to;
	}

	public void setTo(String to)
	{
		this.to = to;
	}

	public BigDecimal getConversionMultiple()
	{
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple)
	{
		this.conversionMultiple = conversionMultiple;
	}

	public BigDecimal getQuantity()
	{
		return quantity;
	}

	public void setQuantity(BigDecimal quantity)
	{
		this.quantity = quantity;
	}

	public BigDecimal getTotalCalcuatedAmount()
	{
		return totalCalcuatedAmount;
	}

	public void setTotalCalcuatedAmount(BigDecimal totalCalcuatedAmount)
	{
		this.totalCalcuatedAmount = totalCalcuatedAmount;
	}

	public int getPort()
	{
		return port;
	}

	public void setPort(int port)
	{
		this.port = port;
	}
}
