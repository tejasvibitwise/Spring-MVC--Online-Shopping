package com.bitwise.cart;

import java.util.ArrayList;
import java.util.List;

public class DeleteBean {
	private List<String> deleteproducts=new ArrayList<String>();

	public List<String> getProducts() {
		return deleteproducts;
	}

	public void setProducts(List<String> products) {
		this.deleteproducts = products;
	}


}
