package pomClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipKart extends lgnPage {
	public static void main(String [] args) {
		launchBrowser("https://www.flipkart.com/");
		cancelBtn("//button[contains(@class,'Kp')]"
				);
	}

}

