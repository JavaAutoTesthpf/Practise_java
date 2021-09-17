package com.course.httpclient.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.ResourceBundle;

public class PostWithCookie {
    private String url;
    private ResourceBundle bundle;
    private BasicCookieStore cookieStore = new BasicCookieStore();

    @BeforeTest
    public void resourcePrepare(){
        bundle = ResourceBundle.getBundle("application");
        url = bundle.getString("test.url");
    }
    @Test
    public void getCookies() throws IOException {
        String uri = bundle.getString("getCookies.uri");
        String testUrl = url + uri;
        HttpGet get = new HttpGet(testUrl);
        HttpClient httpClient = HttpClients.custom().setDefaultCookieStore(cookieStore).build();
        HttpResponse response = httpClient.execute(get);
        String result = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(result);

        List<Cookie> cookies  = cookieStore.getCookies();
        for(Cookie cookie: cookies){
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println("name: " + name+"\nvalue: "+value);
        }
    }
}
