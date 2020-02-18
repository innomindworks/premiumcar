package com.premiumcars.modal;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

	private String userName;
	private String mobileNum;
	private String mobileOTP;
	private String email;
	private String emailOTP;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String getMobileOTP() {
		return mobileOTP;
	}
	private void setMobileOTP(String mobileOTP) {
		this.mobileOTP = mobileOTP;
	}
	private String getEmailOTP() {
		return emailOTP;
	}
	private void setEmailOTP(String emailOTP) {
		this.emailOTP = emailOTP;
	}
	
	
}
