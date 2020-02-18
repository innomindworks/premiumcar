package com.premiumcars.modal;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class SellCarDTO {

	private Integer carModelId;

	private Integer varientId;
	
	private String manufacturingYear;

	private Integer pastRunInKm;
	
	private BigDecimal expectedPrice;

	private Integer cityId;

	private Integer fuelEfficency;

	private String engineNumber;

	private String chesisNumber;

	private List<MultipartFile> carImage;
}
