package com.rentmazing.apartment.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.rentmazing.apartment.entity.ClientApartment;

public interface ClientApartmentRepository
		extends JpaRepository<ClientApartment, UUID>, JpaSpecificationExecutor<ClientApartment> {

}
