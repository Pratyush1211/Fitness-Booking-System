package com.kuddle.BookingSystem.enums;


import lombok.Getter;

@Getter
public enum ProgramTypes {
    YOGA_CLASS("YOGA"),
    GYM_CLASS("GYM"),
    DANCE_CLASS("DANCE");

    private final String programType;

    private ProgramTypes(String programType){
        this.programType = programType;
    }
}
