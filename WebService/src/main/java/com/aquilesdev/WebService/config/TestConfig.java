package com.aquilesdev.WebService.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aquilesdev.WebService.entities.User;
import com.aquilesdev.WebService.repository.UserRepository;

@Profile("test")
@Configuration
public class TestConfig implements CommandLineRunner{
	
	 @Autowired
     private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Lilia Gongalves", "lili@gmail.com", "8999999", "0123");
		User u2 = new User(null, "Heryka", "hery@gmail.com", "2222223", "01122");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	 
	 

}
