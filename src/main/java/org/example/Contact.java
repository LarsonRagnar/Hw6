package org.example;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String name;
    private List<String> phoneNumbers;
    public Contact(String name, String phoneNum) {
        this.name = name;
        this.phoneNumbers = new ArrayList<>();
        this.phoneNumbers.add(phoneNum);
    }
    public String getName() {
        return name;
    }
    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }
    public void addPhoneNumber(String phoneNum) {
        phoneNumbers.add(phoneNum);
    }


}
