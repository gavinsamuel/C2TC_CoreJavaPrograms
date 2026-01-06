package com.tnsif.collection.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExampleWithManufacturers {
    public static void main(String[] args) {

        List<String> manufacturers = new ArrayList<>();

        manufacturers.add("Lockheed Martin");
        manufacturers.add("Boeing");
        manufacturers.add("Texas Instruments");
        manufacturers.add("Northrop Grumman");

        System.out.println(manufacturers);

        manufacturers.remove(2); // index based removing
        System.out.println(manufacturers);

        manufacturers.remove("Boeing"); // value based removing
        System.out.println(manufacturers);

        Collections.sort(manufacturers); // sorting A-Z
        System.out.println("Sorted: " + manufacturers);

        manufacturers.add(1, "Airbus");
        System.out.println(manufacturers);
    }
}
