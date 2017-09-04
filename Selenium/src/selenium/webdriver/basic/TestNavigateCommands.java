package selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNavigateCommands {
WebDriver driver;
	
	public void invokeBrowser(){
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA\\Documents\\selenium_jars\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			
			navigateCommands();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void navigateCommands(){
		try {
			driver.navigate().to("http://flipkart.com");
			driver.findElement(By.xpath("//span[starts-with(text(),'Appliances')]")).click();
			driver.findElement(By.xpath("//span[contains(text(), 'Microwave Ovens')]")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		TestNavigateCommands obj = new TestNavigateCommands();
		obj.invokeBrowser();
		
	}
	

}
