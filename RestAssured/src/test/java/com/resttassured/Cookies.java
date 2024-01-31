package com.resttassured;

import javax.annotation.meta.When;

import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;
public class Cookies {
	@Test
	void getsingleCookies()
	{
		Response res=given()
		
		.when()
		.get("https://google.co.in/");
		String Cookie=res.getCookie("NID");
		//System.out.println(Cookie);
	
	}
	void getAllCookies()
	{
		Response res=given()
				.when()
				.get("https://google.co.in/");
		Map<String,String>data=res.getCookies();
		System.out.println(data.keySet());
		for(String s:data.keySet())
		{
			String str=res.getCookie(s);
			System.out.println(s +" " + str);
		}
	}

}
