package com.practice.code.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age){

        System.out.println("name = "+ name +"\nage = "+ age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] data = new Object[][]{
                {"janny", 10},
                {"danny", 20},
                {"liming", 30}
        };
        return data;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age){
        System.out.println("test1方法 name =" +name+ "; age ="+age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age){
        System.out.println("test22222方法 name =" +name+ "; age ="+age);
    }

    @DataProvider(name = "methodData")
    public  Object[][] methodDataTest(Method method){
        Object[][] result = null;
        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"aaaa", 10},
                    {"bbbb", 20},
                    {"cccc", 30}
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"AAAA", 10},
                    {"BBBB", 20},
                    {"CCCC", 30}
            };
        }
        return result;
    }
}
