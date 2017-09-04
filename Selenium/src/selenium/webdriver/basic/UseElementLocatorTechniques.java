package selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseElementLocatorTechniques {
	
WebDriver driver;
	
	public void invokeBrowser(String url){
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA\\Documents\\selenium_jars\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get(url);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closeBrowser(){
		driver.close();
	}
	
	public void elementLocatorTechniqueUsingAmazon(){
		try {
			invokeBrowser("http://www.amazon.in");
			driver.findElement(By.linkText("Your Amazon.in")).click();
			driver.navigate().back();
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lenovo Laptops");
			driver.findElement(By.className("nav-input")).click();
			
			driver.navigate().back();
			driver.findElement(By.partialLinkText("Customer")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void elementLocatorTechniqueUsingFacebook(){
		try {
			invokeBrowser("http://facebook.com");
			driver.findElement(By.name("firstname")).sendKeys("Sapna");
			//closeBrowser();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		UseElementLocatorTechniques obj = new UseElementLocatorTechniques();
		//obj.elementLocatorTechniqueUsingAmazon();
		obj.elementLocatorTechniqueUsingFacebook();
	}

}
