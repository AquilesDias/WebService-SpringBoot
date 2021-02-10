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
	private OrderRepository userRepository;
	
	public List<Order> findAll(){
		return userRepository.findAll();
	}
	
	public Order findById(Long id) {
	  Optional<Order> obj = userRepository.findById(id);
	  return obj.get();
	}
}
