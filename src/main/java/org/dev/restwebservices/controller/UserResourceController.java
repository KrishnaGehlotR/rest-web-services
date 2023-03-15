package org.dev.restwebservices.controller;

import java.util.List;

import org.dev.restwebservices.entity.User;
import org.dev.restwebservices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResourceController {
	
	@Autowired
	UserService userService;

	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return userService.findAll();
	}
}
