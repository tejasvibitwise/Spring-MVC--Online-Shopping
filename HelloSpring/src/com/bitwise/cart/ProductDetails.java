package com.bitwise.cart;

import java.util.ArrayList;
import java.util.List;

public class ProductDetails {
	
	

	@Override
	public String toString() {
		return ""+getName() + "  " + price
				+ "  " + quantity + "\t";
	}

	private String name;
	private int price,quantity;
	
	private List<ProductDetails> objlist=new ArrayList<ProductDetails>();
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public List<ProductDetails> getObjlist() {
		return objlist;
	}

	public void setObjlist(List<ProductDetails> objlist) {
		this.objlist = objlist;
	}

	public ProductDetails(String name, int price, int quantity) {
		super();
		this.setName(name);
		this.price = price;
		this.quantity = quantity;
	}

	public ProductDetails()
	{
		products();
	}
	
	public void products()
	{
		
		objlist.add(new ProductDetails("product 1",10,20));
		objlist.add(new ProductDetails("product 2",30,40));
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
