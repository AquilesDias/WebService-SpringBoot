package com.aquilesdev.WebService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aquilesdev.WebService.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
