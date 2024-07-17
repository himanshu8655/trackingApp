package com.sambandh.trackingapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import com.sambandh.trackingapp.dto.MessageDTO;
import com.sambandh.trackingapp.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUsernameAndPassword(String username, String password);

}
