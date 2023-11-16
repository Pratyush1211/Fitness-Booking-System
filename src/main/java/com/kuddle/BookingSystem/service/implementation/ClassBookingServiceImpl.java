package com.kuddle.BookingSystem.service.implementation;

import com.kuddle.BookingSystem.data.GymDummyDataStorage;
import com.kuddle.BookingSystem.enums.ClassCapacity;
import com.kuddle.BookingSystem.enums.ClassStartingTime;
import com.kuddle.BookingSystem.model.CuddleProgram;
import com.kuddle.BookingSystem.model.FitnessClass;
import com.kuddle.BookingSystem.service.ClassBookingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.*;
import java.time.Duration;

@Service
public class ClassBookingServiceImpl implements ClassBookingService {

    List<String> gymUsers = GymDummyDataStorage.getGymUsers();
    Queue<String> gymWaitingQueue = new LinkedList<>();


    @Autowired
    private CuddleProgram cuddleProgram;


    // single shared instance just to have persistance for the flow of operation
    // for demo purposes
    @Autowired
    private FitnessClass gym;

    /**
     * Flow completed for GYM 
     * 
     */
    @Override
    public CuddleProgram bookingOperationForGYM(String name) {

        gym.setMaxCapacity(ClassCapacity.GYM_CLASS.getValue());
        gym.setStartTime(ClassStartingTime.SIX_PM.getTime());
        gym.setUsers(gymUsers);
        gym.setWaitingListUsers(gymWaitingQueue); 
 
        if ( reachedMaxCapacity(gym)) {
            System.out.println("Class is full ! Please wait for a while");
            gymWaitingQueue.add(name);
            gym.setWaitingListUsers(gymWaitingQueue);

        } else if ( gym.getWaitingListUsers().size() > 0 && reachedMaxCapacity(gym) == false) {
            String userName = gymWaitingQueue.remove();
            gymUsers.add(userName);
            gym.setUsers(gymUsers);
        } 
        else {
            gymUsers.add(name);
            gym.setUsers(gymUsers);
        }

        cuddleProgram.setGym(gym);

        return cuddleProgram;

    }

    @Override
    public CuddleProgram removeUserFromProgram(String name){
        if(Duration.between(gym.getStartTime(), LocalTime.now()).toMinutes() >= 30 && gymUsers.indexOf(name) != -1) {
            gymUsers.remove(name);
            gym.setUsers(gymUsers);
            System.out.println("User removed from the program");
            if(gym.getWaitingListUsers().size() > 0) {
                String userName = gymWaitingQueue.remove();
                gymUsers.add(userName);
                gym.setUsers(gymUsers);
                System.out.println("User from waiting List promoted to program");
            }
        }
        else{
            System.out.println("User cannot be removed from the program");
        }
        cuddleProgram.setGym(gym);
        return cuddleProgram;
    }


    public boolean reachedMaxCapacity(FitnessClass genericFeatures) {
        return genericFeatures.getUsers().size() == genericFeatures.getMaxCapacity();
    }


}
