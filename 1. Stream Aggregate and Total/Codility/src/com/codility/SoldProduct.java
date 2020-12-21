package com.codility;

import java.math.BigDecimal;

public class SoldProduct {

	String name;
	BigDecimal price;
	String currency;
	
	//lombok
	SoldProduct(String name, BigDecimal price, String currency) {
		super();
		this.name = name;
		this.price = price;
		this.currency = currency;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	BigDecimal getPrice() {
		return price;
	}

	void setPrice(BigDecimal price) {
		this.price = price;
	}

	String getCurrency() {
		return currency;
	}

	void setCurrency(String currency) {
		this.currency = currency;
	}
}
