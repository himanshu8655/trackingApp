package com.sambandh.trackingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sambandh.trackingapp.dto.MessageDTO;
import com.sambandh.trackingapp.dto.UserProfileDTO;
import com.sambandh.trackingapp.entity.User;
import com.sambandh.trackingapp.repository.UserRepository;
import com.sambandh.trackingapp.service.UserService;

@RequestMapping("/api")
@RestController
public class UserController {
	@Autowired
	private UserService user_service;
	
	@GetMapping("/profile")
	private User getProfile(HttpRequest req) {
		return user_service.fetchUser(req);
	}
	
	@PostMapping("/profile")
	private ResponseEntity<MessageDTO> updateProfile(UserProfileDTO userDTO){
		return user_service.updateProfile(userDTO);
	}
}
