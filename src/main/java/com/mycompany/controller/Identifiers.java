package com.mycompany.controller;

public class Identifiers {

	private String clientId;
	private String accountId;
	private String cardNumber;
	private Products  products;
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Products getProducts() {
		return products;
	}
	public void setProducts(Products products) {
		this.products = products;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Identifiers[" + "clientId=" + clientId+", accountId=" + accountId 
				+", cardNumber=" + cardNumber +", products=" +products + "]";
	}
}
