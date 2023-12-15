package kiranpawar;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pawar {
	public static void main(String[] args) throws InterruptedException  {
		 System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		 WebDriver driver=new ChromeDriver(); 
		 driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 
		 
		  WebElement ele = driver.findElement(By.id("select1"));
		  Select s= new Select(ele);
		  List<WebElement> opt = s.getOptions();
		  s.selectByIndex(2);
		  
		  
		 WebElement ele1 = driver.findElement(By.id("select2"));
		 Select s2 = new Select(ele1);
		 List<WebElement> opt2 =s.getOptions();
	     s2.selectByIndex(1);
	     
	     
	     WebElement ele3 = driver.findElement(By.id("select3"));
		 Select s3 = new Select(ele3);
		 List<WebElement> opt3 =s.getOptions();
	     s3.selectByIndex(7);
	     
	     
	     
	     WebElement ele5 = driver.findElement(By.id("select5"));
		 Select s5 = new Select(ele5);
		 List<WebElement> opt5 =s.getOptions();
	     s5.selectByIndex(17);
	     
	     
	     WebElement ele6 = driver.findElement(By.id("root"));
		 Select s6 = new Select(ele6);
		 List<WebElement> opt6 =s.getOptions();
	     s6.selectByIndex(3);
		 

	}

}
