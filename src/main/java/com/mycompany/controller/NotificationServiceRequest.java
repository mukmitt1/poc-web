package com.mycompany.controller;

import com.mycompant.meta.Meta;

public class NotificationServiceRequest {

	private String correlationId;
	private String requestType;
	private Identifiers identifiers;
	private CustomerInfo customerInfo;
	private Preferences preferences;
	private String alertType;
	private Meta meta;
	
	public NotificationServiceRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getCorrelationId() {
		return correlationId;
	}
	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	
	
public String getAlertType() {
		return alertType;
	}


	public void setAlertType(String alertType) {
		this.alertType = alertType;
	}


@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Correlation ID:" + correlationId + "," +
			"requestType:"+ requestType +", Identifiers=" + identifiers
		+ ", customerInfo="+ customerInfo
			+ ", Preferences="+ preferences 
			+ ", AlertType="+ alertType 
			+ ", meta=" + meta
			;
}


public Identifiers getIdentifiers() {
	return identifiers;
}


public void setIdentifiers(Identifiers identifiers) {
	this.identifiers = identifiers;
}


public CustomerInfo getCustomerInfo() {
	return customerInfo;
}


public void setCustomerInfo(CustomerInfo customerInfo) {
	this.customerInfo = customerInfo;
}


public Preferences getPreferences() {
	return preferences;
}


public void setPreferences(Preferences preferences) {
	this.preferences = preferences;
}


public Meta getMeta() {
	return meta;
}


public void setMeta(Meta meta) {
	this.meta = meta;
}

	
	
}
