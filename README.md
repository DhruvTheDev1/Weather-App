**Weather App**

A simple yet powerful console based Weather App. It fetches the current weather information for any city using the Open-Meteo API - perfect for quick weather checks!

Features:
- Search for current weather by city name
- Displays weather information such as temperature, humidity, wind speed
- Utilises real time data from Open Meteo's weather API

How it works:
- Uses Open-Meteo Geocoding API to retrieve coordinates for the city
- The location data (longitude, latitude) is passed to Open Meto Weather Forecast API to retrieve the current weather
- JSON response parsed to retrieve temperature, humidity and wind-speed.
- User is asked for a city which passes it to retrieve the location and uses the location data to get current weather information and displays it to console.

Example:

![image](https://github.com/user-attachments/assets/a119dd0e-206c-4a81-8dab-66e19f9a6584)
