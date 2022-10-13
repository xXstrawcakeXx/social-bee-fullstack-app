package com.opensource.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@CrossOrigin (origins= {"http://localhost:8080"})
public class UserController {
	
//	UserService uServ;
//	
//	public UserController (UserService uServ) {
//		this.uServ = uServ;
//	}
	
}
