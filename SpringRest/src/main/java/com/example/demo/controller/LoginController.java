package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.service.UserService;

@RestController
public class LoginController {
	
	@Autowired
	private UserService userService;
	@GetMapping("/login")
	public void loginUserGet(@RequestBody User object) {
		
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = {
			MimeTypeUtils.APPLICATION_JSON_VALUE }, headers = "Accept=application/json")
	public ResponseEntity<User> loginUserPost(@RequestBody User user) { 
		System.out.println("LoginPost");
		try {
			return new ResponseEntity<User>(userService.getUser(user.getEmailField(), user.getPasswordField()),
					HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
		}
	}
}
