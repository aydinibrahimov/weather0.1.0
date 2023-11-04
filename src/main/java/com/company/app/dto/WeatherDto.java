package com.company.app.dto;


import lombok.Data;

@Data
public class WeatherDto {
    private Request request;
    private Location location;
    private CurrentWeather current;

    private boolean success;
    private String error;


}
