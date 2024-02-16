package org.example;

import java.util.*;


public class Add {
    private Map<String, Contact> phoneContacts;
    public Add() {
        phoneContacts = new HashMap<>();
    }



    public void addCont(String name,String phoneNum) {

        if (phoneContacts.containsKey(name)) {
            phoneContacts.get(name).addPhoneNumber(phoneNum);
        } else {
            Contact contact = new Contact(name, phoneNum);
            phoneContacts.put(name, contact);
        }


    }
    public void displayContacts() {
        List<Contact> sortedContacts = new ArrayList<>(phoneContacts.values());
        sortedContacts.sort(Comparator.comparingInt(contact -> -contact.getPhoneNumbers().size()));
        for (Contact contact : sortedContacts) {
            System.out.println(contact.getName() + ": " + contact.getPhoneNumbers());
        }
    }


}


