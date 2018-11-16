package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotationDemoApp {

    public static void main(String[] args){
        // read spring config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // get bean from context
//        Coach coach = context.getBean("thatSillyCoach1", Coach.class);
//        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach coach = context.getBean("gameCoach", Coach.class);



        // call method in the bean
        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getFortuneService());

        // close context
        context.close();
    }
}
