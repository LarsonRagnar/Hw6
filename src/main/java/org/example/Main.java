package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {


    public static void main(String[] args) {
        Add phoneBook=new Add() ;
        PhoneBookMenu menu = new PhoneBookMenu(phoneBook);
        menu.displayMenu();


    }



}
