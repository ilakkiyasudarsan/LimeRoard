package seleniumavadi;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mini_projectnyakka {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
	 	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//button[@class='css-65och3'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='emailMobile']")).sendKeys("8220025359");
		driver.findElement(By.xpath("//button[@id='submitVerification']")).click();
		
		driver.findElement(By.xpath("//button[@class='button big fill full ']")).click();
		
		
		WebElement mom=driver.findElement(By.xpath("(//li[@class='MegaDropdownHeadingbox'])[7]"));
		Actions act = new Actions(driver);
		act.moveToElement(mom).perform();

		WebElement baby=driver.findElement(By.xpath("//a[text()='Baby Powder']"));
				baby.click();
		//act.moveToElement(mom).click().perform();
		Thread.sleep(2000);
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String>allwin=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(allwin.get(1));
		WebElement Himlyapowder = driver.findElement(By.xpath(
			      "//*[@id=\"product-list-wrap\"]/div[1]/div/div[1]/a/div[1]/img"));

		//WebElement Himlyapowder=driver.findElement(By.xpath("//*[@id=\\\"product-list-wrap\\\"]/div[1]/div/div[1]/a/div[1]/img"));
		act.moveToElement(Himlyapowder).click().perform();
		
		ArrayList<String>win=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(win.get(2));
		WebElement gram=driver.findElement(By.xpath("//select[@class='css-2t5nwu']"));
		
		Select s=new Select(gram);
		s.selectByIndex(3);
		
		WebElement addtobag=driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]"));
		addtobag.click();
		WebElement  cart=driver.findElement(By.xpath("//button[@class='css-aesrxy']"));
		cart.click();
		WebElement pro=driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
		
		driver.switchTo().frame(pro);
		
	    WebElement ele=driver.findElement(By.xpath("//span[text()='Proceed']"));
		ele.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", ele);
		Thread.sleep(2000);
		WebElement address=driver.findElement(By.xpath("(//button[@color='#ffffff'])[1]"));
		address.click();
		driver.findElement(By.xpath("(//input[@class='input-element  '])[1]")).sendKeys("2222405343248877");
		driver.findElement(By.xpath("//input[@label='Expiry (MM/YY)']")).sendKeys("1025");
		driver.findElement(By.xpath("//input[@class='input-element  secure-font']")).sendKeys("125");
		WebElement pay=driver.findElement(By.xpath("//button[@class='css-v61n2j e8tshxd0']"));
		pay.click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("D:\\Selenium\\seleniumavadi\\src\\seleniumavadi/Screen.png"));
		System.out.println("Screenshot is captured");
		driver.quit();
		
	}

}
