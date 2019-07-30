package com.flamingo.dao;

import java.util.List;

import com.flamingo.model.Flights;

public interface FlightInterface {

	public void insert(Flights flight);
	public void delete(Flights flight);
	public void update(Flights flight);
	public List<Flights> getAllFlights();
	public void getFlightById(int flightId);
}
