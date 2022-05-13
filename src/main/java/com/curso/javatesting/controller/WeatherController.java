package com.curso.javatesting.controller;

import com.curso.javatesting.models.Weather;
import com.curso.javatesting.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/api/weather")
    public Weather getWeather() {
        return this.weatherService.getWeather();
    }

}
