package com.myrestaurant.food.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Menu")
public class Food {

    @Id
    @Field("_id")
    private int id;

    @Field("item_name")
    private String itemName;
    private String type;

    @Field("non_veg")
    private Boolean isNonVeg;
    private String price;
}
