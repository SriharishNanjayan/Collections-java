package com.market;

public class Stock {
private String identity;
private String name;
private int quantity;
private double price;
private String manufacturingDate;
private String expiryDate;

@Override
public String toString() {
	return String.format("%-10s %-20s %-3d %-5.2f %-10s %-10s",identity,name,quantity,price,manufacturingDate,expiryDate);
}
public Stock(String identity, String name, int quantity, double price, String manufacturingDate, String expiryDate) {
	super();
	this.identity = identity;
	this.name = name;
	this.quantity = quantity;
	this.price = price;
	this.manufacturingDate = manufacturingDate;
	this.expiryDate = expiryDate;
}
public String getIdentity() {
	return identity;
}
public void setIdentity(String identity) {
	this.identity = identity;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getManufacturingDate() {
	return manufacturingDate;
}
public void setManufacturingDate(String manufacturingDate) {
	this.manufacturingDate = manufacturingDate;
}
public String getExpiryDate() {
	return expiryDate;
}
public void setExpiryDate(String expiryDate) {
	this.expiryDate = expiryDate;
}

}
