package com.codility;

import java.math.BigDecimal;
import java.util.List;

public class SoldProductsAggregate {

	List<SimpleSoldProduct> products;
	BigDecimal total;
	
	//lombok
	SoldProductsAggregate(List<SimpleSoldProduct> products, BigDecimal total) {
		super();
		this.products = products;
		this.total = total;
	}

	List<SimpleSoldProduct> getProducts() {
		return products;
	}

	void setProducts(List<SimpleSoldProduct> products) {
		this.products = products;
	}

	BigDecimal getTotal() {
		return total;
	}

	void setTotal(BigDecimal total) {
		this.total = total;
	}
}
