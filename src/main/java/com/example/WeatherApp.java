package com.example;

public class WeatherApp {
  public static void main(String[] args) {
    // Coordinates for London
    double latitude = 52.52;
    double longitude = 13.419998;

    GetWeatherData london = new GetWeatherData();
    london.weatherData(latitude, longitude);

  }

}
