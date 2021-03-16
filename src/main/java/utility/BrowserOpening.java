package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static void launchwebsite() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/pratap/eclipse-workspace/Sample1/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");

	}

}
