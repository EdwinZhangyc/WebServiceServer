package com.zyc.release;

import com.zyc.server.impl.WeatherInterfaceImpl;
import com.zyc.server.WeatherInterface;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class WeatherServer {

    public static void main(String[] args) {
        //Endpoint.publish("http://127.0.0.1:12345/weather", new WeatherInterfaceImpl());

        //使用jaxWs发布SOAP协议的WebService
        JaxWsServerFactoryBean jaxWsServerFactoryBean=new JaxWsServerFactoryBean();
        //指定WebService地址
        jaxWsServerFactoryBean.setAddress("http://127.0.0.1:12345/weather");
        //指定portType
        jaxWsServerFactoryBean.setServiceClass(WeatherInterface.class);
        //指定服务类对象
        jaxWsServerFactoryBean.setServiceBean(new WeatherInterfaceImpl());
        //发布服务
        jaxWsServerFactoryBean.create();
    }
}