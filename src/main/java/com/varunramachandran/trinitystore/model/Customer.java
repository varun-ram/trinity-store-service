package com.varunramachandran.trinitystore.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private Long id;
	
	@Column(name = "customer_name")
	private String name;
	
	@Column(name = "customer_contact")
	private BigInteger contactNumber;
	
	@Column(name = "customer_email")
	private String emailId;
	
	@Column(name = "customer_door_number")
	private String doorNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(BigInteger contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", contactNumber=" + contactNumber + ", emailId=" + emailId
				+ ", doorNumber=" + doorNumber + "]";
	}
	
}
