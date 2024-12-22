package com.myrestaurant.food.repository;

import com.myrestaurant.food.model.Food;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FoodRepository extends MongoRepository<Food, Integer> {

}
