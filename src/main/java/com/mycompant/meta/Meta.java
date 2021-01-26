package com.mycompant.meta;

public class Meta {

	private String alertType;

	//OTP
	private String oneTimePassCode;
	
	//Statement
	private String statementDate;
	private String statementBalance;
	private String paymentDueDate;
	private String minPaymentDue;

	
	//Add Payor
	private String currency;
	private String payorSource;
	private String payorAccount;
	private String payorType;

	
	//Online Purchase
	private String purchaseAmount;
	private String purchaseDate;
	private String merchantName;
	private String merchantCountryCode;

	//
	
	public String getAlertType() {
		return alertType;
	}

	public void setAlertType(String alertType) {
		this.alertType = alertType;
	}
	
	
	public String getOneTimePassCode() {
		return oneTimePassCode;
	}

	public void setOneTimePassCode(String oneTimePassCode) {
		this.oneTimePassCode = oneTimePassCode;
	}

	
	
	public String getStatementDate() {
		return statementDate;
	}

	public void setStatementDate(String statementDate) {
		this.statementDate = statementDate;
	}

	public String getStatementBalance() {
		return statementBalance;
	}

	public void setStatementBalance(String statementBalance) {
		this.statementBalance = statementBalance;
	}

	public String getPaymentDueDate() {
		return paymentDueDate;
	}

	public void setPaymentDueDate(String paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}

	public String getMinPaymentDue() {
		return minPaymentDue;
	}

	public void setMinPaymentDue(String minPaymentDue) {
		this.minPaymentDue = minPaymentDue;
	}

	
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPayorSource() {
		return payorSource;
	}

	public void setPayorSource(String payorSource) {
		this.payorSource = payorSource;
	}

	public String getPayorAccount() {
		return payorAccount;
	}

	public void setPayorAccount(String payorAccount) {
		this.payorAccount = payorAccount;
	}

	public String getPayorType() {
		return payorType;
	}

	public void setPayorType(String payorType) {
		this.payorType = payorType;
	}

	public String getPurchaseAmount() {
		return purchaseAmount;
	}

	public void setPurchaseAmount(String purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantCountryCode() {
		return merchantCountryCode;
	}

	public void setMerchantCountryCode(String merchantCountryCode) {
		this.merchantCountryCode = merchantCountryCode;
	}

	@Override
	public String toString() {
		
		String alertMessage=null;

		if (alertType.equals("ONE_TIME_PASSOCDE")){
			alertMessage=", oneTimePassCode="+oneTimePassCode;
		}
		else if (alertType.equals("STMT_AVAILABILITY")){
			alertMessage=", statementDate="+statementDate + ", statementBalance=" + statementBalance
					+ ", paymentDueDate=" + paymentDueDate 
			+ ", minPaymentDue=" + minPaymentDue ;
		}
		else if (alertType.equals("ADD_PAYOR")) {
			alertMessage=", currency="+currency + ", payorSource=" + payorSource
					+ ", payorAccount=" + payorAccount 
			+ ", payorType=" + payorType ;
			
		}else if (alertType.equals("ONLINE_PURCHASE")) {
			alertMessage=", purchaseAmount="+purchaseAmount + ", purchaseDate=" + purchaseDate
					+ ", merchantName=" + merchantName 
			+ ", merchantCountryCode=" + merchantCountryCode ;
		}
		
		// TODO Auto-generated method stub
		return "BaseAlert [alertType=" + alertType + alertMessage +"]";
	}
	
	
}
