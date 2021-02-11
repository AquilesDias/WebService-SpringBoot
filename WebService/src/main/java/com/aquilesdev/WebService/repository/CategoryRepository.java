package com.aquilesdev.WebService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aquilesdev.WebService.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
