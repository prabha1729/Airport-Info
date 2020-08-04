package com.grainger.airportapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grainger.airportapi.entity.Airport;
import com.grainger.airportapi.repo.AirportRepository;

@Service
public class AirportServiceImpl implements AirportService {
	@Autowired
	private AirportRepository airportRepository;

	@Override
	public Airport getAirpotInfo(String airportCode) {
		Optional<Airport> optAirport = airportRepository.findByIATACode(airportCode);
		if (optAirport.isPresent())
			return optAirport.get();
		return null;
	}

	@Override
	public double calculateDistance(String originAirportCode, String destinationAirportCode) {
		Airport originAirport = getAirpotInfo(originAirportCode);
		Airport destinationAirport = getAirpotInfo(destinationAirportCode);
		if(originAirport!=null && destinationAirport!=null)
			return distance(originAirport.getLattitude(), originAirport.getLongitude(), destinationAirport.getLattitude(),
				destinationAirport.getLongitude());
		return -1;
	}

	private double distance(double lat1, double lon1, double lat2, double lon2) {
		if ((lat1 == lat2) && (lon1 == lon2)) {
			return 0;
		} else {
			double theta = lon1 - lon2;
			double dist = Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2))
					+ Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));
			dist = Math.acos(dist);
			dist = Math.toDegrees(dist);
			dist = dist * 60 * 1.1515;
			return (dist);
		}
	}
}
