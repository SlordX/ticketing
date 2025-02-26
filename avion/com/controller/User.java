package avion.com.controller;

import avion.com.annotation.FormField;

public class User {
    @FormField("user_name")
    private String name;

    @FormField("user_age")
    private int age;

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

