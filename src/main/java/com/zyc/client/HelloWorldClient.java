package com.zyc.client;

import com.zyc.pojo.User;
import com.zyc.server.HelloWorld;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class HelloWorldClient {

    public static void main (String[] args) {

        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setServiceClass(HelloWorld.class);
        jaxWsProxyFactoryBean.setAddress("http://localhost:8080/WebServiceCXF");
        HelloWorld helloWorld = (HelloWorld)jaxWsProxyFactoryBean.create();
        User user = new User();
        user.setName("aaaaa");
        System.out.println(helloWorld.sayHiToUser(user));
    }
}