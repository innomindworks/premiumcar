package com.premiumcars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.premiumcars.modal.ApplicationResponse;
import com.premiumcars.modal.DropDownlist;
import com.premiumcars.service.CarModelService;

@RestController
@RequestMapping("carmodels")
public class CarModelController {

	@Autowired
	private CarModelService carModelService;
	
	
	@GetMapping("/dropdowns")
	public DropDownlist getDropDownList() {
		return carModelService.getDropDownList();
	}

}
