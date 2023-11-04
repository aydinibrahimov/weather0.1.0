package com.company.app.controller;


import com.company.app.dto.WeatherDto;
import com.company.app.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weathers")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;


    @GetMapping("/{city}")
    public WeatherDto getWeather(@PathVariable String city) {
        return weatherService.getWeatherForCity(city);
    }

}
