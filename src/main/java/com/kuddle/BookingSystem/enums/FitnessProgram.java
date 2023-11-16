package com.kuddle.BookingSystem.enums;


import lombok.Getter;

@Getter
public enum FitnessProgram {
    YOGA_CLASS("YOGA"),
    GYM_CLASS("GYM"),
    DANCE_CLASS("DANCE");

    private final String FitnessProgram;

    private FitnessProgram(String FitnessProgram){
        this.FitnessProgram = FitnessProgram;
    }
}
