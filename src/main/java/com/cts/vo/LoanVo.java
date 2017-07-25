package com.cts.vo;

public class LoanVo {
	
	private String name;
	private String emailid;
	private Long mobileno;
	private String state;
	private String country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public Long getMobileno() {
		return mobileno;
	}
	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public LoanVo(String name, String emailid, Long mobileno, String state, String country) {
		super();
		this.name = name;
		this.emailid = emailid;
		this.mobileno = mobileno;
		this.state = state;
		this.country = country;
	}
	public LoanVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
