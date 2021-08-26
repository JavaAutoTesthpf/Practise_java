package com.practice.code.suite;

import org.testng.annotations.*;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before运行了");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after运行了");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("在所有方法之前运行");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("在所有方法之后运行");
    }
}
