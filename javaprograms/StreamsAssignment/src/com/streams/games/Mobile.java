package com.streams.games;

public class Mobile {
  private String brand;
  private double price;
public Mobile() {
	super();
	// TODO Auto-generated constructor stub
}
public Mobile(String brand, double price) {
	super();
	this.brand = brand;
	this.price = price;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Mobile [brand=" + brand + ", price=" + price + "]";
}
  
  
}
