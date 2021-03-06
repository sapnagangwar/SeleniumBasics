package selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroductionSelenium {
	
	WebDriver driver;
	JavascriptExecutor jse;
	
	public void invokeBrowser(){
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA\\Documents\\selenium_jars\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			
			driver.get("https://www.edureka.co/");
			
			searchCourse();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void searchCourse(){
		driver.findElement(By.id("homeSearchBar")).sendKeys("java");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("homeSearchBarIcon")).click();
		
		jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0,700)");
		driver.findElement(By.xpath("//label[contains(text(),'Weekend')]")).click();
	}
	
	public static void main(String[] args) {
		IntroductionSelenium myObj = new IntroductionSelenium();
		myObj.invokeBrowser();
		
		
	}

}
