package com.practice.code.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {
    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name, int age){
        System.out.println("name="+name);
        System.out.println("age="+age);
        System.out.printf("Thread-parameter id is : %s \n", Thread.currentThread().getId());
    }
}
