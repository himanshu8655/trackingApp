package com.sambandh.trackingapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sambandh.trackingapp.dto.MessageDTO;
import com.sambandh.trackingapp.dto.UserProfileDTO;
import com.sambandh.trackingapp.entity.User;
import com.sambandh.trackingapp.repository.UserRepository;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class UserService {

	@Autowired
	private UserRepository user_repo;
	
	public User fetchUser(HttpRequest req) {
		User user = user_repo.findById(1L).orElse(null);
				return user;
	}

	public ResponseEntity<MessageDTO> updateProfile(UserProfileDTO userDTO) {
		User user_db = user_repo.findById(userDTO.getUserId()).orElse(null);
		User user = getUserFromDTO(userDTO,user_db);
		user_repo.save(user);
		return getResponseEntity("Profile Updated Successfully", HttpStatus.OK);
	}
	

	private static User getUserFromDTO(UserProfileDTO user,User user_db) {
		user_db.setAddress(user.getAddress());
		user_db.setName(user.getName());
		user_db.setPhoneNumber(user.getPhoneNumber());
		return user_db;
	}

	public static ResponseEntity<MessageDTO> getResponseEntity(String msg, HttpStatusCode code) {
		return new ResponseEntity<MessageDTO>(new MessageDTO(msg), code);
	}
}
