package com.opensource.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.opensource.models.User;
import com.opensource.repositories.UserRepository;
import com.opensource.services.UserService;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
	
	@Mock
	private UserRepository uRepo;
	
	@InjectMocks
	private UserService uServ;
	
	@BeforeEach
	void setup() {
		
	}
	
	
	@Test
	void whenFindAllThenReturnAllUsers() throws Exception {
		List<User> users = new ArrayList<>();
		users.add(new User());
		users.add(new User());
		
		//when(uRepo.findAll()).thenReturn(users);
		
		
		
	}
}
