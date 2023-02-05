package com.example.Restaurant.controller;

import com.example.Restaurant.model.Restaurant;
import com.example.Restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/restaurant-app")
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("find-all")
    public List<Restaurant> findAllRestaurant(){
        return restaurantService.findAll();
    }

    @GetMapping("find-restaurant/name/{name}")
    public Restaurant findRestaurantByName(@PathVariable String name){
        return restaurantService.findByName(name);
    }

    @PostMapping("add-restaurant")
    public void addRestaurant(@RequestBody Restaurant restaurant){
        restaurantService.addRestaurant(restaurant);
    }

    @PutMapping("update-restaurant/name/{name}")
    public void updateRestaurant(@PathVariable String name, @RequestBody Restaurant restaurant){
        restaurantService.updateRestaurant(name, restaurant);
    }

    @DeleteMapping("delete-restaurant/name/{name}")
    public void deleteRestaurant(@PathVariable String name){
        restaurantService.deleteRestaurant(name);
    }
}
