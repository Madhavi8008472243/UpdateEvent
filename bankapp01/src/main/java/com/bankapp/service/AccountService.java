package com.bankapp.service;

import java.util.List;

import com.bankapp.dto.AddressChangeRequest;
import com.bankapp.entities.Account;



public interface AccountService {
	public List<Account> getAllAccounts();
	public Account getAccountId(int id);
	public Account save(Account account);
	public Account delete(int accountId);
	public Account update(Account account);
	public Account transfer(int fromId, int toId, double amount);
	
	public Account changeAddress(int fromId,AddressChangeRequest request);
	public void deposit(int id,double amount);
	public void withdraw(int id,double amount);
	public Account addAccount(Account account);
	public Account findAccountById(int id);
	
	

	

}
