package com.kuddle.BookingSystem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;
import java.util.List;
import java.util.Queue;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GenericFeatures {
    private int maxCapacity;
    private List<String> users;
    private LocalTime startTime;
    private Queue<String> waitingListUsers;
}
