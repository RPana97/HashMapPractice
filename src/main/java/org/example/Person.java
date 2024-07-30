package org.example;

import java.util.HashMap;

public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Main method
    public static void main(String[] args) {
        // Create a HashMap to store Person objects
        HashMap<String, Person> personMap = new HashMap<>();

        // Create Person objects
        Person casper = new Person("Casper", 55);
        Person mike = new Person("Mike", 4);
        Person matt = new Person("Matt", 12);

        // Put Person objects into the HashMap
        personMap.put(casper.getName(), casper);
        personMap.put(mike.getName(), mike);
        personMap.put(matt.getName(), matt);

        // Check if the age of "Mike" is 4
        if (personMap.get("Mike").getAge() == 4) {
            System.out.println("Correct!");
        }
    }
}
