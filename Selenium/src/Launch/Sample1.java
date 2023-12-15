package Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 String title=driver.getTitle();
	 System.out.println(title);
	 
	 
	 if(title.equals("kiran"))  {
		 System.out.println("title is matching");}
	 else{
		 
		   {
			 System.out.println("title is not matching");
		 }
		 
	 }
	}
	 
	 
	 
	 
	
	 
	 
	 
		
		 
		 
	}

}
