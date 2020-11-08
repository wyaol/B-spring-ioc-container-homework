package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import static org.springframework.web.context.WebApplicationContext.SCOPE_REQUEST;

@Service
@Scope(value = SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
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
