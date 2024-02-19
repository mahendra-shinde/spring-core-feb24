package com.mahendra.demo6;

public class Account {
	private String accNum;
	private String customer;
	private Double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Account(String accNum, String customer, Double balance) {
		super();
		this.accNum = accNum;
		this.customer = customer;
		this.balance = balance;
	}



	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	
	
}
