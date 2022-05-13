package com.curso.javatesting.service;

import com.curso.javatesting.models.Weather;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    public Weather getWeather() {
        Weather weather = new Weather("Cloudy", 10, 10);
        return weather;
    }

}
