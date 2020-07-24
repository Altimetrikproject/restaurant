package com.food.order.demo.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="order_list")
public class Orders
{
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="order_id")
private Integer orderId;

@Column(name="customer_id")
private String customerId;

@Column(name="restaurant_id")
private String restaurantId;

@Column(name="food_id")
private Integer foodId;

public Integer getOrderId() {
	return orderId;
}

public void setOrderId(Integer orderId) {
	this.orderId = orderId;
}

public String getCustomerId() {
	return customerId;
}

public void setCustomerId(String customerId) {
	this.customerId = customerId;
}

public String getRestaurantId() {
	return restaurantId;
}

public Orders(String customerId, String restaurantId, Integer foodId) {
	super();
	this.customerId = customerId;
	this.restaurantId = restaurantId;
	this.foodId = foodId;
}

public void setRestaurantId(String restaurantId) {
	this.restaurantId = restaurantId;
}

public Integer getFoodId() {
	return foodId;
}

public void setFoodId(Integer foodId) {
	this.foodId = foodId;
}


	
}
