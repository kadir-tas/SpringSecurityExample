package com.spring.webapp.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.spring.webapp.dto.UserRegistrationDto;
import com.spring.webapp.model.User;

public interface UserService extends UserDetailsService {
	
	public User findByUsername(String username);

    public User save(UserRegistrationDto registration);
	
	
}
