package com.dev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.dev.dao.*;
import com.dev.models.*;

import java.util.*;


@RequestMapping("/restaurants")
@RestController
public class RestaurantController {
    private ItemJdbcDao itemJdbcDao;
    private RestaurantJdbcDao restaurantJdbcDao;

    @Autowired
    public RestaurantController(ItemJdbcDao itemJdbcDao, RestaurantJdbcDao restaurantJdbcDao) {
        this.itemJdbcDao = itemJdbcDao;
        this.restaurantJdbcDao = restaurantJdbcDao;
    }
    
    @CrossOrigin
    @GetMapping("")
    List<Restaurant> getAllRestaurants() {
        // model.addAttribute("restaurants", restaurantJdbcDao.getAllRestaurants());
        return restaurantJdbcDao.getAllRestaurants();
    }
    
    @CrossOrigin
    @RequestMapping("/{id}")
    public String getAllItems(@PathVariable("id") long id,Model model) {
        model.addAttribute("items", itemJdbcDao.getAllItemsbyRestaurantId(id));
        return "items";
    }
}
