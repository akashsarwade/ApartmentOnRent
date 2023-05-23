package com.rentmazing.apartment.repository;

import org.springframework.data.jpa.domain.Specification;

import com.rentmazing.apartment.entity.ClientApartment;

public class ClientApartmentSpecification {

	public static Specification<ClientApartment> cityContainsIgnoreCase(String keyword) {
		return (root, query, criteriaBuilder) -> criteriaBuilder.like(criteriaBuilder.lower(root.get("city")),
				keyword.toLowerCase() + "%");

	}

	public static Specification<ClientApartment> retnPriceBetween(Integer minPrice, Integer maxPrice) {

		return (root, query, criteriaBuilder) -> criteriaBuilder.between(root.get("retntPrice"), minPrice, maxPrice);
	}

	public static Specification<ClientApartment> isRetnAvailable(boolean isAvailable) {
		return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("isAvailableForRent"), isAvailable);

	}

}
