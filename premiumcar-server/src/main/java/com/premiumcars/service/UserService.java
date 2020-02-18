package com.premiumcars.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.premiumcars.utility.OTPUtility;

@Service
public class UserService {

	public String processOTP(String mobileNum) {
		String otp = OTPUtility.generateOTP();
		return this.sendOTP(mobileNum, otp);
		//return null;
	}
	
	public String sendOTP(String mobileNum, String otp) {
		//Send OTP via SMS
		return "SUCCESS";
	}
}
