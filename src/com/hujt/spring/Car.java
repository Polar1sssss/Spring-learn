package com.hujt.spring;

public class Car {
	private String brand;
	private String corp;
	private double price;
	private int maxSpeed;
	public Car(String brand, String corp, double price){
		super();
		this.brand = brand;
		this.corp = corp;
		this.price = price;
	}
	public Car(String brand, String corp, int maxSpeed){
		super();
		this.brand = brand;
		this.corp = corp;
		this.maxSpeed = maxSpeed;
	}
	public Car(String brand, String corp, double price, int maxSpeed) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.price = price;
		this.maxSpeed = maxSpeed;
	}
	public void setPrice(double price){
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", corp=" + corp + ", maxSpeed="
				+ maxSpeed + ", price=" + price + "]";
	}
	
}
