package com.flamingo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.flamingo.model.Airport;

public class AirportImpl implements AirportInterface {

	private Session session;
	public AirportImpl() {
		// TODO Auto-generated constructor stub
	
	Configuration config= new Configuration().configure();
	SessionFactory sessionFactory =config.buildSessionFactory();
	session=sessionFactory.openSession();
	
	System.out.println("db has connected");
	}
	
	
	@Override
	public void insert(Airport airport) {
		// TODO Auto-generated method stub
		Transaction tx= session.beginTransaction();
		session.save(airport);
		tx.commit();
		
	}

	@Override
	public void delete(Airport airport) {
		// TODO Auto-generated method stub
		Transaction tx= session.beginTransaction();
		session.save(airport);
		tx.commit();
		
	}

	@Override
	public void update(Airport airport) {
		// TODO Auto-generated method stub

		Transaction tx= session.beginTransaction();
		session.update(airport);
		tx.commit();
	}

	@Override
	public List<Airport> getAllAirport(Airport airport) {
		// TODO Auto-generated method stub
	Query query=session.createQuery("from Airport");
		
		return query.getResultList();
	}

	@Override
	public Airport getAirportById(int airportId) {
		// TODO Auto-generated method stub
		
		return session.get(Airport.class,airportId);
	}

}
