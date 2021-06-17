package com.example.demo.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Robin Persson,
 */

@Service
public class WeatherService {
    // hämtar all enskilda object från API:et
    public Object getWeatherObject(String city, String apiObject){
        RestTemplate template = new RestTemplate();
        Map response = template.getForObject("https://api.openweathermap.org/data/2.5/weather?q="+ city+"&appid=8f0103a2083da3cce8f68b749a33f402", Map.class);

        return response.get(apiObject);
    }

    // hämtar ut listan från API:et
    public List<Map> getWeatherDescription(String city) {
        RestTemplate template = new RestTemplate();
        Map response = template.getForObject("https://api.openweathermap.org/data/2.5/weather?q="+ city+"&appid=8f0103a2083da3cce8f68b749a33f402", Map.class);
        List<Map> contentMap = (List<Map>) response.get("weather");

        List<Map> weatherList = new ArrayList<>();

        for(Map weatherItem : contentMap){

            Map weatherContent = Map.of(
                    "main" , weatherItem.get("main"),
                    "description", weatherItem.get("description"),
                    "icon,", weatherItem.get("icon")

            );
            weatherList.add(weatherContent);
        }
        return weatherList;
    }
}
