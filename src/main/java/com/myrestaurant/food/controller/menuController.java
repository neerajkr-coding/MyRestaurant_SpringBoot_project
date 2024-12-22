package com.myrestaurant.food.controller;

import com.myrestaurant.food.model.Food;
import com.myrestaurant.food.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<Food> getAllItem() {
        return foodRepository.findAll();
    }

    @PostMapping("/additem")
    public Food addItem(@RequestBody Food food){
        return foodRepository.save(food);
    }

}
