package com.cts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account_holders")
public class RegistrationEntity {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long accountNumber;
	@Column
	private String name;
	@Column
	private String sex;
	@Column
	private Long mobileno;
	@Column
	private String country;
	@Column
	private String state;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Long getMobileno() {
		return mobileno;
	}
	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public RegistrationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public RegistrationEntity(Long accountNumber, String name, String sex, Long mobileno, String country,
			String state) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.sex = sex;
		this.mobileno = mobileno;
		this.country = country;
		this.state = state;
	}

	
}
