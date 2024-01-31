package com.nykaaPT;



	import java.awt.AWTException;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class cart {
		
		
		public static void main(String[] args) throws InterruptedException, AWTException {
			
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\seleniumavadi\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.nykaa.com/");
			driver.manage().window().maximize();
		 	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//button[@class='css-65och3'])[1]")).click();
			driver.findElement(By.xpath("//input[@name='emailMobile']")).sendKeys("8220025359");
			driver.findElement(By.xpath("//button[@id='submitVerification']")).click();
			
			driver.findElement(By.xpath("//button[@class='button big fill full ']")).click();
			
			
			WebElement mom=driver.findElement(By.xpath("(//li[@class='MegaDropdownHeadingbox'])[7]"));
			Actions act = new Actions(driver);
			act.moveToElement(mom).perform();
			driver.findElement(By.xpath("//a[text()='Baby Powder']")).click();
			
			Thread.sleep(8000);
			Set<String>allwin=driver.getWindowHandles();
			List<String> in = new ArrayList<>(allwin);
			System.out.println(allwin);
	 		for (String title : in) {
				
			{
	 			String text=driver.switchTo().window(title).getTitle();
				driver.switchTo().window(in.get(1));
				System.out.println(text);
			}
			
			
			driver.findElement(By.xpath("//img[@alt='Sebamed']//following::div[text()='Himalaya Baby Powder']")).click();
			//driver.switchTo().window(in.get(2));
			//driver.findElement(By.xpath("//span[@class='active css-d3w64v']")).clear();
			
			driver.findElement(By.xpath("//span[@class='cart-count']")).click();
			//span[@class='btn-text'])[1]
			//driver.findElement(By.xpath("//span[text()='Proceed']")).click();
			driver.findElement(By.xpath("(//button[@class='css-n7wnfc e8tshxd0'])[1]")).click();

			
			//span[@class='active css-d3w64v']
		
	 		}}
	
}
