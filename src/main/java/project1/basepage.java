package project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class basepage {

	public static WebDriver driver;
	public String browser = "chrome";

	public basepage()
	{
		if (driver == null) {
			if(browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chrome\\chromedriver.exe");
				driver= new ChromeDriver();
				
			}else if (browser.equals("firefox")){
				System.setProperty("webdriver.gecko.driver", "C:\\eclipse\\firefox\\geckodriver.exe");
				
				
				driver = new FirefoxDriver(); 
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php");
		
		
				
			
		}
		}
	
		public String getTitle() {
			return driver.getTitle();
		}
	
}