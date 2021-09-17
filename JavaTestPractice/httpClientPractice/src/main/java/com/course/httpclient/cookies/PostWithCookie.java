package com.course.httpclient.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.ResourceBundle;

public class PostWithCookie {
    private String url;
    private ResourceBundle bundle;
    private final BasicCookieStore cookieStore = new BasicCookieStore();

    private HttpResponse getResponse(String uri) throws IOException{
        String testUrl = url + uri;
        HttpGet get = new HttpGet(testUrl);
        HttpClient httpClient = HttpClients.custom().setDefaultCookieStore(cookieStore).build();
        return httpClient.execute(get);
    }
    @BeforeTest
    public void resourcePrepare(){
        bundle = ResourceBundle.getBundle("application");
        url = bundle.getString("test.url");
    }
    @Test
    public void getCookies() throws IOException {
        String uri = bundle.getString("getCookies.uri");
        HttpResponse response = getResponse(uri);
        String result = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(result);

        List<Cookie> cookies  = cookieStore.getCookies();
        for(Cookie cookie: cookies){
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println("name: " + name+"\nvalue: "+value);
        }
    }
    @Test(dependsOnMethods = "getCookies")
    public void postWithCookie() throws IOException {
        String uri = bundle.getString("postWithCookie.url");
        String testUrl = url + uri;
        //声明一个client对象
        HttpClient httpClient = HttpClients.custom().setDefaultCookieStore(cookieStore).build();
        //声明一个post方法
        HttpPost post = new HttpPost(testUrl);
        //添加参数
        JSONObject param = new JSONObject();
        param.put("name","felixhan");
        param.put("age", "18");
        //设置请求头信息
        post.setHeader("content-type", "application/json");
        //声明一个对象来响应结果的存储
        StringEntity entity = new StringEntity(param.toString(), "utf-8");
        post.setEntity(entity);
        //设置cookies信息
        //执行post方法
        HttpResponse response = httpClient.execute(post);
        //获取响应结果
        String result = EntityUtils.toString(response.getEntity(), "utf-8");
        //处理结果，断言验证是否符合预期
        //将返回结果字符串转化成json对象
        JSONObject resultJson = new JSONObject(result);
        String success = (String) resultJson.get("felixhan");
        String status = (String) resultJson.get("status");
        Assert.assertEquals("成功", success);
        Assert.assertEquals("200", status);
    }
}
