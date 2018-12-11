package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps {

	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_application_home_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\m.abdullah\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver(); // launch chrome
		driver.get("https://selfiestyler.com");
	
		
	}
	
	@When("^title of login page is Selfie Styler$")
	public void title_of_login_page()
	{
		String title = driver.getTitle();
		
		System.out.println(title);
		
		Assert.assertEquals("SelfieStyler: Shop the latest fashion with our Virtual Fitting Room", title);
		
	}
	
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws InterruptedException
	{
		 driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		
		 driver.findElement(By.id("email")).sendKeys("qa-women@mailinator.com");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("password")).sendKeys("Germany0!");
		 
		 Thread.sleep(1000);
	 
	     driver.findElement(By.id("customer_login")).click();	
		
	}
	

    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button() throws InterruptedException {

    	driver.findElement(By.id("customer_login")).click();
    	
    	Thread.sleep(13000);

    	
   }
    
    
    @Then("^user is on home page$")
    public void user_is_on_home_page()  {
    	
    	String title = driver.getTitle();
    	
    	System.out.println("Home Page title ::"+ title);
    	
      	Assert.assertEquals("women – Selfiestyler Inc", title);
     
        
    }
    
    
    @Then("^close the browser$")
    public void close_the_browser()
    {
    	
    	driver.quit();
    	
    }
    
   
    
}
