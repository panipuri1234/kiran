package Launch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class knox {

		public static void main(String[] args) throws InterruptedException  {
			 System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.get("https://demoapps.qspiders.com/dragDrop?sublist=0");
			 driver.manage().window().maximize();
			 WebElement ele1=driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
			 WebElement ele2=driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
			 Actions act=new Actions (driver);
			 act.dragAndDrop(ele1, ele2).perform();
			 
			 
			WebElement ele3=driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
			WebElement ele4=driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
			Actions act1=new Actions (driver);
			act1.dragAndDrop(ele3, ele4).perform();
			
			
			
			WebElement ele5=driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
			WebElement ele6=driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
			Actions act2=new Actions (driver);
			act2.dragAndDrop(ele5, ele6).perform();
			
			
			
			WebElement ele7=driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
			WebElement ele8=driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
			Actions act3=new Actions (driver);
			act3.dragAndDrop(ele7, ele8).perform();

	}

}
