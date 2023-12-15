package kiranpawar;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class kiran2 {
	private static TimeUnit timeunitesecond;

	public static void main(String[] args) throws InterruptedException  {
		 System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		 WebDriver driver=new ChromeDriver(); 
		 driver .manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,timeunitesecond);
		 driver.get("https://www.facebook.com/");
		 
		 
	}
      

}
