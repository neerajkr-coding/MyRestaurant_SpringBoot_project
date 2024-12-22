package com.myrestaurant.food.controller;

import com.myrestaurant.food.model.Food;
import com.myrestaurant.food.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class menuController {

    @Autowired
    FoodRepository foodRepository;

    @RequestMapping(value="/n")
    public void test(){
        System.out.println("test");
    }

    @GetMapping("/items")
    public List<Food> getAllFood() {
        return foodRepository.findAll();
    }

}
