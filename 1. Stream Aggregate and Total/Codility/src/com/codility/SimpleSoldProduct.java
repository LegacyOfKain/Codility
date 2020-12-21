package com.codility;

import java.math.BigDecimal;

public class SimpleSoldProduct {

	String name;
	BigDecimal price;
	
	//lombok
	SimpleSoldProduct(String name, BigDecimal price) {
		super();
		this.name = name;
		this.price = price;
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
}
