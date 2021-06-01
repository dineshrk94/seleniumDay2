package seleniumDay2; 
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class selenium {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace1\\seleniumDay2\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html\r\n ");
		driver.manage().window().maximize();
		WebElement btn = driver.findElement(By.name("adress"));
		btn.sendKeys("chennai");
		}
		
	}