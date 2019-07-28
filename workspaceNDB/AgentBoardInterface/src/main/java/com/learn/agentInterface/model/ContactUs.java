package com.learn.agentInterface.model;

public class ContactUs {
	private Integer mobileNumber;
	private String messageIssue;
	
	public ContactUs() {
		
	}
	
	public ContactUs(Integer mobileNumber, String messageIssue) {
		this.mobileNumber = mobileNumber;
		this.messageIssue = messageIssue;
	}

	public Integer getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getMessageIssue() {
		return messageIssue;
	}
	public void setMessageIssue(String messageIssue) {
		this.messageIssue = messageIssue;
	}

}
