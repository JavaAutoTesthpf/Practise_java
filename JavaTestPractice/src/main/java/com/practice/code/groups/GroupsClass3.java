package com.practice.code.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsClass3 {
    public void teacher1(){
        System.out.println("Groupsclass3中的teacher1运行");
    }

    public void teacher2(){
        System.out.println("Groupsclass3中的teacher22222运行");
    }
}
