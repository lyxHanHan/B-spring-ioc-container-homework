package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    String sayHi() {
        System.out.println("GreetingService");

        return "hello world";
    }

}
