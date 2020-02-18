package com.premiumcars.entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="ownership")
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Ownership {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private Integer ownerId;
	
	private String ownerName;
	
    private String ownerType;
    
	public Ownership(String ownerType) {
		super();
		this.ownerType = ownerType;
	}
	
	public Ownership() {
		super();
	}
	
	public String getOwnerType() {
		return ownerType;
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public List<Car> getCar() {
		return car;
	}
	public void setCar(List<Car> car) {
		this.car = car;
	}
	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}
	private String ownerAddLin1;
	
	private String ownerAddLin2;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")
	private City city;
	
	@OneToMany(mappedBy = "owner",cascade = CascadeType.ALL)
	private List<Car> car;
	
	private String pinCode;
	
	public Integer getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public String getOwnerAddLin1() {
		return ownerAddLin1;
	}
	public void setOwnerAddLin1(String ownerAddLin1) {
		this.ownerAddLin1 = ownerAddLin1;
	}
	public String getOwnerAddLin2() {
		return ownerAddLin2;
	}
	public void setOwnerAddLin2(String ownerAddLin2) {
		this.ownerAddLin2 = ownerAddLin2;
	}
	
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	
}
