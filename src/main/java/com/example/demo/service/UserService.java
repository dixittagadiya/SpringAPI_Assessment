package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {

	public void addUser(User u);
	public List<User> viewAllUser();
	public void deleteUser(int id);
	public void UpdateUser(User u);
	public User getByUser(int id);
}
