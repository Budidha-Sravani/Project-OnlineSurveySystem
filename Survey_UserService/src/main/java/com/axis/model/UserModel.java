package com.axis.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class UserModel {
	
	@Id
	private Integer id;
	private String fristName;
	private String lastName;
	private String email;
	
	
	public UserModel(Integer id, String fristName, String lastName, String email) {
		super();
		this.id = id;
		this.fristName = fristName;
		this.lastName = lastName;
		this.email = email;
	}
	
	
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}