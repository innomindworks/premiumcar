package com.premiumcars.utility;

import java.util.Random;

public class OTPUtility {

	public static String generateOTP() {
		Random obj = new Random(); 
	    char[] otp = new char[6]; 
	    for (int i=0; i<6; i++) 
	    { 
	      otp[i]= (char)(obj.nextInt(10)+48); 
	    } 

	    //System.out.println("OTP is "+ String.valueOf(otp));
	    return String.valueOf(otp);
	}
	
}
