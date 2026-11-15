package com.coderluizf.portfolio_api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.coderluizf.portfolio_api.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private UserRepository userRepository;
}
