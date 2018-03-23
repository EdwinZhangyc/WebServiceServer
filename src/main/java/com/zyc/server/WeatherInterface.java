package com.zyc.server;


import com.zyc.pojo.WeatherModel;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

@WebService(
        targetNamespace="http://weather.Higgin.com/",//指定wsdl的命名空间
        name="WeatherInterface",                    //指定portType的名称
        portName="WeatherInterfacePort",            //指定port的名称
        serviceName="WeatherService"                //服务视图的名称
        //endpointInterface="com.Higgin.ws.service.WeatherInterface" //指定哪个接口中方法要发布成WebService，此时接口中也要加上@WebService注解
)
public interface WeatherInterface {
    public @WebResult(name="result")
    List<WeatherModel> queryWeather(@WebParam(name="cityName") String cityName);
}

