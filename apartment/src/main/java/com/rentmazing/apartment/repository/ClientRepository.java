package com.rentmazing.apartment.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rentmazing.apartment.entity.Client;

public interface ClientRepository extends JpaRepository<Client, UUID> {

}
