package com.example;

import org.json.JSONObject;

public class WeatherApp {
  public static void main(String[] args) {

    // test
    String city = "London";

    GetLocationData location = new GetLocationData();
    JSONObject London = location.LocationData(city);

    double latitude = London.getDouble("latitude");
    double longitude = London.getDouble("longitude");

    System.out.println(latitude);
    System.out.println(longitude);

  }
}
