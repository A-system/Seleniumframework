package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	public WebDriver driver;
	
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement plusbtn;
	
	@FindBy(id="group_1")
	private WebElement sizedropdown;

	public WebElement getSizedropdown() {
		return sizedropdown;		
	
	}
	@FindBy(name="Blue")
	private WebElement colorbtn;
	
	@FindBy(xpath="//span[.='Add to cart']")
	private WebElement cartbtn;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
     private WebElement checkoutbtn;
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	public void plusbutton()
	{
		plusbtn.click();
	}
	
	public void addingtocart()
	{
		colorbtn.click();
		cartbtn.click();
		checkoutbtn.click();
		
		
		
	}
	
	
}
