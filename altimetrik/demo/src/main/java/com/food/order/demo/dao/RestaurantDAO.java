package com.food.order.demo.dao;

import java.util.List;

import com.food.order.demo.entity.Restaurant;

public interface RestaurantDAO {

	public List<Restaurant> findAll();
	
	public Restaurant findById(int theId);
	
	public void save(Restaurant theEmployee);
	
	public void deleteById(int theId);
	
}
