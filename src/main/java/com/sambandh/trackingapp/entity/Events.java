package com.sambandh.trackingapp.entity;

import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Events {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long eventId;
	
	private LocalDateTime date;
	
	private String location;
	
	private String description;
	
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User createdBy;
    

	
	private Events() {
		// TODO Auto-generated constructor stub
	}

	private Events(LocalDateTime date, String location, String description, User createdBy) {
		this.date = date;
		this.location = location;
		this.description = description;
		this.createdBy = createdBy;
	}

	
	private Long getEventId() {
		return eventId;
	}

	private LocalDateTime getDate() {
		return date;
	}

	private void setDate(LocalDateTime date) {
		this.date = date;
	}

	private String getLocation() {
		return location;
	}

	private void setLocation(String location) {
		this.location = location;
	}

	private String getDescription() {
		return description;
	}

	private void setDescription(String description) {
		this.description = description;
	}

	private User getCreatedBy() {
		return createdBy;
	}

	private void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

}
