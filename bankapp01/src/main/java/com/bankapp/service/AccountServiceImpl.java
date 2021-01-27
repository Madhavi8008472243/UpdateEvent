package com.bankapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.dto.AddressChangeRequest;
import com.bankapp.entities.Account;
import com.bankapp.entities.TransactionLog;
import com.bankapp.exceptions.ResourceNotFoundException;
import com.bankapp.repository.AccountRepo;
import com.bankapp.repository.TransactionLogRepo;
@Service
@Transactional
public class AccountServiceImpl implements AccountService{

private AccountRepo accountRepo;
private TransactionLogRepo transactionLogRepo;
private int toid;

      @Autowired
	public AccountServiceImpl(AccountRepo accountRepo, TransactionLogRepo transactionLogRepo) {
	this.accountRepo = accountRepo;
	this.transactionLogRepo = transactionLogRepo;
}

	@Override
	public List<Account> getAllAccounts() {
		return accountRepo.findAll();
		
	}

	@Override
	public Account getAccountId(int id) {
		return  accountRepo.findById(id).
				orElseThrow(()-> new ResourceNotFoundException("account with id "+ id + "not found"));
		
		
	}

	@Override
	public Account save(Account account) {
		accountRepo.save(account);
		return null;
	}

	@Override
	public Account delete(int accountId) {
		Account accountToDelaAccount=getAccountId(toid);
		System.out.println("--------");
		accountRepo.delete(accountToDelaAccount);
		
		return accountToDelaAccount;
	}

	@Override
	public Account update(Account account) {
		
		return account;
	}

	@Override
	public Account transfer(int fromId, int toId, double amount) {
		Account fromAcc=getAccountId(fromId);
		Account toAcc=getAccountId(toId);
		fromAcc.setBalance(toAcc.getBalance()-amount);
		toAcc.setBalance(toAcc.getBalance()+amount);
		TransactionLog fromAccLog=new TransactionLog("withdraw",fromId,toId,"withdraw");
		fromAcc.getTransactionLogs().add(fromAccLog);
		
		TransactionLog toAccLog=new TransactionLog("deposite",fromId,toId,"deposite");
		toAcc.getTransactionLogs().add(toAccLog);
		accountRepo.save(fromAcc);
		accountRepo.save(toAcc);
		return null;
	}

	@Override
	public Account changeAddress(int fromId, AddressChangeRequest request) {
		Account accountToUpdate=getAccountId(toid);
		accountToUpdate.setAddress(request.getAddress());
		accountToUpdate.setCity(request.getCity());
		accountToUpdate.setPhone(request.getPhone());
		accountToUpdate.setEmail(request.getEmail());
		
		accountRepo.save(accountToUpdate);
		
		
		return  accountToUpdate;
		
	}

	@Override
	public void deposit(int id, double amount) {
		Account toDeposit=getAccountId(id);
		toDeposit.setBalance((toDeposit).getBalance()+amount);
		TransactionLog accLog=new TransactionLog("deposite",id,0,"deposit");
		toDeposit.getTransactionLogs().add(accLog);
		accountRepo.save(toDeposit);
		
		
	}

	@Override
	public void withdraw(int id, double amount) {
		
		Account toWithdraw=getAccountId(id);
		toWithdraw.setBalance(toWithdraw.getBalance()+amount);
		
		TransactionLog accLog=new TransactionLog("withdraw",id,0,"withdraw");
		toWithdraw.getTransactionLogs().add(accLog);
		accountRepo.save(toWithdraw);
	}

	@Override
	public Account addAccount(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account findAccountById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
