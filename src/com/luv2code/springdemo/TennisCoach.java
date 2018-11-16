package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component()

public class TennisCoach implements Coach {
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Workout: practice backend volley";
    }

    @Override
    public String getFortuneService() {
        return fortuneService.getFortune();
    }
}
