package com.aquilesdev.WebService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aquilesdev.WebService.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
