package com.flamingo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.flamingo.model.City;

public class CityImpl implements Cities {

private Session session;
	
	public CityImpl() {
		// TODO Auto-generated constructor stub
		Configuration cfg = new Configuration().configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		session =  sessionFactory.openSession();
		System.out.println("DB Connection ESTD");
		
	}
	
	
	@Override
	public void addCity(City city) {
		// TODO Auto-generated method stub
		
		Transaction txTransaction =  session.beginTransaction();
		session.save(city);
		txTransaction.commit();
		System.out.println("Product Inserted");
		
	}

	@Override
	public void updateCity(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCity(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public City findCityByCityId(City city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public City findCityByCityName(City city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<City> listAllCities() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
