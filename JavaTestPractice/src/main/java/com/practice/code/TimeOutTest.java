package com.practice.code;

import org.testng.annotations.Test;

public class TimeOutTest {
    @Test(timeOut = 3000)//单位是毫秒，期望在3000毫秒内得到相应结果
    public void testSuccess() throws InterruptedException {
            Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}
