package com.opensource.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.opensource.models.User;

@Repository
public interface UserRepository extends JpaRepository <User, Integer> {
	
	public Optional<User> findByUsername(String username);
	public Optional<User> findByEmail(String email);
	
}
