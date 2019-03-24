package FesticketPages;

import org.junit.Assert;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class Festicketloginpage extends TestBase {
	public Festicketloginpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='styles__c-sc-18mb93d-1 cuBAHz'] //span[contains(text(),'Log in')]")
	WebElement Loginbutton;

	@FindBy(id = "emailInput")
	WebElement mailid;
	@FindBy(id = "passwordInput")
	WebElement password;
	@FindBy(xpath = "//button[@id='submitButton']")
	WebElement Submit;
	@FindBy(xpath = "//ul[@class='app-components-menus-HorizontalMenu-styles__list']//div[@class='sc-brqgnP eCCxxj'] //span[contains(text(),'J')]")
	WebElement Useraccount;
	@FindBy(xpath = "//div[@class='sc-cvbbAY hiQMyw']  //h3[contains(text(),'jyothi addala')]")
	WebElement ValidateUser;
	@FindBy(xpath = "//div[@class='sc-cvbbAY hiQMyw']//a[contains(text(),'Log out')]")
	WebElement logout;

	public String validateHomepage() {
		String Homepagetitle = driver.getTitle();
		System.out.println(Homepagetitle);
		Assert.assertEquals("Festival Tickets | Your Festival Experience Starts Here – Festicket", Homepagetitle);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		return Homepagetitle;
	}

	public void login() {
		Loginbutton.click();

	}

	public void entermailid() {
		mailid.clear();
		mailid.sendKeys(prop.getProperty("username"));
		
	}

	public void enterpwd() {
		password.clear();
		password.sendKeys(prop.getProperty("password"));
	}

	public void clicksubmit() {
		Submit.click();

	}

	public void useraccount() {
		Useraccount.click();

	}

	public void validation() {
		String Usertitle = ValidateUser.getText();

		Assert.assertEquals(Usertitle, "jyothi addala");

		System.out.println("Excepted user logged in ");
	}

	public void userlogout() {

		logout.click();
	}

}
