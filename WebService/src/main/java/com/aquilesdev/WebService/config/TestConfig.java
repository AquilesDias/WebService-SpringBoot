package com.aquilesdev.WebService.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aquilesdev.WebService.entities.Category;
import com.aquilesdev.WebService.entities.Order;
import com.aquilesdev.WebService.entities.User;
import com.aquilesdev.WebService.entities.enums.OrderStatus;
import com.aquilesdev.WebService.repository.CategoryRepository;
import com.aquilesdev.WebService.repository.OrderRepository;
import com.aquilesdev.WebService.repository.UserRepository;

@Profile("test")
@Configuration
public class TestConfig implements CommandLineRunner{
	 
	 @Autowired
     private UserRepository userRepository;
	 
	 @Autowired
	 private CategoryRepository categoryRepository;
	 
	 @Autowired
	 private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Lilia Gongalves", "lili@gmail.com", "8999999", "0123");
		User u2 = new User(null, "Heryka", "hery@gmail.com", "2222223", "01122");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.PAID, u1); //Padrão UTC
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.WAITING_PAYMENT, u1);
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
	}
	 
	 

}
