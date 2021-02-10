package com.github.b3kt.sampleapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "features")
public class Feature extends BaseEntity {
	
	

	@Column(name = "name", length = 64)
	@Setter @Getter
	private String name;

	@Column(name = "description", length = 255)
	@Setter @Getter
	private String description;

}
