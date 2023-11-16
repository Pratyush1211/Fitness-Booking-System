package com.kuddle.BookingSystem.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FitnessProgramEnrollment {

    @Id
    private String id;
    private String classId;
    private String userId;
}