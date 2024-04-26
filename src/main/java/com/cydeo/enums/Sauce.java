package com.cydeo.enums;

public enum Sauce {

    TOMATO_SAUCE("Tomato Sauce"), PEPPERY_RED_SAUCE("Peppery Red Sauce"), SWEET_PIZZA_SAUCE("Sweet Pizza Sauce");

    private final String value;

    Sauce(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }

}
