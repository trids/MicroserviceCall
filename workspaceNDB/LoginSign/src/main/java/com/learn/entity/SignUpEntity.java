package com.learn.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SIGNUP")
public class SignUpEntity implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="NAME")
	private String name;
	@Id
	@Column(name="MOBILENUMBER")
	private Integer mobileNumber;
	@Column(name="EMAILID")
	private String emailId;
	@Column(name="PASSWORD", nullable=false)
	private String password;
	
	public SignUpEntity() {
		
	}
	
	public SignUpEntity(String name, Integer mobileNumber, String emailId, String password) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.password = password;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public Integer getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
