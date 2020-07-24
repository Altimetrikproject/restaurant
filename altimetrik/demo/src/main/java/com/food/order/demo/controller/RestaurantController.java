package com.food.order.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.food.order.demo.entity.Restaurant;
import com.food.order.demo.service.RestaurantService;

@Controller
@RequestMapping("/restaurants")
public class RestaurantController {

	private RestaurantService restaurantService;
	
	public RestaurantController(RestaurantService theRestaurantService) {
		restaurantService = theRestaurantService;
	}
	
	// add mapping for "/list"

	@GetMapping("/list")
	public String listRestaurants(Model theModel) {
		
		// get Restaurants from db
		List<Restaurant> theRestaurants = restaurantService.findAll();
		
		for (Restaurant rest:theRestaurants)
		{
			System.out.println(rest.getId());
			System.out.println(rest.getRestaurantAddress());
			System.out.println(rest.getRestaurantName());
			System.out.println(rest.getRestaurantRating());
		}
		
		// add to the spring model
		theModel.addAttribute("restaurant", theRestaurants);
		
		return "restaurants/list-restaurant";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Restaurant theRestaurant = new Restaurant();
		
		theModel.addAttribute("restaurant", theRestaurant);
		
		return "restaurants/restaurant-form";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("restaurantId") int theId,
									Model theModel) {
		
		// get the Restaurant from the service
		Restaurant theRestaurant = restaurantService.findById(theId);
		
		// set Restaurant as a model attribute to pre-populate the form
		theModel.addAttribute("restaurant", theRestaurant);
		
		// send over to our form
		return "restaurants/restaurant-form";			
	}
	
	
	@PostMapping("/save")
	public String saveRestaurant(@ModelAttribute("Restaurant") Restaurant theRestaurant) {
		
		// save the Restaurant
		restaurantService.save(theRestaurant);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/restaurants/list";
	}
	
	
	@GetMapping("/delete")
	public String delete(@RequestParam("restaurantId") int theId) {
		
		// delete the Restaurant
		restaurantService.deleteById(theId);
		
		// redirect to /Restaurants/list
		return "redirect:/restaurants/list";
		
	}
}


















