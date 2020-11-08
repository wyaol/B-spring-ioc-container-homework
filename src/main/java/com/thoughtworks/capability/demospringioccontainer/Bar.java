package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Bar {

    private Foo foo;

    @PostConstruct
    public void init() {
        foo.setBar(this);
    }

    public Bar(Foo foo) {
        this.foo = foo;
    }

    public void hi() {
        System.out.println("Hi, " + foo.name());
    }

    public String name() {
        return "Bar";
    }
}
