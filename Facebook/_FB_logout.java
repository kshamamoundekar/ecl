package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _FB_logout {
	
	@FindBy (xpath="//div[@class='x1n2onr6 x78zum5']") private WebElement profile;

	@FindBy (xpath="//span[text()='Log Out']") private WebElement logout;
	
	
	public _FB_logout(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void profilebutton() {
		profile.click();
		
	}
	
	public void logoutbutton() {
		logout.click();
	}
	
	

}
