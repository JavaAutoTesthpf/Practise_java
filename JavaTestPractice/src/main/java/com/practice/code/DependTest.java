package com.practice.code;

import org.testng.annotations.Test;

public class DependTest {

    @Test
    public  void test1(){ //前置条件方法，例如方法一登录，方法二购买
        System.out.println("test1 run");
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
