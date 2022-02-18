package com.example.test.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

// Den klasse der bruges til at controllere hvad der kommer frem på hjemme siden
@RestController
public class IndexController {
    // Get mapping giver serveren noget at finde koden med
    @GetMapping("/hello")
    public String hello() {
    return "Hello world";
    }

    @GetMapping("/try")
    public String tryString() {
        String helloProgram = "";
        for (int i = 0; i <10; i++) {
            helloProgram = helloProgram + "Hello world<br>";
        }
        return helloProgram;
    }

    @GetMapping("/echo")
    // skriv dette for at få det til at virke http://localhost:8080/echo?name=abc
    public String echo(@RequestParam String name) {
    return "Hello "+name;
    }

    @GetMapping("/erDetFredag")
    // skriv dette for at få det til at virke http://localhost:8080/echo?name=abc
    public String echo() {
        int q = 14;
        int m = 14;
        int j = 2022/100;
        int k = 2022%100;

        int part2 = (13*(m+1)/5);
        int h = (q+part2+k+(k/4)+(j/4)-2*j)%7;

        int d = ((h+5)%7)+1;

        int weekdayNumber = d;
        String weekDay = "";

        switch (weekdayNumber) {
            case 0: weekDay = "Saturday \n";
            break;

            case 1: weekDay = "Sunday \n";
                break;

            case 2: weekDay = "Monday \n";
                break;

            case 3: weekDay = "Tuesday \n";
                break;

            case 4: weekDay = "Wednesday  \n";
                break;

            case 5: weekDay = "Thursday  \n";
                break;

            case 6: weekDay = "Friday  \n";
                break;
        }

        Boolean isItFriday = null;

        if (weekDay.equals("Friday")) {
            isItFriday = true;
        } else {
            isItFriday = false;
        }

        return"it is " + weekDay + "<br>" +"is it friday? "+isItFriday;
    }
}

