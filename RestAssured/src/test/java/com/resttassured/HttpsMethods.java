package com.resttassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.response.ValidatableResponseOptions;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.net.http.HttpResponse.BodyHandler;
import java.util.HashMap;
public class HttpsMethods {
	@Test
	void getUser()
	{
		given()
		.when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.body("per_page", equalTo(6));
	}
	
	@Test
	
	void createUser() {
		
		HashMap hm=new HashMap();
		hm.put("name", "ilakkiya");
		hm.put("Location", "chennai");
		hm.put("Job", "Tester");
		
		given()
		.contentType("application/json");
		   .body(hm)
		
		.when()
		.post("https://reqres.in/api/user");
		
		.then()
		
	.statusCode(201);
		.body("name",equalTo("ilaki"))
		.Log.all();
	
	}

	}
