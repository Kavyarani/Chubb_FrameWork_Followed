package BasePackage;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BaseClass {
	
	WebDriver driver;

	
	public static Properties prop = new Properties();
	
	@Test
	public void openBrowser() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kavyarani.n.g.m\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		
	} 

}
