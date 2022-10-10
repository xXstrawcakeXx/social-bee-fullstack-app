package com.opensource.services;

import java.util.List;
import java.util.Optional;

import com.opensource.models.User;
import com.opensource.repositories.UserRepository;

public class UserService {

	UserRepository uRepo;
	
	public UserService(UserRepository uRepo) {
		this.uRepo = uRepo;
	}
	
	public List<User> findAll() {
		return uRepo.findAll();
	}
	
	public Optional<User> findById(int userId) {
		return uRepo.findById(userId);
	}
	
	public Optional<User> findByUsername(String username) {
		return uRepo.findByUsername(username);
	}
	
	public Optional<User> findByEmail(String userEmail) {
		return uRepo.findByEmail(userEmail);
	}
	
	
	
	
	
	
}
