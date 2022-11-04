package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _FB_idpass {
	
	@FindBy (xpath="//input[@name='email']") private WebElement Facebook_ID;
	
	@FindBy (xpath="//input[@name='pass']") private WebElement Facebook_PSWD;
	
	@FindBy (xpath="//button[@value='1']") private WebElement Facebook_Login;
	
	public _FB_idpass(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void fb_id() {
		Facebook_ID.sendKeys("7843074869");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void fb_pwd() {
		Facebook_PSWD.sendKeys("Srikrushna@1");
	}
	
	public void fb_button() {
		Facebook_Login.click();
	}
	
	

}
