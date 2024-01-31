package seleniumavadi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nykka_minproject {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
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
		ArrayList<String> in = new ArrayList<>(driver.getWindowHandles());
		System.out.println(allwin);
 		for (String title : in) {
			
		{
 			String text=driver.switchTo().window(title).getTitle();
			driver.switchTo().window(in.get(1));
			
			System.out.println(text);
		}
		
			driver.findElement(By.xpath("//img[@alt='Sebamed']//following::div[text()='Himalaya Baby Powder']")).click();
			//ArrayList<String> powder = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(in.get(2));
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		
		WebElement add=driver.findElement(By.xpath("//select[@class='css-2t5nwu']"));
		Select s=new Select(add);
		s.selectByIndex(3);
		WebElement addtobag=driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]"));
		addtobag.click();	
		//driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		
		
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		
		driver.findElement(By.xpath("(//button[@class='css-n7wnfc e8tshxd0'])[1]")).click();

		
		
	
 		}}
}