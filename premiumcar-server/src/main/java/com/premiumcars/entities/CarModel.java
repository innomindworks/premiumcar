package com.premiumcars.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="car_model")
public class CarModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer carModelId;
	
	private String carMaker;
	private String modelName;
	private String carType;
	
	@OneToMany(mappedBy = "carModel" , fetch = FetchType.LAZY)
	private List<Varient> varient;

	public Integer getCarModelId() {
		return carModelId;
	}

	public void setCarModelId(Integer carModelId) {
		this.carModelId = carModelId;
	}

	public String getCarMaker() {
		return carMaker;
	}

	public void setCarMaker(String carMaker) {
		this.carMaker = carMaker;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public List<Varient> getVarient() {
		return varient;
	}

	public void setVarient(List<Varient> varient) {
		this.varient = varient;
	}
	
}
