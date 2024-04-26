package com.cydeo.model;

import com.cydeo.enums.Cheese;
import com.cydeo.enums.Sauce;
import com.cydeo.enums.Topping;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class Pizza {

    private UUID id;
    private List<Cheese> cheeseList;
    private List<Sauce> sauceList;
    private List<Topping> toppingList;

}
