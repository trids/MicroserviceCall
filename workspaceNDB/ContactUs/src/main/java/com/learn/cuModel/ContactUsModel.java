package com.learn.cuModel;

import org.springframework.beans.factory.annotation.Qualifier;


public class ContactUsModel {
	private Integer mobileNumber;
	private String messageIssue;
	
	public ContactUsModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContactUsModel(Integer mobileNumber, String messageIssue) {
		super();
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
