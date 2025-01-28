package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

import org.json.JSONObject;

public class GetWeatherData {
  public void weatherData(double latitude, double longitude) {

    try {
      // Weather Forecast API
      // String urlString = 

      URI uri = new URI(urlString); // Validates URL format
      URL url = uri.toURL();

      // Create connection
      HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
      httpConnection.setRequestMethod("GET");

      if (httpConnection.getResponseCode() != 200) {
        System.out.println("Error, could not connect to API");
        return;
      }

      // Read response
      BufferedReader responseReader = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
      StringBuilder response = new StringBuilder();
      String inputLine;
      while ((inputLine = responseReader.readLine()) != null) {
        response.append(inputLine);
      }
      responseReader.close();

      // parse JSON response
      JSONObject jsonResponse = new JSONObject(response.toString());
      JSONObject currentWeather = jsonResponse.getJSONObject("current");

      double temperature = currentWeather.getDouble("temperature_2m");
      double humidity = currentWeather.getDouble("relative_humidity_2m");
      double windSpeed = currentWeather.getDouble("wind_speed_10m");

      System.out.println("Current Temperature: " + temperature + "°C");
      System.out.println("Current Humidity: " + humidity + "%");
      System.out.println("Current Wind Speed: " + windSpeed + " mp/h");

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
