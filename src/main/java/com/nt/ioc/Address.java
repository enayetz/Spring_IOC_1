package com.nt.ioc;

public class Address {

	private String city;
	private String state;

	public Address() {
		System.out.println("Constructor Address");
	}
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
