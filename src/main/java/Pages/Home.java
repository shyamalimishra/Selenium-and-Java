package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class Home extends BaseClass
{
	//Page Factory Pattern
	@FindBy(xpath=" ")
	WebElement we;
	@FindBy(xpath=" ")
	WebElement url;
	
	public void InitializeElement()
	{
	 PageFactory.initElements(driver, this);
	}
	
	public void title()
	{
		
	}
	
	public void currenturl()
	{
	
	}

}
