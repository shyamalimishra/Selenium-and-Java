package BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class BaseClass
{
	public static WebDriver driver;
	public static Properties prop;
	public BaseClass() 
	{
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("C:\\Shyamali\\Testing\\Selenium\\javacode\\MavenFreeCRM\\src\\main\\java\\Configuration\\config.properties"));
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
		
		
	
    public void initialization()
{
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.get(prop.getProperty("url"));
}
}
