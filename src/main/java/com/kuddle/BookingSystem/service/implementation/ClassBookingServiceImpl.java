package com.kuddle.BookingSystem.service.implementation;

import com.kuddle.BookingSystem.enums.ClassCapacity;
import com.kuddle.BookingSystem.enums.ClassStartingTime;
import com.kuddle.BookingSystem.model.CuddleProgram;
import com.kuddle.BookingSystem.model.GenericFeatures;
import com.kuddle.BookingSystem.service.ClassBookingService;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class ClassBookingServiceImpl implements ClassBookingService {
    @Override
    public void bookingOperationForGYM(){
        GenericFeatures gym = new GenericFeatures();
        gym.setMaxCapacity(ClassCapacity.GYM_CLASS.getValue());
        gym.setStartTime(ClassStartingTime.SIX_PM.getTime());

        List<String> stringList = Arrays.asList("Value1", "Value2", "Value3");

        if ( checkIfClassReachedMaxCapacity(gym)){
            Queue<String> queue = new LinkedList<>();
            queue.add("qwewq");
            gym.setWaitingListUsers(queue);

        }

    }

    public boolean checkIfClassReachedMaxCapacity(GenericFeatures genericFeatures){
        return genericFeatures.getUsers().size() != genericFeatures.getMaxCapacity();
    }
}
