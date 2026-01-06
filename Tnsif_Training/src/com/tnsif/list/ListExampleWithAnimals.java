package com.tnsif.list;

import java.util.ArrayList;
import java.util.List;

public class ListExampleWithAnimals {
    public static  void main(String[]args) {
        List<String> animals = new ArrayList<>();

        System.out.println("Empty List -> Animals: " + animals);

        animals.add("Panda");
        animals.add("Lion");
        animals.add("Giraffe");

        System.out.println("Animals: " + animals);

        System.out.println("First animal: " + animals.get(0));

        animals.set(2, "Wolf");

        System.out.println("Animals: " + animals);

        animals.remove("Lion");
        System.out.println(animals);

    }
}
