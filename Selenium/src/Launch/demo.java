package Launch;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://github.com/dashboard");
		 Thread.sleep(1000);
		 Set<String> allwh = driver.getWindowHandles();
		 System.out.println(allwh.size());
		 
		 