package StepsDefinations;

import org.junit.runner.RunWith;
import PageObjectModel.LoginPageObjects;
import base.baseClass;
import base.constant;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class MyStepDefinitions extends baseClass {
	
	
	

	@Given("^intialize the browser$")
	public void intialize_the_browser() throws Throwable {

		launchBrowser();
		//driver.get("https://login.salesforce.com/");

	}
	LoginPageObjects lpo;
	@When("^user enter usename and password$")
	public void user_enter_usename_and_password() throws Throwable {
		 lpo = new LoginPageObjects(driver);
		lpo.enterUsername().sendKeys(constant.username);
		lpo.enterPassword().sendKeys(constant.password);
	}

	@And("^click on login$")
	public void click_on_login() throws Throwable {
		 lpo = new LoginPageObjects(driver);
		lpo.clickLogin().click();
	}

	@Then("^user should be able to login succesfully$")
	public void user_should_be_able_to_login_succesfully() throws Throwable {
		System.out.println("done");
	}

}