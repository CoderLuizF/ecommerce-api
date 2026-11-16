package com.coderluizf.portfolio_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderluizf.portfolio_api.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
