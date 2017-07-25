package com.cts.vo;

import org.springframework.stereotype.Component;

@Component
public class RegistrationUserVo {

	private String name;
	private String sex;
	private Long mobileno;
	private String country;
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

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public RegistrationUserVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegistrationUserVo(String name, String sex, Long mobileno, String country, String state) {
		super();
		this.name = name;
		this.sex = sex;
		this.mobileno = mobileno;
		this.country = country;
		this.state = state;
	}
	
}
