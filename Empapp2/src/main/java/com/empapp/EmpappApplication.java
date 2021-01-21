package com.empapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import com.empapp.model.dao.Employee;
import com.empapp.model.service.EmployeeService;

@EnableWebSecurity
@SpringBootApplication
public class EmpappApplication implements CommandLineRunner{

	@Autowired
	private EmployeeService empService;
	
	public static void main(String[] args) {
		SpringApplication.run(EmpappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	/*	System.out.println("rec are saved...");
		empService.save(new Employee("Madhavi", 23));
		empService.save(new Employee("Raj", 10));
		empService.save(new Employee("Gunika", 20));
		empService.save(new Employee("Ekta", 15));		
	}*/
}
}
