package com.event.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.dto.EventUser;
import com.event.repos.EventUserRepo;

@Service
@Transactional
public class EventUserServiceImpl implements EventUserService{

	private EventUserRepo userRepo;
	
	@Autowired
	public EventUserServiceImpl(EventUserRepo userRepo) {
		this.userRepo = userRepo;
	}

	@Override
	public EventUser addUser(EventUser users) {
		userRepo.save(users);
		return users;
	}

	@Override
	public EventUser findByUsername(String username) {
		return userRepo.findByUsername(username);
	}

}
