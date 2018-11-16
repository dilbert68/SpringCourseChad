package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameCoach implements Coach {
    private FortuneService fortuneService;


//    public GameCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Autowired
    @Qualifier("happyFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "workout: play pc games";
    }

    @Override
    public String getFortuneService() {
        return fortuneService.getFortune();
    }
}
