package kiranpawar;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class kiran {

	public static void main(String[] args) throws InterruptedException, AWTException {
		 System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.selenium.dev/");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 @SuppressWarnings("unchecked")
		List<WebElement> ele = (List<WebElement>) driver.findElement(By.xpath("//spand[text()='Downloads']"));
		 Actions act = new Actions (driver);
		 act.contextClick().perform();
		 Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_T);
		 r.keyRelease(KeyEvent.VK_T);
		 Set<String> allwh = driver.getWindowHandles();
		 ArrayList<String> l = new ArrayList<String>(allwh);
		 l.get(1);
		 driver.switchTo().window(null);
		 

	}

}
