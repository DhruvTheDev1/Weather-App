package com.example.weatherapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.weatherapp.model.WeatherData;
import com.example.weatherapp.service.WeatherService;

@Controller
public class WeatherController {
  private WeatherService weatherService;

  public WeatherController(WeatherService weatherService) {
    this.weatherService = weatherService;
  }

  @GetMapping("/")
  public String showWeatherPage() {
    return "weather";
  }

  @PostMapping("/")
  public String getWeather(@RequestParam String city, Model model) {
    WeatherData weather = weatherService.getWeather(city);
    model.addAttribute("weather", weather);
    return "weather";
  }
}
