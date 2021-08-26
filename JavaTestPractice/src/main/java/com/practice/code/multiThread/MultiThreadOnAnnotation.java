package com.practice.code.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotation {

    @Test(invocationCount = 10, threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread-demo1 id : %s %n", Thread.currentThread().getId());
    }
}
