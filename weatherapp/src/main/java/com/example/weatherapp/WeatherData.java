package com.example.weatherapp;

public class WeatherData {
  private double temperature;
  private double humidity;
  private double windSpeed;
  private String city;

  public WeatherData(double temerature, double humidity, double windSpeed, String city) {
    this.temperature = temerature;
    this.humidity = humidity;
    this.windSpeed = windSpeed;
    this.city = city;
  }

  public double getTemperature() {
    return temperature;
  }

  public double getHumidity() {
    return humidity;
  }

  public double getWindSpeed() {
    return windSpeed;
  }

  public String getCity() {
    return city;
  }

}
