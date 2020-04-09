package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
	
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement plusbt;
	
	@FindBy(id="group_1")
	private WebElement sizedropdown;

	public WebElement getSizedropdown() {
		return sizedropdown;		
	
	}
	@FindBy(name="Blue")
	private WebElement colorbt;
	
	
}
