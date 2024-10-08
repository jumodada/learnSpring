package com.jirengu.spring.ioc.advance;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "apple")
public class Apple {

    @Value("apple")
    private String name;

    public Apple(@Value("苹果") String name) {
        System.out.println("apple 的有参构造函数被调用");
        this.name = name;
    }

    public Apple() {
        System.out.println("apple 的无参构造函数被调用");
    }

}
