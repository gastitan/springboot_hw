package com.gastitan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

	@Id
	private long idValue;
	
	@Column(name="name")
	private String name;

	public long getIdValue() {
		return idValue;
	}

	public void setIdValue(long idValue) {
		this.idValue = idValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
