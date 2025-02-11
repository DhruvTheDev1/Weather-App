package com.example.weatherapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

// controller layer
@Controller
public class WeatherController {
  // service layer
  private WeatherService weatherService; // WeatherService - handles API calls

  public WeatherController(WeatherService weatherService) {
    this.weatherService = weatherService;
  }

  @GetMapping("/")
  public String showWeatherPage(WeatherData weatherRequest, Model model) {
      return "weather";
  }

    @PostMapping("/")
    public String getWeather(@ModelAttribute WeatherData weatherRequest, Model model) {
        model.addAttribute("weather", weatherService.getWeather(weatherRequest.getCity()));
        return "weather";
    }

}
