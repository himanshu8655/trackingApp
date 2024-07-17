package com.sambandh.trackingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sambandh.trackingapp.dto.LoginDTO;
import com.sambandh.trackingapp.dto.MessageDTO;
import com.sambandh.trackingapp.entity.User;
import com.sambandh.trackingapp.service.AuthService;

@RequestMapping("/api/auth")
@RestController
public class AuthenticationController {
	
	@Autowired
	private AuthService auth_service;
	
	@PostMapping("/login")
	private ResponseEntity<MessageDTO> login(@RequestBody LoginDTO login){
		return auth_service.login(login);
	}
	
	@PostMapping("/register")
	public ResponseEntity<MessageDTO> register(User user){
		return auth_service.register(user);
	}
	
	@GetMapping("/forgotPassword")
	public ResponseEntity<MessageDTO> forgotPassword(){
		return auth_service.forgotPassword();
	}
}
