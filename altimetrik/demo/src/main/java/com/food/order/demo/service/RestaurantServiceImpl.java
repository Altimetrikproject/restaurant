package com.food.order.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.order.demo.dao.RestaurantDAO;
import com.food.order.demo.entity.Restaurant;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	private RestaurantDAO RestaurantDAO;
	
	@Autowired
	public RestaurantServiceImpl(RestaurantDAO theRestaurantDAO) {
		RestaurantDAO = theRestaurantDAO;
	}
	
	
	@Override
	@Transactional
	public Restaurant findById(int theId) {
		
		Restaurant theRestaurant;
		 theRestaurant = RestaurantDAO.findById(theId);
		
		
		
	/*	if (result.isPresent()) {
			theRestaurant = result.get();
		}
		else {
			// we didn't find the Restaurant
			throw new RuntimeException("Did not find Restaurant id - " + theId);
		}*/
		
		return theRestaurant;
	}

	@Override
	@Transactional
	public void save(Restaurant theRestaurant) {
		
		RestaurantDAO.save(theRestaurant);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		RestaurantDAO.deleteById(theId);
	}


	@Override
	@Transactional
	public List<Restaurant> findAll() {
		// TODO Auto-generated method stub
		return RestaurantDAO.findAll();
	}

}






