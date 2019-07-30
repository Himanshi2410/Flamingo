package com.flamingo.dao;

import java.util.List;

import com.flamingo.model.Airport;

public interface AirportInterface {

	
	public void insert(Airport airport);
	public void delete(Airport airport);
	public void update(Airport airport);
	public List<Airport> getAllAirport(Airport airport);
	
	public Airport getAirportById(int airportId);
	
	

}
