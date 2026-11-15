package com.coderluizf.portfolio_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderluizf.portfolio_api.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
