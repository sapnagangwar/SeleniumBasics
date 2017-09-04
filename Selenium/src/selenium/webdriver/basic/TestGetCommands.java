package selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGetCommands {
	WebDriver driver;
	
	public void invokeBrowser(){
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA\\Documents\\selenium_jars\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			
			getCommands();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void getCommands(){
		try {
			driver.get("http://www.amazon.in");
			String titleOfThePage=driver.getTitle();
			System.out.println("Title of the page is: " + titleOfThePage);
			driver.findElement(By.linkText("Today's Deals")).click();
			String currentUrl = driver.getCurrentUrl();
			System.out.println("The current URL is: "+ currentUrl);
			
			System.out.println("the current page source is : " + driver.getPageSource());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		TestGetCommands obj = new TestGetCommands();
		obj.invokeBrowser();
		
	}
	

}
