package webdrivermaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	

	public static WebDriver driver;
	@BeforeSuite
	public void setup()
	{
		
	
	System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.17.0-win32\\geckodriver.exe");
	System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	
	
	 
	driver= new FirefoxDriver();
	//driver.get("http://www.google.com");
	}
	
	@Test
	public void doLogin()
	{
		driver.get("http://www.gmail.com");
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("sonalisonnar@gmail.com");
		//driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("SONNAR1121992");

		//driver.findElement(By.xpath(".//*[@id='passwordNext']/div[2]")).click();
		//coment
		//comment
		//comment1
		//888
	}
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}

}
