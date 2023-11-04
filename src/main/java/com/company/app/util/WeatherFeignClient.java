package com.company.app.util;

import com.company.app.dto.WeatherDto;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


//http://api.weatherstack.com/current?access_key=47f14fb4050b229fcf218bed13e6dbfe&query=Baku


@FeignClient(name = "weatherStack", url = "${feign.url}")
public interface WeatherFeignClient {

    @GetMapping
    WeatherDto getCurrentWeather(@Param("accessKey") String accessKey, @Param("query") String query);


}
