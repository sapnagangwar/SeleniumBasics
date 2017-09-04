package selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUps {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette","C:\\Users\\QA\\Documents\\selenium_jars\\geckodriver-v0.18.0-win64s\\geckodriver.exe");
		// System.setProperty("webdriver.gecko.driver",
		// "C:\\Users\\QA\\Documents\\selenium_jars\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.softwaretestingmaterial.com/software-testing-interview-questions-free-ebook/");

		System.out.println("Selenium Webdriver Script in Firefox browser using Gecko Driver | Software Testing Material");

		driver.close();

	}

}
