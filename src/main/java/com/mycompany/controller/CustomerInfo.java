package com.mycompany.controller;

import java.util.List;

public class CustomerInfo {
private String name;
private String customerType;
private List<Phone> phones;
private List<String> emails;
private Address address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCustomerType() {
	return customerType;
}
public void setCustomerType(String customerType) {
	this.customerType = customerType;
}
public List<Phone> getPhones() {
	return phones;
}
public void setPhones(List<Phone> phones) {
	this.phones = phones;
}
public List<String> getEmails() {
	return emails;
}
public void setEmails(List<String> emails) {
	this.emails = emails;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CustomerInfo[" 
				+ ", name="+ name + ", customerType=" + customerType
				+ ", phones=" + phones+ ", emails="+ emails
				+ ", address="+ address + "]";
	}

}
