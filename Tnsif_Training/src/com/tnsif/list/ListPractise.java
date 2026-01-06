package com.tnsif.list;

import java.util.ArrayList;
import java.util.List;

public class ListPractise {
    public static void main(String[] args) {

        List names = new ArrayList();
        names.add("siuuu");
        names.add("kishore");

        System.out.println(names);
        names.add("Gavin");
        names.add("Spidey");
        names.add(1,"batman");

        System.out.println(names);

        System.out.println("the removed element: "+names.remove(names.indexOf("batman")));
        System.out.println(names);


    }
}
