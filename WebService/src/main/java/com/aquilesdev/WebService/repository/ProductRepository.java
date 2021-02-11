package com.aquilesdev.WebService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aquilesdev.WebService.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
