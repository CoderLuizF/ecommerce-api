package com.coderluizf.portfolio_api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.coderluizf.portfolio_api.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	
}
