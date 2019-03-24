package stepdefinitions;

import com.qa.util.TestBase;

import FesticketPages.Festicketloginpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Festicketlogin extends TestBase {

	Festicketloginpage login;

	@Given("^User is already on Homepage$")
	public void user_is_already_on_Homepage() {

		openurl();
	}

	@When("^title of page is Festival Tickets$")
	public void title_of_page_is_Festival_Tickets() throws Throwable {

		login = new Festicketloginpage();
		login.validateHomepage();
		Thread.sleep(5000);

	}

	@Then("^user clicks on Login$")
	public void user_clicks_on_Login() throws Throwable {

		login = new Festicketloginpage();
		login.login();

	}

	@Then("^user enters valid credentials$")
	public void user_enters_valid_credentials() throws Throwable {

		;
		login = new Festicketloginpage();
		login.entermailid();
		login.enterpwd();
		login.clicksubmit();
		Thread.sleep(5000);

	}

	@Then("^user account should open$")
	public void user_account_should_open() throws Throwable {

		login = new Festicketloginpage();
		login.useraccount();
		login.validation();

	}

	@Then("^user clicks onlogout$")
	public void user_clicks_onlogout() throws Throwable {

		login = new Festicketloginpage();
		login.userlogout();
	}

}
