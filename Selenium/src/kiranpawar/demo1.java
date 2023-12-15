package kiranpawar;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.name("email")).sendKeys("668278667287");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kiran");
		 driver.findElement(By.xpath("//button[@value='1']")).click();
		 
	}

	

}
