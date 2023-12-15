package Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Emptybrowser {
	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	// driver.get("https://www.facebook.com/");
	// driver.findElement(By.xpath("//input[@name='email']")).sendKeys("7323827768");
	 //driver.findElement(By.xpath("//input[@type='password")).sendKeys("kiran pawar");
	// driver.findElement(By.xpath("//input[@type='password']")).sendKeys("knox knox");
	// driver.findElement(By.xpath("//button[@value='1']")).click();
	
	 /////////instagram//////;
	 driver.get("https://www.instagram.com/accounts/login/");
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9535827345");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("kiran pawar");
	
	}

}