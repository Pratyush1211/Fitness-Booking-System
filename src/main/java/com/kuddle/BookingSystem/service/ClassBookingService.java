package com.kuddle.BookingSystem.service;

import com.kuddle.BookingSystem.model.CuddleProgram;

public interface ClassBookingService {

    public CuddleProgram bookingOperationForGYM(String name);

    public CuddleProgram removeUserFromProgram(String name);
}
