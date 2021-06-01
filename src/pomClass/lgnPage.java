package pomClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lgnPage {
	static WebDriver driver;
	public static void launchBrowser(String url) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace1\\seleniumDay2\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);	
	}

	public static void cancelBtn(String loc) {
		WebElement btn = driver.findElement(By.xpath("//button[contains(@class,'Kp')]"));
		btn.click();
		
	
	}

}
