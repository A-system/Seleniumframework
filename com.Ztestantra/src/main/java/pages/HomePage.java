package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	
	@FindBy(id="search_query_top")
	private WebElement searchtb;
	
	@FindBy(name="submit_search")
	private WebElement searchbt;
	
		
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	


public ProductPage Searchingfordress(String productname)

{
	searchtb.sendKeys(productname);
	searchbt.click();
	return new ProductPage(driver);
}

	

}
