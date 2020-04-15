package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericks.Basetest;
import genericks.Propertyfile;
import genericks.Utilities;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class Addingproducttocart extends Basetest {
	@Test
	public void addingproduct()
	{
		Propertyfile p=new Propertyfile();
		Utilities u=new Utilities();
		u.waitforelementtobeloaded(driver);
		LoginPage l=new LoginPage(driver);
		Assert.assertEquals(p.getdata("hometitle"),"My account - My Store");
		HomePage h = l.validlogin(p.getdata("email"),p.getdata("pass"));
		ProductPage pr = h.Searchingfordress(p.getdata("productname"));
		u.dropdown(pr.getSortdropdown(),p.getdata("sort"));
		CartPage c = pr.selectingdress();
		for(int i=0;i<=3;i++)
		{
			c.plusbutton();
		}
		u.dropdown(c.getSizedropdown(),p.getdata("size"));
		c.addingtocart();
		Assert.assertEquals(p.getdata("endtitle"), "Order - My Store");
		
	}
   
}
