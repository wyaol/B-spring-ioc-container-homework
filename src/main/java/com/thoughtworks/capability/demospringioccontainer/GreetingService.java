package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private static int count = 0;

    public static int getCount() {
        return count;
    }

    GreetingService() {
        System.out.println("create new bean ......");
        count ++;
    }

    String sayHi() {
        return "hello world";
    }
}
