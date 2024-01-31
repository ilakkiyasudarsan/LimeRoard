package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm12 {
	public static void main(String[] args)  {
		String s="malayalam";
		String rev="";
		for(int i=s.length()-1;i>=0;--i)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("is a not palindrome");
		}
		
		//ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com/");
		//WebElement searchBox=driver.findElement(By.name("y"));
		//searchBox.sendKeys("admin");
		//Thread.sleep(2000);
		//searchBox.clear();
		//Thread.sleep(2000);
		//searchBox.sendKeys("yuvan");
	}

}
