package kiranpawar;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class demo3 {

	


	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.qspiders.com/courses");
		 Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for (int i=0; i<3; i++)
		{
		
			js.executeScript("window.scrollBy(0,300)");
			Thread.sleep(1000);
			
		}
		 driver.findElement(By.xpath("(//span[text()='Details'])[6]")).click();
		 for(int i=0; i<3; i++)	 

	{
	
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
	}
		 driver.findElement(By.xpath("//p[@class='card-header-title has-text-persian])[3]")).click();
		 TakesScreenshot ts=(TakesScreenshot) driver;
		 File src=ts.getScreenshotAs(OutputType.FILE);
		 File dst=new File("selenium folder");
		 FileHandler.copy(src, dst);
		 driver.close();
		 
}}

	


	

	
	


