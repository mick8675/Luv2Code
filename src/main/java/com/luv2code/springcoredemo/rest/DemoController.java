package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    //define a private field for dependency
    private Coach myCoach;



    //define a constructor for dependency injection

    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach theCoach)
    {
        System.out.println("<br />In constuctor: " + getClass().getSimpleName());
        myCoach=theCoach;

    }

     @GetMapping("/dailyworkout")
     @ResponseBody
     public String getDailyWorkout()
     { //@RequestParam(required = false) String typeCoach)


        return myCoach.getDailyWorkout();
     }





}//______________________end class
