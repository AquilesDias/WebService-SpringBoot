package com.aquilesdev.WebService.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aquilesdev.WebService.entities.User;

@RestController
@RequestMapping(path="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Barbara Alves", "verdeOlho@gmail.com", "111111", "321654");
        return ResponseEntity.ok().body(u);	
	}

}
