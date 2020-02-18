package com.premiumcars.modal;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class DropDown {

	private String key;
	private String value;
	private List<DropDown> data;
	
	public DropDown() {
		super();
	}
	public String getKey() {
		return key;
	}
	public DropDown(String value) {
		super();
		this.value = value;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public List<DropDown> getData() {
		return data;
	}
	public void setData(List<DropDown> data) {
		this.data = data;
	}
	
	
	
	
}
