package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        Main phoneBook = new Main();

        Add.add("Vasy",23535452);
        Add.add("miha",4564231);
        Add.add("John", 1234567890);
        Add.add("Alice", 987654321);
        Add.add("Bob", 555111222);
        Add.add("Sarah", 999888777);
        Add.add("Michael", 333444555);

        // Добавление нескольких номеров для одного имени
        Add.add("John", 555555555);
        Add.add("John", 999999999);
        System.out.println(PrintSort.getPhoneBook());
    }



}
