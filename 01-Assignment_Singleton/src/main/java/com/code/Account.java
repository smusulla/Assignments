package com.code;

public class Account {
	private int id;
	
	private Customer cus;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account() {
		super();
	}
	
	public Customer getCus() {
		return cus;
	}
	public void setCus(Customer cus) {
		this.cus = cus;
	}
	public Account(int id, Customer cus, String name, double balance) {
		super();
		this.id = id;
		this.cus = cus;
		this.name = name;
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	private String name;
	private double balance;



	@Override
	public String toString() {
		return "Account [id=" + id + ", cus=" + cus + ", name=" + name + ", Balance=" + balance + "]";
	}
	
}
