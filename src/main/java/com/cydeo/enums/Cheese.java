package com.cydeo.enums;

public enum Cheese {

    MOZZARELLA("Mozzarella"), CHEDDAR("Cheddar"), GOUDA("Gouda"), PARMESAN("Parmesan");

    private final String value;

    Cheese(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }

}
