package com.kuddle.BookingSystem.enums;

import lombok.Getter;
@Getter
public enum ClassCapacity {
    YOGA_CLASS(5),
    GYM_CLASS(3),
    DANCE_CLASS(5);
    private final int value;
    private ClassCapacity(int value) {
        this.value = value;
    }
}