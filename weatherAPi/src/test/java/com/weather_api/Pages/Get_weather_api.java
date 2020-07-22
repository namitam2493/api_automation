package com.weather_api.Pages;

import static io.restassured.RestAssured.given;

public class Get_weather_api {

	public String getWeatherForCity(String end_point)
	{
		String response = given().when().get(end_point).andReturn().asString();
		System.out.println("Response is::"+ response);
		return response;
	
	}
}
