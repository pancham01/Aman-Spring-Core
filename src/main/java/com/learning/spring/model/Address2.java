package com.learning.spring.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "add2")
//@Primary
public class Address2 implements EAddress {

	private String city, state;

	public Address2() {
		city = "Pune";
		state = "MH";
		System.out.println("Address.Address()");
	}

	public Address2(String city, String state) {
		super();
		this.city = city;
		this.state = state;
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

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}

}
