package com.bankapp.controller;

import java.util.List;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.entities.Account;
import com.bankapp.service.AccountService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class AccountRestController {
   private AccountService accountService;

public AccountRestController(AccountService accountService) {
	this.accountService = accountService;
}
//http://localhost:8090/bankapp/account
	@GetMapping(path = "account", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Account> allAccounts(){
		List<Account> accounts=accountService.getAllAccounts();
		return accounts;
	}
	
	//http://localhost:8090/bankapp/account/1
	@GetMapping(path = "account/{accountId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Account getAnAccount(@PathVariable(name = "accountId") int id){
		Account account=accountService.findAccountById(id);
		return account;
	}
	 
	@PostMapping(path="account", 
			produces = MediaType.APPLICATION_JSON_VALUE, 
			consumes =MediaType.APPLICATION_JSON_VALUE )
	public Account addAccount( @RequestBody Account account) {
		Account acc=accountService.addAccount(account);
		return acc;
	}
	
	@PutMapping(path="account/{accountId}", 
			produces = MediaType.APPLICATION_JSON_VALUE, 
			consumes =MediaType.APPLICATION_JSON_VALUE )
	public Account updateAccount(@PathVariable(name = "accountId") int id,
			@RequestBody Account account) {
		Account acc=accountService.update(account);
		return acc;
	}

	@DeleteMapping(path = "account/{accountId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Account deleteAnAccount(@PathVariable(name = "accountId") int id){
		Account account=accountService.delete(id);
		return account;
	}
	
}
