package com.practice.code.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsClass1 {
    public void stu1(){
        System.out.println("Groupsclass1中的stu1运行");
    }

    public void stu2(){
        System.out.println("Groupsclass1中的stu22222运行");
    }
}
