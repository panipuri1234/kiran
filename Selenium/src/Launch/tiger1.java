package Launch;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tiger1{


	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///C:/Users/Hp/OneDrive/Desktop/kiran.html");
		 Thread.sleep(1000);
		 WebElement ele=driver.findElement(By.name("upload file"));
		 ele.sendKeys("C:\\Users\\Hp\\OneDrive\\Desktop\\xpath.txt");"


	}

}
