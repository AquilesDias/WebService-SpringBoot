package com.aquilesdev.WebService.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aquilesdev.WebService.entities.User;
import com.aquilesdev.WebService.service.UserService;

@RestController
@RequestMapping(path="/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);	
	}

	@GetMapping(path="/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		 User obj = service.findById(id);
		 return ResponseEntity.ok().body(obj);
	}
}
