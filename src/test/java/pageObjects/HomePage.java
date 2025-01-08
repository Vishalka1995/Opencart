package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//span[normalize-space()='My Account']") 
	WebElement linkMyaccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement linkRegister;
	
	@FindBy(linkText="Login")
	WebElement linkLogin;
	
	public void clickmyaccount()
	{
		linkMyaccount.click();
	}
	
	public void clickregister()
	{
		linkRegister.click();
	}
	
	public void clicklogin()
	{
		linkLogin.click();
	}
	
}
