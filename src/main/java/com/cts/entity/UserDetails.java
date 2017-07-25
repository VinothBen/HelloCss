package com.cts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class UserDetails {
    @Id
    @Column
	private Long id;
	@Column
	private String Name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public UserDetails(Long id, String name) {
		super();
		this.id = id;
		Name = name;
	}

	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

}
