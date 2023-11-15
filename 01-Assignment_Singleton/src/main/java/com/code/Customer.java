package com.code;

public class Customer {
  private int id;
  private String holderName;
  private double phoneNumber;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getHolderName() {
	return holderName;
}
public void setHolderName(String holderName) {
	this.holderName = holderName;
}
public double getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(double phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public Customer(int id, String holderName, double balance) {
	super();
	this.id = id;
	this.holderName = holderName;
	this.phoneNumber = phoneNumber;
}
public Customer() {
	super();
}
@Override
public String toString() {
	return "Customer [id=" + id + ", holderName=" + holderName + ", PhoneNumber=" + phoneNumber + "]";
}
  
}
