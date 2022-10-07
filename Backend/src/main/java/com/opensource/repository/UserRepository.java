package com.opensource.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.opensource.model.User;

@Repository
public interface UserRepository extends JpaRepository <User, Integer> {
	
	public Optional<User> findByUsername(String username);
	public Optional<User> findByEmail(String email);
	
}
