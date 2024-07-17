package com.sambandh.trackingapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class EventAttendies {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long attendanceId;

	@ManyToOne
	@JoinColumn(name = "event_id")
	private Events event;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	public EventAttendies() {
		// TODO Auto-generated constructor stub
	}

	public EventAttendies(Long attendanceId, Events event, User user) {
		super();
		this.attendanceId = attendanceId;
		this.event = event;
		this.user = user;
	}

	public Long getAttendanceId() {
		return attendanceId;
	}

	public void setAttendanceId(Long attendanceId) {
		this.attendanceId = attendanceId;
	}

	public Events getEvent() {
		return event;
	}

	public void setEvent(Events event) {
		this.event = event;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
