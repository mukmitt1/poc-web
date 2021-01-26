package com.mycompany.controller;

import java.util.List;

public class Preferences {

	private String language;
	private List<String> notificationType;
	private String locale;
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public List<String> getNotificationType() {
		return notificationType;
	}
	public void setNotificationType(List<String> notificationType) {
		this.notificationType = notificationType;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Preferences [" + "language=" + language +"]" ;
	}
}
