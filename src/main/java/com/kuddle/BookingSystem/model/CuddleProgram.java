package com.kuddle.BookingSystem.model;


import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CuddleProgram {
    private FitnessClass Yoga;
    private FitnessClass Gym;
    private FitnessClass Dance;
}
