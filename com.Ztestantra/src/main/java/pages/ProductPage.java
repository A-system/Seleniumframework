package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.microsoft.schemas.office.visio.x2012.main.VisioDocumentDocument1;

public class ProductPage {
	public WebDriver driver;
	
	@FindBy(id="selectProductSort")
	private WebElement sortdropdown;
	
	public WebElement getSortdropdown() {
		return sortdropdown;
	}

	@FindBy(xpath="(//a[@title='Faded Short Sleeve T-shirts'])[2]")
	private WebElement selectdress;
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
		

	public CartPage selectingdress()
	{
	
	selectdress.click();
	return new CartPage(driver);
	}

}
