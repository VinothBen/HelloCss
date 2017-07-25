package com.cts.vo;

import org.springframework.stereotype.Component;

@Component
public class LoginVo {

	
	private Long Id;

	private String Name;
	
	private String startDate;

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

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public LoginVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginVo(Long id, String name, String startDate) {
		super();
		Id = id;
		Name = name;
		this.startDate = startDate;
	}

}
