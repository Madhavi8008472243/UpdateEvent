package com.bankapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.entities.AppUser;
import com.bankapp.exceptions.ResourceNotFoundException;
import com.bankapp.repository.AppUserRepo;




@Service
@Transactional
public class AppUserServiceImpl implements AppUserService{
	private AppUserRepo appUserRepo;
	
	@Autowired
	public AppUserServiceImpl(AppUserRepo userRepo) {
		this.appUserRepo = appUserRepo;
	}
	@Override
	public List<AppUser>getAll() {
		
		return appUserRepo.findAll();
	}

	@Override
	public AppUser addAppUser(AppUser appUser) {
		appUserRepo.save(appUser);
		return appUser;
	}

	@Override
	public AppUser delete(int id) {
		AppUser appUser=appUserRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("user with id:"+ id +"is not found"));
		appUserRepo.delete(appUser);
		return appUser;
	}

	@Override
	public AppUser findByName(String name) {
		
		return appUserRepo.findByName(name);
	}


	
 }
