package com.event;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.event.dto.Event;
import com.event.dto.EventUser;
import com.event.service.EventService;
import com.event.service.EventUserService;

@Component
public class DataIntilizer implements CommandLineRunner{

	@Autowired
	private EventService eService;
	
	@Autowired
	private EventUserService userService;
	@Override
	public void run(String... args) throws Exception {

		
//		Event event1=new Event("Dancing", "Chennai", 500.00, LocalDate.of(2021,Month.JANUARY,13), 20, 15);
//		Event event2=new Event("Singing", "Hyderabad", 300.00, LocalDate.of(2021,Month.JANUARY,26), 15, 10);
//		Event event3=new Event("Drawing", "Delhi", 530.00, LocalDate.of(2021,Month.FEBRUARY,13), 30, 17);
//		Event event4=new Event("Sports", "Bangloree", 700.00, LocalDate.of(2021,Month.MARCH,28), 05, 35);
//		Event event5=new Event("Cooking", "Delhi", 550.00, LocalDate.of(2021,Month.APRIL,11), 40, 18);
//		
//		eService.addEvent(event1);
//		eService.addEvent(event2);
//		eService.addEvent(event3);
//		eService.addEvent(event4);
//		eService.addEvent(event5);
		
		
//		EventUser users1=new EventUser("Raj","Raj123",Arrays.asList("ROLE_ADMIN"));
//		
//		EventUser users2=new EventUser("ekta","ekta123",Arrays.asList("ROLE_CLERK"));
//		
//		userService.addUser(users1);
//		userService.addUser(users2);
	}

}
