package com.food.order.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.food.order.demo.entity.Restaurant;

@Repository
public class RestaurantDAOHibernateImpl implements RestaurantDAO {

	// define field for entitymanager	
	private EntityManager entityManager;
		
	// set up constructor injection
	@Autowired
	public RestaurantDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	
	@Override
	public List<Restaurant> findAll() {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// create a query
		Query<Restaurant> theQuery =
				currentSession.createQuery("from Restaurant", Restaurant.class);
		
		// execute query and get result list
		List<Restaurant> Restaurants = theQuery.getResultList();
		
				
		// return the results		
		return Restaurants;
	}


	@Override
	public Restaurant findById(int theId) {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// get the Restaurant
		Restaurant theRestaurant =
				currentSession.get(Restaurant.class, theId);
		
		// return the Restaurant
		return theRestaurant;
	}


	@Override
	public void save(Restaurant theRestaurant) {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// save Restaurant
		currentSession.saveOrUpdate(theRestaurant);
	}


	@Override
	public void deleteById(int theId) {
		
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
				
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery(
						"delete from Restaurant where id=:RestaurantId");
		theQuery.setParameter("RestaurantId", theId);
		
		theQuery.executeUpdate();
	}

}







