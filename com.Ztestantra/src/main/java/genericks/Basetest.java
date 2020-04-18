package genericks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest implements Autoconstant {
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		
		System.setProperty(Key,Value);
		driver=new ChromeDriver();
		Propertyfile p=new Propertyfile();
		driver.get(p.getdata("url"));
		driver.manage().window().maximize();
			
		
	}
	@AfterMethod
	public void closeapp(ITestResult r)
	{
		int status = r.getStatus();
		String name = r.getName();
		if(status==2)
		{
			new Photo().getphoto(driver,photopath,name);
		}
		driver.close();
	}

}
