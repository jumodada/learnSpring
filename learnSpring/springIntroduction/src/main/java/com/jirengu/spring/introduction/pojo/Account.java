package com.jirengu.spring.introduction.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("account1")
public class Account implements IAccount {

    @Value("1234")
    private Integer money;

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }


    @Value("fuy")
    private String realName;


    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money  + " realName: " + realName +
                '}';
    }
}
