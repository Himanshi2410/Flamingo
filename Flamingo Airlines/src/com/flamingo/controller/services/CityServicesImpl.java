package com.flamingo.controller.services;

import java.util.List;

import com.flamingo.dao.Cities;
import com.flamingo.dao.CityImpl;
import com.flamingo.model.City;

public class CityServicesImpl implements CityServices {

	@Override
	public void insertCity(City city) {
		// TODO Auto-generated method stub
		Cities daoCities = new CityImpl();
		daoCities.addCity(city);

	}

	@Override
	public void edit(City city) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(City city) {
		// TODO Auto-generated method stub

	}

	@Override
	public City findCityByCityId(int cityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public City findCityByCityName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCityCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<City> findAllCities() {
		// TODO Auto-generated method stub
		return null;
	}

}
