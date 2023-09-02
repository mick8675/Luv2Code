package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class BaseballCoach implements Coach
{

    public BaseballCoach(){
        System.out.println("<br />In constuctor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout()
    {
        return "Practice your curve ball for 30 minutes!";
    }


}
