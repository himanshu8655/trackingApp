package com.sambandh.trackingapp.dto;

import com.sambandh.trackingapp.utils.AppUtils.Role;

public class UserProfileDTO {

	private Long userId;

	private String name;

	private String phoneNumber;

	private String address;

	private Role role;
	
	public UserProfileDTO() {
		// TODO Auto-generated constructor stub
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public UserProfileDTO(Long userId, String name, String phoneNumber, String address, Role role) {
		this.userId = userId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.role = role;
	}
	
	
}
