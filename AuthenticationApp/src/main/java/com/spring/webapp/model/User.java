package com.spring.webapp.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.hibernate.validator.constraints.Length;

import com.spring.webapp.dto.UserDto;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "username")
    @NotEmpty(message = "*Please provide your name")
	private String username;

	@Column(name = "password", nullable = false)
    @Length(min = 5, message = "*Your password must have at least 5 characters")
    @NotEmpty(message = "*Please provide your password")
	private String password;

	@Column(name = "enabled", nullable = false)
	private boolean enabled;

	@Column(name = "email")
    @Email(message = "*Please provide a valid Email")
    @NotEmpty(message = "*Please provide an email")
	private String email;

	@Column
    @NotEmpty(message = "*Please provide an birthday")
	private Date birthday;

	@Column
    @NotEmpty(message = "*Please provide your sex")
	private int sex;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "user", cascade = CascadeType.ALL)
	private Set<Authorities> authorities = new HashSet<Authorities>();

	public void setAuthorities(Set<Authorities> authorities) {
		this.authorities = authorities;
	}

	public User(UserDto userDto) {
		super();
		this.username = userDto.getUsername();
		this.password = userDto.getPassword();
		this.enabled = userDto.isEnabled();
		this.email = userDto.getEmail();
		this.birthday = userDto.getBirthday();
		this.sex = userDto.getSex();
	}
}