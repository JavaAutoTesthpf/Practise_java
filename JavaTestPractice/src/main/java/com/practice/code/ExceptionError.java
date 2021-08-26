package com.practice.code;

import org.testng.annotations.Test;

/**
    在我们期望结果为某个异常的时候会用到异常测试
    比如：传入某些不合法的参数，程序抛出异常
    预期结果就是异常
     */
public class ExceptionError {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeException(){
        System.out.println("这是一个异常测试");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是成功的异常测试");
        throw new RuntimeException();

    }
}
