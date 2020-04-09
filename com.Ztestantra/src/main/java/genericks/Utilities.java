package genericks;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Utilities {
	public void dropdown(WebElement ele, String value)
	{
	Select s=new Select(ele);
	s.deselectByVisibleText(value);
	}
	
	public void mousehover(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();	
		
	}
	public void rightclick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
		
	}
	public void waitforelementtobeloaded(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	public void waitforelementtobeclickable(WebDriver driver,WebElement element)
	{
		WebDriverWait w= new WebDriverWait(driver,10);
		w.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void waitforvisiblity(WebDriver driver,WebElement element)
	{
		WebDriverWait w=new WebDriverWait(driver,10);
		w.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void Keyboardaction(int Keypressele,int Keyreleaseele)
	{
		try
		{
		Robot r = new Robot();
		r.keyPress(Keypressele);
		r.keyRelease(Keyreleaseele);
				
	}
		catch(Exception e)
		{
			Reporter.log("Key not entered",true);
		}
	}
}
