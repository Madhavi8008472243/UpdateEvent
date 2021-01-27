package com.bankapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor

public class AddressChangeRequest {
	private String address;
	   private String city;
	   private String phone;
	   private String email;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public AddressChangeRequest(String address, String city, String phone, String email) {
		super();
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.email = email;
	}
	
	   
}
