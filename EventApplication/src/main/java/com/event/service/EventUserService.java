package com.event.service;

import com.event.dto.EventUser;

public interface EventUserService {
	
	public EventUser addUser(EventUser users);
	public EventUser findByUsername(String username);

}
