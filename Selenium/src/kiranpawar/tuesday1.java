package kiranpawar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tuesday1 {
public static void main(String[] args) throws InterruptedException  {
		 System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		 WebDriver driver=new ChromeDriver(); 
		 driver.get("http://www.facebook.com/r.php");
		 WebElement ele = driver. findElement(By.id("year"));
		 Select S=new Select(ele);
		 List<WebElement>opt =S.getOptions();
}
}