package com.techreturners.exercise002;

public class Person {
    private String firstName;
    private String secondName;
    private String city;
    private int age;

    public Person(String firstName,
                  String secondName,
                  String city,
                  int age ) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.city = city;
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }
}