package com.premiumcars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premiumcars.repository.CarRepository;

@Service
public class CarService {

	@Autowired
	private CarRepository carRepository;
	

}
