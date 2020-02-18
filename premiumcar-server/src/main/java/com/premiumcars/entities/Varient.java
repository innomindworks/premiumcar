package com.premiumcars.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="varient")
public class Varient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer varientId;
	
	private String varientName;
	private String transmissionType;
	private String fuelType;
	
	@OneToMany(mappedBy = "varient", fetch = FetchType.LAZY)
	private List<Specification> spec;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private CarModel carModel;
}
