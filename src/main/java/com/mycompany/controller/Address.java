package com.mycompany.controller;

public class Address {

	private String line1;
	private String line2;
	private String line3;
	private String city;
	private String postalCode;
	private String stateProvince;
	private String countryCode;
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getLine3() {
		return line3;
	}
	public void setLine3(String line3) {
		this.line3 = line3;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getStateProvince() {
		return stateProvince;
	}
	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Address[" + 
				"line1="+line1 + ", line2="+line2 +", line3="+ line3 +", city="+ city
				+", postalCode="+ postalCode + ", countryCode="+ countryCode +"]";
	}
	
}
