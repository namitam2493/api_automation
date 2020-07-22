package com.weather_api.Testcases;
import com.weather_api.Common.EndPoint;
import org.testng.Assert;
import io.restassured.RestAssured;

import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.weather_api.Pages.Get_weather_api;

public class TestCases_for_weather_api {
	
//	@BeforeSuite(alwaysRun = true)
//	public void configure()
//	{
//		RestAssured.baseURI = "http://api.openweathermap.org";
//	}

	@Test(groups = "demo" )
	public void verify_the_status_for_get_weather_by_city()
	{
		Get_weather_api get_wther = new Get_weather_api();
		String response = get_wther.getWeatherForCity(EndPoint.GET_WEATHER_CITY);
		boolean compare_status = response.contains("200");
		Assert.assertEquals(compare_status, true);  	
	}
}
