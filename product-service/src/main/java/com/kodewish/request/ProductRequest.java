package com.kodewish.request;

public class ProductRequest {
	private String name;
    private double price;
    private String staus;
	public ProductRequest(String name, double price, String staus) {
		super();
		this.name = name;
		this.price = price;
		this.staus = staus;
	}
	public ProductRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStaus() {
		return staus;
	}
	public void setStaus(String staus) {
		this.staus = staus;
	}
    

}
