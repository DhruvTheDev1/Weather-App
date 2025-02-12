package com.example.weatherapp.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class GetLocationData {
  public JSONObject LocationData(String city) {

    try {
      // Geocoding API
      String urlString = "https://geocoding-api.open-meteo.com/v1/search?name=" + city
          + "&count=1&language=en&format=json";

      URI uri = new URI(urlString);
      URL url = uri.toURL();

      // create connection
      HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
      httpConnection.setRequestMethod("GET"); // set request method to get

      if (httpConnection.getResponseCode() != 200) {
        System.out.println("Could not connect to API");
        return null;
      }

      // read JSON response - convert into String type
      BufferedReader responseReader = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
      StringBuilder apiResponse = new StringBuilder();
      String inputLine;
      while ((inputLine = responseReader.readLine()) != null) {
        apiResponse.append(inputLine);
      }
      responseReader.close();

      // Parse the String into JSON Object
      JSONObject jsonResponse = new JSONObject(apiResponse.toString());
      // retrieve location data
      JSONArray locationData = jsonResponse.getJSONArray("results");
      return locationData.getJSONObject(0); // Get the first result as a JSONObject

    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
}
