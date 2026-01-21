package com.test.Reusable;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.test.Utilities.PropertyFile;



public class ReusableComponents {

	PropertyFile rc=new PropertyFile();
	public String baseURL=rc.getApplicationURL();
	
	public String br=rc.getBrowser();
	 public WebDriver driver;

	@BeforeClass
	public WebDriver setup() {

	
		if(br.equalsIgnoreCase("chrome"))
		{
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
			
		
			driver.manage().window().maximize();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", rc.getFirefoxpath());
			driver=new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", rc.getIEpath());
			driver=new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
}
	/*@AfterMethod
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	  public void getScreenshot(String result) throws IOException {
	        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        
	}
*/



}
