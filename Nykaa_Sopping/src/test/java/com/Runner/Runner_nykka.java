package com.Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base.BaseClass;
import com.shopping.Shopping_Login;

public class Runner_nykka extends BaseClass {
	//@RunWith("D:\Selenium\Nykaa_Sopping")
	//D:\Selenium\Nykaa_Sopping\target\Nykaa_Sopping-0.0.1-SNAPSHOT.jar
	//@RunWith(maven="D:\\Selenium\\Nykaa_Sopping\\target\\Nykaa_Sopping-0.0.1-SNAPSHOT.jar")
	
public static WebDriver driver;
public static void main(String[] args) {
	Shopping_Login lp = new Shopping_Login();
	Launch_Browser("chrome");
	launchUrl("https://www.nykaa.com/");
	
	
		
		
	}
	
}
