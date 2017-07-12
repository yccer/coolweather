package com.coolweather.android.gson;

/**
 * Created by yccer on 2017/7/10.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
