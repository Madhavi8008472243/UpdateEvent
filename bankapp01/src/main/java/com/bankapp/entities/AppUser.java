package com.bankapp.entities;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="app_user_Table")
public class AppUser {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	   private String name;
	   private String address;
	   private String profile;
	   private String city;
	   private String phone;
	   private String email;
	   private String password;
	   private LocalDate dob;
	public AppUser(String name, String address, String profile, String city, String phone, String email,
			String password, LocalDate dob) {
		super();
		this.name = name;
		this.address = address;
		this.profile = profile;
		this.city = city;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.dob = dob;
	}
	
	

}
