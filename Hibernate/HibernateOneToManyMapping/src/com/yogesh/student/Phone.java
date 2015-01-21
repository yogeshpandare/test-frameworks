package com.yogesh.student;

public class Phone implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7651520399883389527L;
	private long phoneId;
	private String phoneType;
	private String phoneNumber;

	public Phone() {
	}

	public Phone(String phoneType, String phoneNumber) {
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
	}
	
	public long getPhoneId() {
		return this.phoneId;
	}

	public void setPhoneId(long phoneId) {
		this.phoneId = phoneId;
	}

	public String getPhoneType() {
		return this.phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}

