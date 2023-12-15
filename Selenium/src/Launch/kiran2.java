package Launch;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class kiran2 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/delete_customer.php");
		 Thread.sleep(1000);
		 driver.findElement(By.name("submit")).click();
		 Thread.sleep(2000);
		 Alert a = driver.switchTo().alert();
		 System.out.println(a.getText());
		 a.dismiss();
		 driver.close();
		 
	}

}
 