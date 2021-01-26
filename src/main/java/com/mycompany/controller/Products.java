package com.mycompany.controller;

public class Products {

	private String cpc;
	private String tpc;
	private String providerId1;
	private String providerId2;
	private String providerId3;
	public String getCpc() {
		return cpc;
	}
	public void setCpc(String cpc) {
		this.cpc = cpc;
	}
	public String getTpc() {
		return tpc;
	}
	public void setTpc(String tpc) {
		this.tpc = tpc;
	}
	public String getProviderId1() {
		return providerId1;
	}
	public void setProviderId1(String providerId1) {
		this.providerId1 = providerId1;
	}
	public String getProviderId2() {
		return providerId2;
	}
	public void setProviderId2(String providerId2) {
		this.providerId2 = providerId2;
	}
	public String getProviderId3() {
		return providerId3;
	}
	public void setProviderId3(String providerId3) {
		this.providerId3 = providerId3;
	}
	
	@Override
	public String toString() {
		return "Products [cpc="+cpc+", tpc="+tpc+", providerId1=" + providerId1 
				+", providerId2=" + providerId2 +", providerId3=" + providerId3 + "]"; 
	}
	
}
