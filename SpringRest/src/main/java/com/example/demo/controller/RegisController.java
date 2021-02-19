package com.example.demo.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.JsonPath;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.service.UserService;

@RestController
public class RegisController {

	@Autowired
	private UserService userService;
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public void helloBoy() {
//		System.out.println(userService.getUser("123@gmail.com", "12345"));
		System.out.println("Get");
//		return "{ \"method\" : \"guru.test\", \"params\" : [ \"jinu awad\" ], \"id\" : 123 }";
//		return "hello";
	}
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public void helloBoyPost(@RequestBody User object) {
//		System.out.println(userService.getUser("123@gmail.com", "12345"));
		System.out.println("Post");
		System.out.println(object);
//		return "{ \"method\" : \"guru.test\", \"params\" : [ \"jinu awad\" ], \"id\" : 123 }";
	}
	
//	@RequestMapping(value = "/finduser", method = RequestMethod.POST, produces = {
//			MimeTypeUtils.APPLICATION_JSON_VALUE }, headers = "Accept=application/json")
//	public ResponseEntity findUser(@RequestBody String object) {
//		System.out.println("Entered");
//		try {
//			return new ResponseEntity(object,
//					HttpStatus.OK);
//		} catch (Exception e) {
//			return new ResponseEntity(HttpStatus.BAD_REQUEST);
//		}
//	}
	@RequestMapping(value = "/userSignUp", method =  RequestMethod.GET)
	public void storeUserGET() {
		
	}
	@RequestMapping(value = "/userSignUp", method =  RequestMethod.POST)
	public void storeUserPOST(@RequestBody User object) {
		userService.Store(object);
//		System.out.println(object);
	}
}
