package com.example.demo.Controllers;

import com.example.demo.Services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

/**
 * @author Robin Persson,
 */
@RestController
@RequestMapping("/api")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/getWeatherDescription/{city}")
    public List<Map> getWeatherDescription(@PathVariable String city){ return weatherService.getWeatherDescription(city);}

    @GetMapping("/getWeatherTemp/{city}")
    public Object getWeatherTemp(@PathVariable String city){return weatherService.getWeatherObject(city, "main");}

    @GetMapping("/getWeatherWind/{city}")
    public Object getWeatherWind(@PathVariable String city){return weatherService.getWeatherObject(city, "wind");}
}
