package com.zyc.server.impl;

import com.zyc.pojo.WeatherModel;
import com.zyc.server.WeatherInterface;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class WeatherInterfaceImpl implements WeatherInterface {


    @Override
    public List<WeatherModel> queryWeather(String cityName) {

        //构造三天天气
        List<WeatherModel> list =new ArrayList<WeatherModel>();
        Calendar calendar=Calendar.getInstance();
        int day=calendar.get(Calendar.DATE);

        WeatherModel weatherModel_1=new WeatherModel();
        weatherModel_1.setDetail("晴天");
        weatherModel_1.setDate(new Date());
        weatherModel_1.setTemperature_max(10);
        weatherModel_1.setTemperature_min(-10);

        WeatherModel weatherModel_2=new WeatherModel();
        weatherModel_2.setDetail("阴天");
        calendar.set(Calendar.DATE, day+1);
        weatherModel_2.setDate(calendar.getTime());
        weatherModel_2.setTemperature_max(6);
        weatherModel_2.setTemperature_min(-2);

        WeatherModel weatherModel_3=new WeatherModel();
        weatherModel_3.setDetail("晴天");
        calendar.set(Calendar.DATE, day+2);
        weatherModel_3.setDate(calendar.getTime());
        weatherModel_3.setTemperature_max(30);
        weatherModel_3.setTemperature_min(3);

        list.add(weatherModel_1);
        list.add(weatherModel_2);
        list.add(weatherModel_3);
        return list;
    }
}