package com.onlinecart.signup;

public class Sign_up {
	private String email;
	private String name;
	private String phone;
	private String password;
	public Sign_up(String email, String name, String phone, String password) {
		super();
		this.email = email;
		this.name = name;
		this.phone = phone;
		this.password = password;
	}
	public Sign_up(String phone, String password) {
		super();
		this.phone = phone;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
