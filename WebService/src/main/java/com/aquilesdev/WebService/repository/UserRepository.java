package com.aquilesdev.WebService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aquilesdev.WebService.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
