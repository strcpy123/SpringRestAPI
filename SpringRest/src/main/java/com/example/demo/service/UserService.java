package com.example.demo.service;

import com.example.demo.entities.User;

public interface UserService {
	public void Store(User user);
	public User getUser(String email, String password) ;
}
