import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination
{
	BaseTTest b;
	HomePage h;
	@Given("^go to url$")
	public void go_to_url() throws Throwable {
		 b=new BaseTTest();
		 h=b.openBrowser();
	}

	@When("^type userid$")
	public void type_userid() throws Throwable {
	   h.typeUserId();
	}

	@When("^type password$")
	public void type_password() throws Throwable {
	   h.typePass();
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    
	}

	@Then("^i should be in login page$")
	public void i_should_be_in_login_page() throws Throwable {
	    
	}
	@When("^verify title$")
	public void verify_title() throws Throwable {
	   
	}

}
