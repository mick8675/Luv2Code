package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


@Component
public class CricketCoach implements Coach
{

    public CricketCoach()
    {
        System.out.println("<br />In constuctor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout()

    {
        return "<h1>Practice cricket basics for 15 minutes!</h1>";
    }

    //Define our init methods
    @PostConstruct
    public void doMyStartupStuff()
    {
        System.out.println("<br />In post construct annotation - Do my startup stuff: " + getClass().getSimpleName());

    }

    //Define our destroy methods
    @PreDestroy
    public void doMyCleanupStuff()
    {
        System.out.println("<br />In pre destroy annotation - Do my destroy stuff: " + getClass().getSimpleName());

    }

}
