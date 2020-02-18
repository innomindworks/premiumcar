package com.premiumcars.modal;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.premiumcars.entities.City;
import com.premiumcars.entities.Ownership;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class DropDownlist {

	private List<DropDown> carModelsList;
	private List<City> cities;
	private List<Ownership> ownership;
	
	public List<City> getCities() {
		return cities;
	}
	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	public List<Ownership> getOwnership() {
		return ownership;
	}
	public void setOwnership(List<Ownership> ownership) {
		this.ownership = ownership;
	}
	public List<DropDown> getCarModelsList() {
		return carModelsList;
	}
	public void setCarModelsList(List<DropDown> carModelsList) {
		this.carModelsList = carModelsList;
	}
	
}
