package com.food.order.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="restaurant_list")
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="restaurant_id")
	private Integer id;
	
	@Column(name="restaurant_name")
	private String restaurantName;
	
	@Column(name="restaurant_rating")
	private Integer restaurantRating;
	
	@Column(name="restaurant_address")
	private String restaurantAddress;
	
	@Column(name="restaurant_availability")
	private boolean restaurantAvailability;
	
	public Restaurant()
	{
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public Restaurant(String restaurantName, Integer restaurantRating, String restaurantAddress,
			boolean restaurantAvailability) {
		
		this.restaurantName = restaurantName;
		this.restaurantRating = restaurantRating;
		this.restaurantAddress = restaurantAddress;
		this.restaurantAvailability = restaurantAvailability;
	}

	public Integer getRestaurantRating() {
		return restaurantRating;
	}

	public void setRestaurantRating(Integer restaurantRating) {
		this.restaurantRating = restaurantRating;
	}

	public String getRestaurantAddress() {
		return restaurantAddress;
	}

	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}

	public boolean isRestaurantAvailability() {
		return restaurantAvailability;
	}

	public void setRestaurantAvailability(boolean restaurantAvailability) {
		this.restaurantAvailability = restaurantAvailability;
	}

		

	
	

}
