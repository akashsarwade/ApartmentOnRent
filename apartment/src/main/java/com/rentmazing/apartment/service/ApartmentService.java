package com.rentmazing.apartment.service;

import static com.rentmazing.apartment.repository.ClientApartmentSpecification.cityContainsIgnoreCase;
import static com.rentmazing.apartment.repository.ClientApartmentSpecification.isRetnAvailable;
import static com.rentmazing.apartment.repository.ClientApartmentSpecification.retnPriceBetween;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.rentmazing.apartment.controller.ClientRequest;
import com.rentmazing.apartment.entity.Client;
import com.rentmazing.apartment.entity.ClientApartment;
import com.rentmazing.apartment.repository.ClientApartmentRepository;
import com.rentmazing.apartment.repository.ClientRepository;

@Service
public class ApartmentService {

	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private ClientApartmentRepository clientApartmentRepository;

////	 Get All Client List
//	public List<Client> getAllClients() {
//		return clientRepository.findAll();
//
//	}

// get All Apartment List
//	public List<ClientApartment> getAllApartment() {
//		return clientApartmentRepository.findAll();
//	}

	// find clients using optionalClientId

	public List<Client> findClients(String optionalClientId) {
		if (optionalClientId != null) {
			var clientIds = List.of(UUID.fromString(optionalClientId));

			return clientRepository.findAllById(clientIds);
		}

		else {
			return clientRepository.findAll();
		}

	}
	// find Apartment using different parameters

	public List<ClientApartment> findApartments(String city, Integer minPrice, Integer maxPrice,
			Boolean isAvailableForRent) {

		Specification<ClientApartment> specification = Specification.where(null);

		if (city != null) {
			specification = specification.and(cityContainsIgnoreCase(city));
		}

		if (minPrice != null & maxPrice != null) {
			specification = specification.and(retnPriceBetween(minPrice, maxPrice));
		}

		if (isAvailableForRent != null) {
			specification = specification.and(isRetnAvailable(isAvailableForRent));
		}

		return clientApartmentRepository.findAll(specification);
	}

	// create client

	public UUID createClient(ClientRequest clientRequest) {

		var clientEntity = new Client();

		clientEntity.setEmail(clientRequest.getEmail());
		clientEntity.setFullName(clientEntity.getFullName());
		clientEntity.setPhone(clientEntity.getPhone());

		if (clientRequest.getApartment() != null) {
			var clientApartmentEntities = new ArrayList<ClientApartment>();
			for (var apartmetRequest : clientRequest.getApartment()) {
				var apartmentEntity = new ClientApartment();

				apartmentEntity.setAvailableForRent(apartmetRequest.getIsAvailableForRent());
				apartmentEntity.setBuildingName(apartmetRequest.getBuildingName());
				apartmentEntity.setCity(apartmetRequest.getCity());
				apartmentEntity.setDescription(apartmetRequest.getDescription());
				apartmentEntity.setPostalCode(apartmetRequest.getPostalCode());
				apartmentEntity.setRentPrice(apartmetRequest.getRentPrice());
				apartmentEntity.setStreetAddress(apartmetRequest.getStreetAddress());

				clientApartmentEntities.add(apartmentEntity);
			}
			clientEntity.setApartments(clientApartmentEntities);
		}

		return clientRepository.save(clientEntity).getClientId();
	}

}
