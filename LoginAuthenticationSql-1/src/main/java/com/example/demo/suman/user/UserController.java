package com.example.demo.suman.user;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	
	
	@Autowired
	public UserService userService;
	
	@RequestMapping("/users")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}
	@RequestMapping("/users/{id}")
	public Optional<User> getUser(@PathVariable String id)
	{
		return userService.getUser(id);
	}
	@RequestMapping(method=RequestMethod.POST, value="/users")
	public void addUser(@RequestBody User u) {
		userService.addUser(u);
	}
	
	

}