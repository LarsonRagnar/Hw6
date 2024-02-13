package org.example;

import java.util.ArrayList;

import static org.example.Main.phoneBook;

public class Add {
    public static void add(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        } else {
            ArrayList<Integer> newList = new ArrayList<>();
            newList.add(phoneNum);
            phoneBook.put(name, newList);
        }

    }
}


