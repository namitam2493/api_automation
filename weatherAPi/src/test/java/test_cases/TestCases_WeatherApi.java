package test_cases;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
public class TestCases_WeatherApi {

	@Test
	public void getWeatherForCity()
	{
		String response = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=2c2263ca5fb53ff6bed69239195adc72").andReturn().asString();
		System.out.println("Response is::"+ response);
		System.out.println("Compare::"+ response.contains("200"));
		//		.then().statusCode(200);
	
	}
}
