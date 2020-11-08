package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Service
@Scope(value = SCOPE_PROTOTYPE)
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
