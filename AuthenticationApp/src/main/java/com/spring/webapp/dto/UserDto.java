package com.spring.webapp.dto;

import java.sql.Date;

import com.spring.webapp.model.User;

import lombok.Data;


@Data
public class UserDto {

	
	private String username;

	private String password;

	private String passwordConfirm;
	
	private boolean enabled;

	private String email;

	private Date birthday;

	private int sex;

	public UserDto() {
		
	}
	
	public UserDto(User user) {
		this.username = user.getUsername();
		this.password = user.getPassword();
		this.enabled = user.isEnabled();
		this.email = user.getEmail();
		this.birthday = user.getBirthday();
		this.sex = user.getSex();
	}
}
