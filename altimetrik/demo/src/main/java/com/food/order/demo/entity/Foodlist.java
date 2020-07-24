package com.food.order.demo.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="food_list")
public class Foodlist {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer  foodId;
	
	@Column(name="food_name")
	private String foodName;
	
	@Column(name="food_price")
	private  Integer foodPrice;
	
	@Column(name="food_availability")
	private Boolean foodAvailability;
	
	public Integer getFoodId() {
		return foodId;
	}

	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public Integer getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(Integer foodPrice) {
		this.foodPrice = foodPrice;
	}

	public Boolean getFoodAvailability() {
		return foodAvailability;
	}

	public void setFoodAvailability(Boolean foodAvailability) {
		this.foodAvailability = foodAvailability;
	}

	

	
}
