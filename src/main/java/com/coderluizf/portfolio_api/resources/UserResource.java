package com.coderluizf.portfolio_api.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderluizf.portfolio_api.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Luiz", "luiz@gmail.com", "21990367697", "12345");
		return ResponseEntity.ok().body(u);
	}
}
