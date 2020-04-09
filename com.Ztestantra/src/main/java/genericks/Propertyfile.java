package genericks;

import java.io.FileInputStream;

import java.util.Properties;

import org.testng.Reporter;

public class Propertyfile implements Autoconstant {
	public String getdata(String keyvalue)
	{
		Properties p = new Properties();
		try {
		p.load(new FileInputStream( propertyfilepath));
	
		}
		catch(Exception e)
		{
			Reporter.log("Data is not taken",true);
		}
		return p.getProperty(keyvalue);
		
	
		
		
		 
	}

}
