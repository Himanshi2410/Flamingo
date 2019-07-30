package com.flamingo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.flamingo.model.Flights;

public class FlightImpl implements FlightInterface {
	Session session;
	
	public FlightImpl() {
			Configuration config=new Configuration().configure();
			SessionFactory sessionFactory=config.buildSessionFactory();
			session=sessionFactory.openSession();
	}
	@Override
	public void insert(Flights flight) {

		Transaction tx=session.beginTransaction();
		session.save(flight);
		tx.commit();
		
	}

	@Override
	public void delete(Flights flight) {
		// TODO Auto-generated method stub
		Transaction tx=session.beginTransaction();
		session.delete(flight);
		tx.commit();
		
	}

	@Override
	public void update(Flights flight) {
		// TODO Auto-generated method stub
		Transaction tx=session.beginTransaction();
		session.update(flight);
		tx.commit();
		
	}

	@Override
	public List<Flights> getAllFlights() {
		// TODO Auto-generated method stub
		Query query=session.createQuery("from Flights");
		return query.getResultList();
	}

	@Override
	public void getFlightById(int flightId) {
		// TODO Auto-generated method stub

	}

}
