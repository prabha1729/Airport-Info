package com.grainger.airportapi.controller;

import javax.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grainger.airportapi.entity.Airport;
import com.grainger.airportapi.service.AirportService;

@RestController
@RequestMapping(value = "/airport")
public class AirportController {
	@Autowired
	private AirportService airportService;

	@GetMapping(value = "/{code}")
	public ResponseEntity<Airport> getAirPortInfoByCode(@PathVariable(value = "code") String code) {
		Airport airportInfo = airportService.getAirpotInfo(code);
		if (airportInfo != null)
			return new ResponseEntity<>(airportInfo, HttpStatus.OK);
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}

	@GetMapping(value = "/distance")
	public String getDistance(@RequestParam(required = true) final @NotBlank String originAirportCode,
			@RequestParam(required = true) final @NotBlank String destinationAirportCode) {
		double dist = airportService.calculateDistance(originAirportCode, destinationAirportCode);
		if(dist!=-1)
			return String.valueOf(dist);
		return "Airport IATA codes are not valid";
		

	}
}
