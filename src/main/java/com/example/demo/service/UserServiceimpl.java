package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;

public class UserServiceimpl implements UserService	 {

	@Autowired
	UserRepo repo;
	
	@Override
	public void addUser(User u) {
		repo.save(u);
	}

	@Override
	public List<User> viewAllUser() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteUser(int id) {
		repo.deleteById(id);
		
	}

	@Override
	public void UpdateUser(User u) {
		repo.save(u);
		
	}

	@Override
	public User getByUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
