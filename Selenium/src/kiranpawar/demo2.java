package kiranpawar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {
	public static void main(String[] args) throws InterruptedException  {
		 System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		 WebDriver driver=new ChromeDriver(); 
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 String title=driver.getTitle();
		 System.out.println(title);
		 if(title.equals("BS"))
			 System.out.println("matching");
		 else
			 System.out.println("not matchig");
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran balaji");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("knox knox");
		 driver.findElement(By.xpath("//button[@value='1']")).click();
		 



	}

}
