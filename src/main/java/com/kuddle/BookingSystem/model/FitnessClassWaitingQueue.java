package com.kuddle.BookingSystem.model;

import java.util.Queue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FitnessClassWaitingQueue {
    

    @Id
    private String id;

    @DBRef
    private Queue<FitnessProgramUser> waitingListUsers;

    @DBRef
    private FitnessClass fitnessClass;

}
