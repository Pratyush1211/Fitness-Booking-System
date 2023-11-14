package com.kuddle.BookingSystem.controller;


import com.kuddle.BookingSystem.model.CuddleProgram;
import com.kuddle.BookingSystem.service.ClassBookingService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Pratyush Motha
 *
 */

@CrossOrigin("*")
@RestController
@RequestMapping("/api/booking")
public class BookingController {

    @Autowired
    private ClassBookingService classBookingService;

    @GetMapping("gym")
    public CuddleProgram getBookingDetails(@RequestParam String name){
        return classBookingService.bookingOperationForGYM(name);
    }

     @GetMapping("gym-remove")
    public CuddleProgram getBookingDetailss(@RequestParam String name){
        return classBookingService.removeUserFromProgram(name);
    }

}
