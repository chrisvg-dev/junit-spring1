package com.curso.javatesting.controller;

import com.curso.javatesting.models.Weather;
import com.curso.javatesting.service.WeatherService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class WeatherControllerTest {

    @InjectMocks
    private WeatherController weatherController;

    @Mock
    private WeatherService weatherService;

    @Test
    public void getWeather() {
        Weather weather = new Weather("Cloudy", 10, 10);
        when( weatherService.getWeather() ).thenReturn( weather );
        Weather result = weatherController.getWeather();

        verify(weatherService, times(1)).getWeather();
    }

}