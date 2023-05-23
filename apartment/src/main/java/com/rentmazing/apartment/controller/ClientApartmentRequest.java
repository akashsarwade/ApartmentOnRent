package com.rentmazing.apartment.controller;

public class ClientApartmentRequest {

	private String description;
	private String buildingName;
	private String streetAddress;
	private String city;
	private String postalCode;
	private Boolean isAvailableForRent;
	private int rentPrice;
	
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
	public Boolean getIsAvailableForRent() {
		return isAvailableForRent;
	}
	public void setIsAvailableForRent(Boolean isAvailableForRent) {
		this.isAvailableForRent = isAvailableForRent;
	}
	public int getRentPrice() {
		return rentPrice;
	}
	public void setRentPrice(int rentPrice) {
		this.rentPrice = rentPrice;
	}
	
	
}
