package com.bankapp;


import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bankapp.dto.AddressChangeRequest;
import com.bankapp.entities.AppUser;
import com.bankapp.entities.TransactionLog;
import com.bankapp.repository.TransactionLogRepo;
import com.bankapp.service.AccountService;
import com.bankapp.service.AppUserService;

@SpringBootApplication
public class Bankapp01Application implements CommandLineRunner {
	@Autowired
private AccountService accountService;
	private AppUserService appUserService;
	private TransactionLogRepo logRepo;
	public static void main(String[] args) {
		SpringApplication.run(Bankapp01Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		AppUser appUser=new AppUser("ram","ram123","admin","AP","KKD","9646563917","ram@g.com",LocalDate.of(2021, Month.JANUARY, 22));
		AppUser appUser2=new AppUser("kumar","ekta123","clerk","Vsp","A.L.Puram","2751898261","ska@g.com",LocalDate.of(1999, Month.AUGUST, 14));
		      appUserService.addAppUser(appUser);
		      appUserService.addAppUser(appUser2);
		/*Account account1=new Account("raj",1000,"saving","12 krishna nagar","delhi","455667788","r@gmail.com",LocalDate.of(1980, Month.NOVEMBER, 11));
		Account account2=new Account("Mdhavi",2000,"current","22 krishna nagar","Tirupathi","455667788","m@gmail.com",LocalDate.of(1998, Month.DECEMBER, 12));
	     accountService.save(account1);
	     accountService.save(account2);*/
		//accountService.transfer(1, 2, 50);
		
		//accountService.deposit(1, 100);
		//accountService.withdraw(2, 50);
		AddressChangeRequest addressChangeRequest=new AddressChangeRequest("Tirupathi", "Tirupathi","45436409", "madhavi@gmail.com");
		  List<TransactionLog>list=logRepo.findByFromAccount(1);
		   for(TransactionLog log:list) {
			   System.out.println(log);
		   }
		
		
	
	}

}
