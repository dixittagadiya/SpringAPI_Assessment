package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

public class UserCotroller {

	@Autowired
	UserService service;
	
	@PostMapping("/")
	public String addUser(@RequestBody User u)
	{
		service.addUser(u);
		return "User Added...";
	}
	
	@GetMapping("/")
	public List<User> ViewUser()
	{
		service.viewAllUser();
		List<User> user = service.viewAllUser();
		return user;
	}
	
	@DeleteMapping("/")
	public String deleteUser(@RequestParam("id")int id)
	{
		service.deleteUser(id);
		return null;
	}
	
	@PutMapping("/")
	public String UpdateUser(@RequestBody User u)
	{
		service.UpdateUser(u);
		return "User Updated...";
	}
}
