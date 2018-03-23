package com.zyc.pojo;

import java.util.Date;

public class WeatherModel {

    //天气概况
    private String detail;

    //日期
    private Date date;

    //最高温度
    private  int  temperature_max;

    //最低温度
    private int temperature_min;
    //忽略get/set方法


    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTemperature_max() {
        return temperature_max;
    }

    public void setTemperature_max(int temperature_max) {
        this.temperature_max = temperature_max;
    }

    public int getTemperature_min() {
        return temperature_min;
    }

    public void setTemperature_min(int temperature_min) {
        this.temperature_min = temperature_min;
    }
}