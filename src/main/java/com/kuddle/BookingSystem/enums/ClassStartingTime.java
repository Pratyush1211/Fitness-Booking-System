package com.kuddle.BookingSystem.enums;

import lombok.Getter;

import java.time.LocalTime;
@Getter
public enum ClassStartingTime {

    SIX_PM(LocalTime.of(18, 0)),
    SEVEN_PM(LocalTime.of(19, 0)),
    EIGHT_PM(LocalTime.of(20, 0));

    private final LocalTime time;
    ClassStartingTime(LocalTime time) {
            this.time = time;
        }
}

