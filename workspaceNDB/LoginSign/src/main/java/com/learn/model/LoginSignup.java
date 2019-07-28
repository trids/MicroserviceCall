package com.learn.model;

public class LoginSignup {
	private Integer mobileNumber;
	private String name;
	private String password;
	private String emailId;
	
	public LoginSignup(Integer mobileNumber, String name, String password, String emailId) {
		super();
		this.mobileNumber = mobileNumber;
		this.name = name;
		this.password = password;
		this.emailId = emailId;
	}
	
	public LoginSignup() {
		
	}
	public Integer getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
