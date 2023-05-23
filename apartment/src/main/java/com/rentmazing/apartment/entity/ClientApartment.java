package com.rentmazing.apartment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "client_apartments")
public class ClientApartment {

	@Id
	@GeneratedValue
	private UUID apartmentId;
	private String description;
	private String buildingName;
	private String streetAddress;
	private String city;
	private String postalCode;
	private boolean isAvailableForRent;
	private int rentPrice;

	public UUID getApartmentId() {
		return apartmentId;
	}

	public void setApartmentId(UUID apartmentId) {
		this.apartmentId = apartmentId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public boolean isAvailableForRent() {
		return isAvailableForRent;
	}

	public void setAvailableForRent(boolean availableForRent) {
		isAvailableForRent = availableForRent;
	}

	public int getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(int rentPrice) {
		this.rentPrice = rentPrice;
	}
}
