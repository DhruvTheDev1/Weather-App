**Weather App**

A dynamic weather app built with Spring Boot, fetching real time weather information for any city using the Open-Meteo API - perfect for quick weather checks!

Features:
- Search for the current weather by city name
- Displays weather information such as temperature, humidity and wind speed
- Built using Spring Boot for the backend and Thymeleaf for rendering the front-end
- Utilises real time data from Open Meteo's weather API

How it works:

- Uses open-Meteo's Geocoding API to retrieve coordinates for the city.
- The location data (longitude, latitude) is passed to Open Meto Weather Forecast API to retrieve the current weather
- The user inputs the name of a city, the app fetches latitude/longitude for that city using Open-Meteo Geocoding API
- The latitude/longitude is then used to retrieve the current weather information from Open-Meteo Weather Forecast API
- The fetched data is then displayed using Thymeleaf

Springboot Architecture:
- Controller Layer:
  - WeatherController.java
  - Handles HTTP requests and interacts with service layer to retrieve the data and present it
  
 - Service Layer:
   - Contains the logic of the application
   - WeatherService.java - Gets coordinates and weather data, creates a weather object and sends it the controller layer
   - GetLocationData.java - Uses Geocoding API to retrieve latitude and longitude
   - GetWeatherData.java - Uses the coordinates to retrieve weather information from Open Forecast API
     
- Model Layer:
  - WeatherData.java - Defines the structure of the weather data and passed by the controller to the view.

- View Layer:
    - Thymeleaf used to present the weather information dynamically.

Example:

![image](https://github.com/user-attachments/assets/84456895-e0c3-4d36-a2c9-fae92f2ea162)

=============================================


![image](https://github.com/user-attachments/assets/88d8c3d0-d32e-492c-af11-71357b11daad)

=============================================


![image](https://github.com/user-attachments/assets/310facd7-77a7-401b-8e23-a291833b07fe)

=============================================



Further Work:
- Improve front-end using ReactJS to create a more dynamic and interactive user experience
- Integrate a weekly forecast rather than just the current weather
- Improve form validation and error handling to ensure better input handling

Note:
- The project was initially developed as a console-based application where the user interacted with the system through the command line
- The user is prompted to enter a city or 'no' to exit the application and it retrieved the weather information and printed it in the console
- You can explore the fully completed console-based version of the project as it was at that point in time by visiting: [console-based commit](https://github.com/DhruvTheDev1/Weather-App/tree/11ae5d49f0b1733f31216a26ca76d9c846c0a5e6)
- Open-Meteo Geocoding API: https://open-meteo.com/en/docs/geocoding-api
- Open-Meteo Weather Forecast API: https://open-meteo.com/en/docs

Example:

![image](https://github.com/user-attachments/assets/a119dd0e-206c-4a81-8dab-66e19f9a6584)
