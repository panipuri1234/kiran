package Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demoapps.qspiders.com//");
		 driver.findElement(By.cssSelector("input[type='text']")).sendKeys("KIRANPAWAR");
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("https://demoapps.qspiders.com/")).click();
	     
	} 

}

