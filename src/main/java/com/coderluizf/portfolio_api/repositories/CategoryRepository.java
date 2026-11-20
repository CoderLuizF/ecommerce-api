package com.coderluizf.portfolio_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderluizf.portfolio_api.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
