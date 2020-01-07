package generics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@AfterMethod
	public void closeApp()
	{
		//driver.quit();
	}
}