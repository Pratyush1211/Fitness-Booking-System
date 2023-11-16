package com.kuddle.BookingSystem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;
import java.util.List;
import java.util.Queue;

import org.springframework.stereotype.Component;

import com.kuddle.BookingSystem.enums.FitnessProgram;


@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FitnessClass {

    private int maxCapacity;
    private FitnessProgram type;
    private List<String> users;
    private LocalTime startTime;
    private Queue<String> waitingListUsers;
    
}
