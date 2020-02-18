package com.premiumcars.controller;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.premiumcars.modal.UserDTO;
import com.premiumcars.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/generateOTP")
	public void generateOTP(@Valid @RequestBody UserDTO userDTO, HttpServletResponse response) {
		//Generate OTP
		userService.processOTP(userDTO.getMobileNum());
		response.setStatus(201); //Status Code 201 - Created
	}
	
	
	@PutMapping("/verifyOTP")
	public void validateOTP(@Valid @RequestBody UserDTO userDTO, HttpServletResponse response) {
		//Verify OPT
		response.setStatus(202); //Status Code 202 - Accepted
	}
}
