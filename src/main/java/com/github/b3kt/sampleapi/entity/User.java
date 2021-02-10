package com.github.b3kt.sampleapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
public class User extends BaseEntity {
	
	@Column(length = 32, name = "username")
	@Setter @Getter
	private String username;
	
	@Column(length = 64, name = "full_name")
	@Setter @Getter
	private String fullname;
	
	@Column(length = 64, name = "email")
	@Setter @Getter
	private String email;
    
}
