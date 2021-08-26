package com.practice.code.suite;

import org.testng.annotations.Test;

public class PayTest {
    @Test
    public void payTB(){
        System.out.println("淘宝支付成功");
    }
    @Test
    public void payJD(){
        System.out.println("京东支付成功");
    }
}
