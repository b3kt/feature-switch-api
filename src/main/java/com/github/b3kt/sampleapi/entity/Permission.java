package com.github.b3kt.sampleapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity
@Table(name = "permissions")
public class Permission extends BaseEntity {
	
	@OneToOne(fetch = FetchType.LAZY)
	@Setter @Getter
	private User user;
	
	@OneToOne(fetch = FetchType.LAZY)
	@Setter @Getter
	private Feature feature;
	
	@Column(name = "can_access")
	@Setter @Getter
	private Boolean canAccess;
}
