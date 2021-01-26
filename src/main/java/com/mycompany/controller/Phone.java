package com.mycompany.controller;

public class Phone {

	private String type;
	private String value;
	private String e164value;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getE164value() {
		return e164value;
	}
	public void setE164value(String e164value) {
		this.e164value = e164value;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Phone [type="+ type  +", value=" + value;
	}
}
