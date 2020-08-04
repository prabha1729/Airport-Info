package com.grainger.airportapi.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.grainger.airportapi.entity.Airport;

public interface AirportRepository extends CrudRepository<Airport, Long> {

	Optional<Airport> findByIATACode(String airportCode);
	
}
