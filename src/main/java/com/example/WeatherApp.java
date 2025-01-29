package com.example;

import java.util.Scanner;

import org.json.JSONObject;

public class WeatherApp {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("=========================");
      System.out.print("Enter City (No to Quit): ");
      String city = scanner.nextLine();

      if (city.equalsIgnoreCase("No")) {
        break;
      }

      JSONObject location = new GetLocationData().LocationData(city);

      double latitude = location.getDouble("latitude");
      double longitude = location.getDouble("longitude");

      new GetWeatherData().weatherData(latitude, longitude);
    }
    scanner.close();
  }
}
