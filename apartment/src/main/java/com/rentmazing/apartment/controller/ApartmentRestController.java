package com.rentmazing.apartment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rentmazing.apartment.entity.Client;
import com.rentmazing.apartment.entity.ClientApartment;
import com.rentmazing.apartment.service.ApartmentService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ApartmentRestController {

	@Autowired
	private ApartmentService apartmentService;

	@GetMapping("/hello")
	public String get() {

		return "It working.........";
	}

	@GetMapping("/api/clients/{optoionalClientId}")
	List<Client> getAllClients(@PathVariable String optoionalClientId) {
		return apartmentService.findClients(optoionalClientId);
	}

	@GetMapping("/api/apartments")
	List<ClientApartment> getAllApartment(@RequestParam("city") String city, @RequestParam("minPrice") Integer minPrice,
			@RequestParam("maxPrice") Integer maxPrice,
			@RequestParam("isAvailableForRent") Boolean isAvailableForRent) {
		return apartmentService.findApartments(city, minPrice, maxPrice, isAvailableForRent);
	}

	@PostMapping("/api/client")
	String createClient(@RequestBody ClientRequest clientRequest) {
		return apartmentService.createClient(clientRequest).toString();
	}
}
