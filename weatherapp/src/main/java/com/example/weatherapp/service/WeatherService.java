package com.example.weatherapp.service;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.example.weatherapp.model.WeatherData;

// gets coordinates from GetLocationData
// gets weather information from GetWeatherData
// creates weather object and sends it to WeatherController
@Service
public class WeatherService {
  private GetLocationData getLocationData;
  private GetWeatherData getWeatherData;

  public WeatherService(GetLocationData getLocationData, GetWeatherData getWeatherData) {
    this.getLocationData = getLocationData;
    this.getWeatherData = getWeatherData;
  }

  public WeatherData getWeather(String city) {
    // retrieve latitude/longitude for city
    JSONObject location = getLocationData.LocationData(city);

    double latitude = location.getDouble("latitude");
    double longitude = location.getDouble("longitude");

    // retrieve weather data
    JSONObject currentWeather = getWeatherData.weatherData(latitude, longitude);

    // Store data
    double temperature = currentWeather.getDouble("temperature_2m");
    double humidity = currentWeather.getDouble("relative_humidity_2m");
    double windSpeed = currentWeather.getDouble("wind_speed_10m");

    return new WeatherData(temperature, humidity, windSpeed, city);

  }
}
