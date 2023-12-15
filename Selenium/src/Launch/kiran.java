package Launch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class kiran
{
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com/maps/@12.9859584,77.5520256,13z?entry=ttu");
		 Thread .sleep(2000);
		 driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("rajajainagar");
		 driver.findElement(By.xpath("\"//input[@autocomplete='off']")).sendKeys("mysore");
		 




	}

}
