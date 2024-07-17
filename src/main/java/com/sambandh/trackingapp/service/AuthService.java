package com.sambandh.trackingapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.sambandh.trackingapp.dto.LoginDTO;
import com.sambandh.trackingapp.dto.MessageDTO;
import com.sambandh.trackingapp.entity.User;
import com.sambandh.trackingapp.repository.UserRepository;

@Service
public class AuthService {

	@Autowired
	private UserRepository user_repo;

	public ResponseEntity<MessageDTO> login(LoginDTO login) {
		User user = user_repo.findByUsernameAndPassword(login.getUsername(), login.getPassword()).orElse(null);
		if (user == null)
			return getResponseEntity("Invalid Email Id, Password", HttpStatus.UNAUTHORIZED);
		return getResponseEntity("Login Successfully", HttpStatus.OK);
	}

	public ResponseEntity<MessageDTO> register(User user) {
		User user_db = user_repo.findByUsernameAndPassword(user.getUsername(), user.getPassword()).orElse(null);
		if (user_db != null)
			return getResponseEntity("User Already Registered", HttpStatus.UNAUTHORIZED);
		user_repo.save(user);
		return getResponseEntity("User registered successfully", HttpStatus.OK);
	}

	public ResponseEntity<MessageDTO> forgotPassword() {
		return getResponseEntity("Email reset link sent Successfully", HttpStatus.OK);
	}

	public static ResponseEntity<MessageDTO> getResponseEntity(String msg, HttpStatusCode code) {
		return new ResponseEntity<MessageDTO>(new MessageDTO(msg), code);
	}

}
