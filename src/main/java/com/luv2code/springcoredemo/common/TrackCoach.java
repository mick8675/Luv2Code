package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Lazy
//@Primary
public class TrackCoach implements Coach
{

    public TrackCoach()
    {
        System.out.println("<br />In constuctor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice the 50 yard dash until you puke!";
    }
}
