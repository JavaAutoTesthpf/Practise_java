package com.practice.code.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {
    @Test
    public void test1(){
        System.out.printf("Thread1 id is : %s \n", Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.printf("Thread2 id is : %s \n", Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.printf("Thread3 id is : %s \n", Thread.currentThread().getId());
    }
}
