package com.example.weatherapp.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

import org.json.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class GetWeatherData {
  public JSONObject weatherData(double latitude, double longitude) {

    try {
      // Weather Forecast API
      String urlString = "https://api.open-meteo.com/v1/forecast?latitude=" + latitude + "&longitude=" + longitude
          + "&current=temperature_2m,relative_humidity_2m,wind_speed_10m&wind_speed_unit=mph";

      URI uri = new URI(urlString); // Validates URL format
      URL url = uri.toURL();

      // Create connection
      HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
      httpConnection.setRequestMethod("GET");

      if (httpConnection.getResponseCode() != 200) {
        System.out.println("Error, could not connect to API");
        return null;
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

      return currentWeather;

    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }

  }
}
