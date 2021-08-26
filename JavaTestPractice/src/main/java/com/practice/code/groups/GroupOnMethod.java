package com.practice.code.groups;

import org.testng.annotations.*;

public class GroupOnMethod {

    @Test(groups = "server")
    public void testcase1(){
        System.out.println("服务端testcase1");
    }

    @Test(groups = "server")
    public void testcase2(){
        System.out.println("服务端testcase2");
    }

    @Test(groups = "client")
    public void testcase3(){
        System.out.println("客户端testcase3");
    }

    @Test(groups = "client")
    public void testcase4(){
        System.out.println("客户端testcase4");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnSever(){
        System.out.println("服务端组运行之前运行的方法");
    }
    @AfterGroups("server")
    public void afterGroupsOnSever(){
        System.out.println("服务端组运行之后运行的方法！！！");
    }
}
