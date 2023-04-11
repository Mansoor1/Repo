package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TS01_LoginStepDefination {
	WebDriver driver;
	
	@Given("When user is on Home page")
	public void when_user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver", "G:\\selenese\\Sel@7.30AM(est)_new\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
	   System.out.println("Rediff Home page");
	}
	@When("User Clicks on Sign in link")
	public void user_clicks_on_sign_in_link() {
	    System.out.println("Click on sign in link");
	    driver.findElement(By.linkText("Sign in")).click();
	    
	}
	@Then("Verify Login title")
	public void verify_login_title() {
	   System.out.println("Verify Title");
	   String title=driver.getTitle();
	   if(title.equals("Rediffmail"))
	   {
		   Reporter.log("Title is matching..");
	   }
	   else
	   {
		   Reporter.log("Title is not matching..");
	   }
	}
	@When("user enters valid User name and Password click on Signin")
	public void user_enters_valid_user_name_and_password_click_on_signin() {
	   System.out.println("Enter user name and password submit");
	}
	@Then("check user and display message as Login Successful")
	public void check_user_and_display_message_as_login_successful() {
	   System.out.println("Verify user and display Login Successful");
	}
	@When("user enters invalid User name or invalid Password click on Signin")
	public void user_enters_invalid_user_name_or_invalid_password_click_on_signin() {
	    System.out.println("Enter invalid User Name or Password");
	}
	@Then("check error message")
	public void check_error_message() {
	   System.out.println("Invalid user name or Password entered");
	}
	@Then("Close AUT")
	public void close_aut() {
	    System.out.println("Close AUT");
	    driver.quit();
	}
	@When("user enters {string} and {string} to Login page")
	public void user_enters_and_to_login_page(String un, String pwd) {
	   System.out.println(un+"\t"+pwd);
	}
	@Then("user should able to see his Account")
	public void user_should_able_to_see_his_account() {
	   System.out.println("User Connected...");
	}






	
}
