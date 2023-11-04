package com.company.app.service;

import com.company.app.dto.WeatherDto;
import com.company.app.util.WeatherFeignClient;
import feign.Feign;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeatherService {

    private final WeatherFeignClient weatherFeignClient;


    @Value("${feign.accessKey")
    String accessKey;


    public WeatherDto getWeatherForCity(String city) {
      return   weatherFeignClient.getCurrentWeather(accessKey,city);
    }
}