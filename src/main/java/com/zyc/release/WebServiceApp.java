package com.zyc.release;

import com.zyc.server.impl.HelloWorldImpl;

import javax.xml.ws.Endpoint;

/**
 * 发布服务
 */
public class WebServiceApp {

    public static void main (String[] args) {

        System.out.println ("web service start");
        HelloWorldImpl helloWorld = new HelloWorldImpl();
        String address = "http://localhost:8080/WebServiceCXF";
        Endpoint.publish(address, helloWorld);
        System.out.println ("web service started");
    }
}