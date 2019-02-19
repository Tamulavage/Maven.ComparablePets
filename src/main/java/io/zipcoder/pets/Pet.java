package io.zipcoder.pets;

public class Pet {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String speak() {
        // will be overwritten
        return "";

    }

}
