package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class Home extends BaseClass
{
	//Page Factory Pattern
	@FindBy(xpath=" ")
	WebElement we;
	
	public void InitializeElement()
	{
	 PageFactory.initElements(driver, this);
	}
	
	public void title()
	{
		
	}

}
