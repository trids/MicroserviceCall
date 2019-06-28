package com.learn.cuEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONTACTUS")
public class ContactUsEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="MOBILENUMBER")
	private Integer mobileNumber;
	@Column(name="MESSAGEISSUE")
	private String messageIssue;
	
	public ContactUsEntity() {
		super();
		// TODO Auto-generated constructor stub
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
