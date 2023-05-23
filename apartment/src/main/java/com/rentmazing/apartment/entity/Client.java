package com.rentmazing.apartment.entity;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "clients")
@Entity
public class Client {

	@Id
	@GeneratedValue
	private UUID clientId;

	private String fullName;
	private String email;
	private String phone;

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "client_id", nullable = false)
	private List<ClientApartment> apartments;

	public UUID getClientId() {
		return clientId;
	}

	public void setClientId(UUID clientId) {
		this.clientId = clientId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<ClientApartment> getApartments() {
		return apartments;
	}

	public void setApartments(List<ClientApartment> apartments) {
		this.apartments = apartments;
	}
}