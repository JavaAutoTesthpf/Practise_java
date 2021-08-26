package com.practice.code;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testcase1(){
        System.out.println("testcase1");
        System.out.printf("Thread-testcase1 id is : %s \n", Thread.currentThread().getId());
    }


    @Test
    public void testcase2(){
        System.out.println("testcase2");
        System.out.printf("Thread-testcase2 id is : %s \n", Thread.currentThread().getId());
    }

//    @BeforeMethod
//    public void beforeMethod(){
//        System.out.println("在方法之前运行");
//    }
//
//    @AfterMethod
//    public void afterMethod(){
//        System.out.println("在方法之后运行");
//    }
//    @BeforeClass
//    public void beforeClass(){
//        System.out.println("在类运行之前运行");
//    }
//
//    @AfterClass
//    public void afterClass(){
//        System.out.println("在类运行之后运行");
//    }
//    @BeforeSuite
//    public void beforeSuite(){
//        System.out.println("before测试套件");
//    }
//    @AfterSuite
//    public void afterSuite(){
//        System.out.println("after测试套件");
//    }

}
