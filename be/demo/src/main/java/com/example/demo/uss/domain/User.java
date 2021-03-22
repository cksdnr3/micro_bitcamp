package com.example.demo.uss.domain;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "user_no")
	private long userNo;

	@Column(name = "name")
	private String name;

	// spring security에서 이미 결정된 이름
	@Column(name = "password")
	private String password;

	// spring security에서 이미 결정된 이름
	@Column(name = "username")
	private String username;

	@Column(name = "email")
	private String email;

	@Column(name = "birthday")
	private String birthday;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "regdate")
	private String regdate;
}
