package com.premiumcars.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;


@Entity
@Table(name="city")
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cityId;
	
	public City() {
		super();
	}
	
	public City(String cityName) {
		super();
		this.cityName = cityName;
	}

	private String state;
	private String cityName;
	
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
		
}
