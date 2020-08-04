package com.grainger.airportapi.service;

import com.grainger.airportapi.entity.Airport;

public interface AirportService {
	public Airport getAirpotInfo(String airportCode);
	public double calculateDistance(String originAirportCode, String destinationAirportCode);
}
