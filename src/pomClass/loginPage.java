package pomClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends lgnPage {

	public loginPage() {
		
		PageFactory.initElements(driver,this);
	}

	public WebElement btn;

}
