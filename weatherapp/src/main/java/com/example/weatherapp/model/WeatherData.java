package com.example.weatherapp.model;

// Uses city to retrieve weather data from service layer
// creates weather data objects based on the data
public class WeatherData {
  private double temperature;
  private double humidity;
  private double windSpeed;
  private String city;


  
  public WeatherData(double temperature, double humidity, double windSpeed, String city) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.windSpeed = windSpeed;
    this.city = city;
  }

  public double getTemperature() {
    return temperature;
  }

  public void setTemperature(double temperature) {
    this.temperature = temperature;
  }

  public double getHumidity() {
    return humidity;
  }

  public void setHumidity(double humidity) {
    this.humidity = humidity;
  }

  public double getWindSpeed() {
    return windSpeed;
  }

  public void setWindSpeed(double windSpeed) {
    this.windSpeed = windSpeed;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

}
