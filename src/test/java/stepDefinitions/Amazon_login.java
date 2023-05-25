package stepDefinitions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Amazon_login {
	

	
	
	@Given("^Install App and login the page$")
	public void install_App_and_login_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DesiredCapabilities dc= new DesiredCapabilities();
	    dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	    dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	    dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
	    dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
	    dc.setCapability("autoGrantPermissions", true);
	    dc.setCapability(MobileCapabilityType.APP, "C:\\Apk files\\amazon-shopping-26-7-0-100.apk");
//	    dc.setCapability("appPackage", appPackage);
//	    dc.setCapability("appActivity", appActivity);
	    URL url=new URL("http://0.0.0.0:4723/wd/hub");
	    AndroidDriver driver=new AndroidDriver(url,dc);
	    driver.launchApp();
	   // driver.quit();
	}
	
	@Given("^Click signin button$")
	public void click_signin_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
		
	@When("^User enter valid Email=\"([^\"]*)\"$")
	public void user_enter_valid_Email(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
		
	@When("^Click continue button$")
	public void click_continue_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
		
	@When("^Enter valid password=\"([^\"]*)\"$")
	public void enter_valid_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
		
	@When("^Click sign in button$")
	public void click_sign_in_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
		
	@Then("^Navigate to the home page$")
	public void navigate_to_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}
