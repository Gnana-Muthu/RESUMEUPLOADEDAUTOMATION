package com.test.StepDefinition;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.Reusable.ReusableComponents;
import com.test.Uistore.LoginUiStore;

import com.test.Utilities.PropertyFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class UploadResumeStepDefinition extends LoginUiStore {
	
	WebDriver driver;
	ReusableComponents rc=new ReusableComponents();
	//Logger logger= LoggerHelper.getLogger(LoggerHelper.class);
	
	@Given("Hit the Browser Open the URL")
	public void hit_the_Browser_Open_the_URL() throws InterruptedException {
PropertyFile rp=new PropertyFile();
    	
            driver=rc.setup();

        
            driver.get("https://www.naukri.com/nlogin/login");
           
            Thread.sleep(10000);
            WebElement EnterLogin=driver.findElement(Username);
			EnterLogin.sendKeys("gnanamuthugmg@gmail.com");
			Thread.sleep(2000L);
			
            
       
	}

	@Then("Enter the Username and Password")
	public void enter_the_Username_and_Password() {
		 
	        	
				WebElement EnterPassword=driver.findElement(Password);
				EnterPassword.sendKeys("muthuGMAHA@0810");
				
			
	}

	@Then("Click Login")
	public void click_Login() {
		try
		{
			WebElement ClickLogin=driver.findElement(Login);
			ClickLogin.click();
		}catch(Exception e)
		{
			System.out.println("cannot able to Click Login");
			
		}
	}

	@When("Home page visible Click View Profile")
	public void home_page_visible_Click_View_Profile() {
		  try
			{
	        
				Thread.sleep(10000);
				WebElement ClickViewProfile=driver.findElement(ViewProfile);
				
				ClickViewProfile.click();
				Thread.sleep(5000);
				
				
			}
			catch(Exception e)
			{
				System.out.println("cannot able to View Profile");
				
			}
	    
	}

	@Then("Upload Resume")
	public void upload_Resume() {
		try
		{
        
			
			Thread.sleep(5000);
			
			
			WebElement fileInput = driver.findElement(Fileupload);
			String filePath = "/Users/gnanamuthup/Documents/GNANAMUTHUPRESUME1.pdf";
			String filePath2 = "/Users/gnanamuthup/Documents/GNANAMUTHUENGINEER.pdf";
			 fileInput.sendKeys(filePath);
		}
		catch(Exception e)
		{
			System.out.println("cannot able to Upload the Resume");
			
		}
	}



	/*@Given("^Hit the Browser$")
	public void hit_the_Browser() throws Throwable {
PropertyFile rc=new PropertyFile();
    	
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/gnanamuthup/Desktop/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.naukri.com/nlogin/login");
            driver.manage().window().maximize();
            Thread.sleep(5000);
            
        } catch(Exception e)
		{
			System.out.println("cannot able to Hit the URL");
			
		}
        try
		{
        	Thread.sleep(5000);
			WebElement EnterLogin=driver.findElement(Username);
			EnterLogin.sendKeys("gnanamuthugmg@gmail.com");
			Thread.sleep(2000L);
			WebElement EnterPassword=driver.findElement(Password);
			EnterPassword.sendKeys("muthuGMAHA@0810");
			WebElement ClickLogin=driver.findElement(Login);
			ClickLogin.click();
			Thread.sleep(10000);
			WebElement ClickViewProfile=driver.findElement(ViewProfile);
			//ClickViewProfile.wait();
			ClickViewProfile.click();
			Thread.sleep(5000);
			//WebElement ClickUpdateResume=driver.findElement(UpdateResume);
			//ClickUpdateResume.click();
			
			WebElement fileInput = driver.findElement(Fileupload);
			String filePath = "/Users/gnanamuthup/Documents/GNANAMUTHUPRESUME1.pdf";
			String filePath2 = "/Users/gnanamuthup/Documents/GNANAMUTHUENGINEER.pdf";
			 fileInput.sendKeys(filePath);
		}
		catch(Exception e)
		{
			System.out.println("cannot able to LoginData");
			
		}
    
	}

	@Given("^Open the URL$")
	public void open_the_URL() throws Throwable {
		
	}*/


}
