package com.kuddle.BookingSystem.data;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public class GymDummyDataStorage {

    @Getter
    private static List<String> gymUsers = new ArrayList<>();

    // Static block to initialize the data
    static {
        gymUsers.add("Karan");
        gymUsers.add("Shivansh");
        gymUsers.add("Pratyush");
    }


}
