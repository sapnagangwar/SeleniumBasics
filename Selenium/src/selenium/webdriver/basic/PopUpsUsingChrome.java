package selenium.webdriver.basic;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpsUsingChrome {
	public static void main(String[] args) {
		
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA\\Documents\\selenium_jars\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			
			driver.get("https://hdfcbank.com");
			
			String homepage = driver.getWindowHandle();
			System.out.println(homepage);
			
			driver.findElement(By.xpath("//*[@id='loginsubmit']")).click();
			
			driver.findElement(By.xpath("//*[@id='cee_closeBtn']/img")).click();
			
			Set<String> windows = driver.getWindowHandles();
			System.out.println(windows.size());
			
			
			Iterator ite = windows.iterator();
			String currentWindowId;
			
			while(ite.hasNext()){
				currentWindowId = ite.next().toString();
				System.out.println(currentWindowId);
				
				if(!currentWindowId.equals(homepage)){
					driver.switchTo().window(currentWindowId);
					//driver.close();
					driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/a")).click();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}


