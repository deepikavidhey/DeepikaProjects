package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConst
{
	public static WebDriver driver;
	static
	{
		System.setProperty(CHROMEKEY,CHROMEVALUE);
	}
	@BeforeMethod
	public void openApp()
	{
		driver=new ChromeDriver();
		driver.get("http://www.craftsvilla.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.HOURS);
	}
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}
	
}
