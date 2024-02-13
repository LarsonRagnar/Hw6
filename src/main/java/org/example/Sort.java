package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static org.example.Main.phoneBook;

public class Sort {
    public static HashMap<String, ArrayList<Integer>> sort() {
        List<ArrayList> sortList = new ArrayList<>(phoneBook.values());
        Collections.sort(Collections.<ArrayList>unmodifiableList(sortList));

    }
}

