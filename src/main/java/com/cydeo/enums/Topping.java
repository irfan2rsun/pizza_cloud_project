package com.cydeo.enums;

public enum Topping {

    MUSHROOMS("Mushrooms"), JALAPENOS("Jalapeños"), ONIONS("Onions"), RED_PEPPERS("Red Peppers"), TOMATOES("Tomatoes");

    private final String value;

    Topping(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }

}
