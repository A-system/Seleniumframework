package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	@FindBy(xpath="((//a[@class='login'])")
	private WebElement signin;
	
	@FindBy(id="email")
	private WebElement emailtb;
	
	@FindBy(id="passwd")
	private WebElement passwordtb;
	
	@FindBy(id="SubmitLogin")
	private WebElement submitbtn;
	
	@FindBy(id="newsletter-input")
	private WebElement newslettertb;
	
	@FindBy(name="submitNewsletter")
	private WebElement gobtb;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public  HomePage validlogin(String email,String pass )
	{
		signin.click();
		emailtb.sendKeys(email);
		passwordtb.sendKeys(pass);
		submitbtn.click();
		newslettertb.sendKeys(email);
		gobtb.click();
		return new HomePage(driver);
		
    
		
		
		
	}
	
	
}
