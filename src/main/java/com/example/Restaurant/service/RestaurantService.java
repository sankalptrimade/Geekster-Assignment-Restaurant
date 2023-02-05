package com.example.Restaurant.service;

import com.example.Restaurant.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class RestaurantService {

    private static List<Restaurant> restaurants = new ArrayList<>();
    private static int restaurantCount = 0;
    static {
        restaurants.add(new Restaurant(++restaurantCount, "Indian-Chilly", "Shankar nagar", 78541236, "Paneer Chilly", 25, false, 1500000));
        restaurants.add(new Restaurant(++restaurantCount, "Axis-Juice", "Devendra Nagar", 78541245, "Noodles", 20, false, 2000000));
        restaurants.add(new Restaurant(++restaurantCount, "Xero-Degrees", "Shanti nagar", 78544566, "Pasta", 32, true, 300000));
        restaurants.add(new Restaurant(++restaurantCount, "Food-Library", "Gaurav Path Road", 45841236, "Pav Bhaji", 15, true, 150000));
        restaurants.add(new Restaurant(++restaurantCount, "Dominoes", "Marine Drive", 96341236, "Pizza", 40, true, 500000));
        restaurants.add(new Restaurant(++restaurantCount, "FITB-Restro", "Vip Road", 78541236, "Soup", 25, false, 100000));
        restaurants.add(new Restaurant(++restaurantCount, "Minerwa-NX", "Telibandha", 89552236, "Biryani", 45, false, 90000));
        restaurants.add(new Restaurant(++restaurantCount, "Bambooza", "Kalibadi area", 78541789, "Burger", 35, true, 250000));
        restaurants.add(new Restaurant(++restaurantCount, "Street-Food-Resstro", "Avanti vihar", 98541236, "Manchurian", 25, false, 150000));
        restaurants.add(new Restaurant(++restaurantCount, "Hot-100-Paratha-house", "Vip Road", 78541236, "Paratha", 10, true, 200000));
    }
    public List<Restaurant> findAll(){
        return restaurants;
    }

    public Restaurant findByName(String name){
        Predicate<? super Restaurant> predicate = restaurant -> restaurant.getName().equals(name);
        Restaurant restaurant = restaurants.stream().filter(predicate).findFirst().get();
        return restaurant;
    }

    public void addRestaurant(Restaurant restaurant){
        restaurants.add(restaurant);
    }

    public void updateRestaurant(String name, Restaurant newrestaurant){
        Restaurant restaurant = findByName(name);

        restaurant.setId(newrestaurant.getId());
        restaurant.setName(newrestaurant.getName());
        restaurant.setAddress(newrestaurant.getAddress());
        restaurant.setContact(newrestaurant.getContact());
        restaurant.setSpeciality(newrestaurant.getSpeciality());
        restaurant.setTotalStaffs(newrestaurant.getTotalStaffs());
        restaurant.setSelfService(newrestaurant.getSelfService());
        restaurant.setAvgIncome(newrestaurant.getAvgIncome());
    }

    public void deleteRestaurant(String name){
        Predicate<? super Restaurant> predicate = restaurant -> restaurant.getName().equals(name);
        restaurants.removeIf(predicate);
    }
}
