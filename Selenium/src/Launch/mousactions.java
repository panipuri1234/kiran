package Launch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousactions {

	public static void main(String[] args) throws InterruptedException  {
		 System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		// driver.get("https://www.myntra.com/?u tm_source=myntra_veve_exp&utm_medium=Affiliates&utm_campaign=myntra_veve_exp_20220601_INV301");
		//driver.manage().window().maximize();
		// WebElement ele = driver.findElement(By.xpath("//a[text()='Men']"));
		 //Actions act = new Actions (driver);
		//act.moveToElement(ele).perform();
		
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		 driver.manage().window().maximize();
		 WebElement ele1 =driver.findElement(By.id("box3"));
		 WebElement rest =driver.findElement(By.id("box103"));
		 Actions act1 = new Actions (driver);
			act1.moveToElement(ele1).perform();
			
			
			
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			driver.manage().window().maximize();
			WebElement ele2 =driver.findElement(null);
		 
	

}

	
}