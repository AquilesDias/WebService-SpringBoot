package com.aquilesdev.WebService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aquilesdev.WebService.entities.Order;
import com.aquilesdev.WebService.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public Order findById(Long id) {
	  Optional<Order> obj = orderRepository.findById(id);
	  return obj.get();
	}
}
