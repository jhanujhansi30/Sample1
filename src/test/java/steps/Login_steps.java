package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_steps {

	static WebDriver driver;

	@Given("^I am on ebay Application$")
	public void i_am_on_ebay_Application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "/Users/pratap/eclipse-workspace/TestProject/chromedriver");
		driver = new ChromeDriver();

	}

	@When("^I clicked on the click$")
	public void i_clicked_on_the_click() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		driver.navigate().to("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	}

	@Then("^I should navigate to the Serach page$")
	public void i_should_navigate_to_the_Serach_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(driver.getTitle());
	}

}
