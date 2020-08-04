package com.grainger.airportapi;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.grainger.airportapi.entity.Airport;
import com.grainger.airportapi.repo.AirportRepository;

@SpringBootApplication
public class AirportApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirportApiApplication.class, args);
	}

}

@Component
class DemoCommandLineRunner implements CommandLineRunner {
	@Autowired
	private AirportRepository airportRepository;
	

	@Override
	public void run(String... args) throws Exception {
		Airport a1 = new Airport("Chicago O'Hare International Airport", "Chicago", "United States", "ORD", "KORD",
				41.9786, -87.9048, 672, "America/Chicago");
		Airport a2 = new Airport("John F Kennedy International Airport", "New York", "United States", "JFK", "KJFK",
				40.63980103, -73.77890015, 13, "America/New_York");
		Airport a3 = new Airport("Los Angeles International Airport", "Los Angeles", "United States", "LAX", "KLAX",
				33.94250107, -118.4079971, 125, "America/Los_Angeles");
		Airport a4 = new Airport("Juneau International Airport", "Juneau", "United States", "JNU", "PAJN",
				58.35499954223633, -134.5760040283203, 21, "America/Anchorage");
		Airport a5 = new Airport("London Heathrow Airport", "London", "United Kingdom", "LHR", "EGLL", 51.4706,
				-0.461941, 83, "Europe/London");
		Airport a6 = new Airport("Narita International Airport", "Tokyo", "Japan", "NRT", "RJAA", 35.7647018433,
				140.386001587, 141, "Asia/Tokyo");
		Airport a7 = new Airport("Singapore Changi Airport", "Singapore", "Singapore", "SIN", "WSSS", 1.35019,
				103.994003, 22, "Asia/Singapore");
		Airport a8 = new Airport("Hamad International Airport", "Doha", "Qatar", "DOH", "OTHH", 25.273056, 51.608056,
				13, "Asia/Qatar");
		Airport a9 = new Airport("Charles de Gaulle International Airport", "Paris", "France", "CDG", "LFPG", 49.012798,
				2.55, 392, "Europe/Paris");
		Airport a10 = new Airport("Kotoka International Airport", "Accra", "Ghana", "ACC", "DGAA", 5.605189800262451,
				-0.16678600013256073, 205, "Africa/Accra");
		List<Airport> airportList = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
		airportRepository.saveAll(airportList);
	}

}
