package com.mycompant.meta;

public class OneTimePasscode extends Meta {

private String oneTimePassCode;

public String getOneTimePassCode() {
	return oneTimePassCode;
}

public void setOneTimePassCode(String oneTimePassCode) {
	this.oneTimePassCode = oneTimePassCode;
}


@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "OneTimePasscode=" + oneTimePassCode ;
	}

}
