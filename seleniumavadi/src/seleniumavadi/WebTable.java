package seleniumavadi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static void main(String[]args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/table");
		System.out.println("get all data");
		List<WebElement>all=d.findElements(By.xpath("(//table)[1]/tbody/tr/td"));
		for(WebElement alldata:all)
		{
			System.out.println(alldata.getText());
		}
	}

}