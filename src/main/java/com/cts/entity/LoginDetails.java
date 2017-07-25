package com.cts.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

import java.util.Date;

import javax.persistence.Column;

@Entity
@Table(name = "login_details")
public class LoginDetails {

	@Id
	@Column
	private Long Id;
	@Column
	private String Name;
	@Column
	private Date startDate; 

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}

	public LoginDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginDetails(Long id, String name, Date startDate) {
		super();
		Id = id;
		Name = name;
		this.startDate = startDate;
	}

}
