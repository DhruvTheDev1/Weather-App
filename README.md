**Weather App**

A dynamic weather app built with Spring Boot, fetching real time weather information for any city using the Open-Meteo API - perfect for quick weather checks!

Features:
- Search for the current weather by city name
- Displays weather information such as temperature, humidity and wind speed.
- Built using Spring Boot for the backend and Thymeleaf for rendering the front-end.
- Utilises real time data from Open Meteo's weather API.

How it works:

- Uses open-Meteo's Geocoding API to retrieve coordinates for the city.
- The location data (longitude, latitude) is passed to Open Meto Weather Forecast API to retrieve the current weather
- The user inputs the name of a city, the app fetches latitude/longitude for that city using Open-Meteo Geocoding API.
- The latitude/longitude is then used to retrieve the current weather information from Open-Meteo Weather Forecast API.
- The fetched data is then displayed using Thymeleaf.

Springboot Architecture:
- Controller Layer:
  - WeatherController.java
  - Handles HTTP requests and interacts with service layer to retrieve the data and present it
  
 - Service Layer:
   - Contains the logic of the application
   - WeatherService.java - Gets coordinates and weather data from the lower-level services and creates a weather object and sends it to the controller layer
   - GetLocationData.java - Uses Geocoding API to retrieve latitude and longitude.
   - GetWeatherData.java - Uses the coordinates to retrieve weather information from Open Forecast API.
   - 
- Model Layer:
  - WeatherData.java - Defines the structure of the weather data and passed by the controller to the view.
  - 
- View Layer:
    - Thymeleaf used to present the weather information dynamically.
     
Tech Stack:
- Backend: SpringBoot
- Frontend: Thymeleaf
- APIs: Open-Meteo's API (Geocoding API and Weather Forecast API)

Example:

![image](https://github.com/user-attachments/assets/a119dd0e-206c-4a81-8dab-66e19f9a6584)
