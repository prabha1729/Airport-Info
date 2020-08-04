package com.grainger.airportapi;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class AirportControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void findAirportById() throws Exception {
		String res = "{\"airportID\":1,\"name\":\"Chicago O'Hare International Airport\",\"city\":\"Chicago\",\"country\":\"United States\",\"lattitude\":41.9786,\"longitude\":-87.9048,\"altitude\":672.0,\"timezone\":\"America/Chicago\",\"iatacode\":\"ORD\",\"icaocode\":\"KORD\"}";
		this.mockMvc.perform(get("/airport/ORD").accept(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().isOk())
		.andExpect(content().string(res));
		
	}
	@Test
	public void findAirportByNonExistingId() throws Exception {
		this.mockMvc.perform(get("/airport/121").accept(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().isNotFound());
	}
	@Test
	public void findDistanceBetweenAirports() throws Exception{
		String res = "738.0513048854851";
		this.mockMvc.perform(get("/airport/distance").param("destinationAirportCode","JFK").param("originAirportCode","ORD").accept(MediaType.APPLICATION_JSON_VALUE)).andExpect(content().string(res));
	}
	@Test
	public void findDistanceBetweenSameAirport() throws Exception{
		String res = "0.0";
		this.mockMvc.perform(get("/airport/distance").param("destinationAirportCode","JFK").param("originAirportCode","JFK").accept(MediaType.APPLICATION_JSON_VALUE)).andExpect(content().string(res));
	}
	@Test
	public void findDistanceBetweenNonExistingAirports() throws Exception{
		String res = "Airport IATA codes are not valid";
		this.mockMvc.perform(get("/airport/distance").param("destinationAirportCode","JFK").param("originAirportCode","KOP").accept(MediaType.APPLICATION_JSON_VALUE)).andExpect(content().string(res));
	}
}
