package com.example.crudwithvaadin;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private Long id;

	private String firstName;
	private String lastName;

	private String address;
	private String phoneNumber;
	private String creditCard;


	private String pizzaType;


	protected Customer() {
	}

	public Customer(String firstName, String lastName, String address, String phoneNumber, String pizzaType, String creditCard) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.pizzaType = pizzaType;
		this.creditCard = creditCard;
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {return this.address;}
	public void setAddress(String address) {this.address = address;}

	public String getPizzaType() {return this.pizzaType;}
	public void setPizzaType(String pizzaType) {this.pizzaType = pizzaType;}


	public String getPhoneNumber() {return this.phoneNumber;}
	public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

	public String getCreditCard() {return this.creditCard;}
	public void setCreditCard(String creditCard) {this.creditCard = creditCard;}

	@Override
	public String toString() {
		return String.format("Customer[id=%d, firstName='%s', lastName='%s', address='%s',phone-number='%s' pizza='%s',creditCard='%s']", id,
				firstName, lastName, address,phoneNumber, pizzaType,creditCard);
	}

}
