package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;
import Pages.Home;

public class Login extends BaseClass
{
//PAgeFactory
	//1. Object Repository
	//2. PageFactory Initialization
	//3. Action
	
	@FindBy(xpath="//input(name='username'")
	WebElement username;
	@FindBy(xpath="//input(name='password'")
	WebElement password;
	@FindBy(xpath="//input(value='Login'")
	WebElement submit;
	
	
	public Login()
	{
	PageFactory.initElements(driver, this);
	}
	
	//public void login(String usern, String Pass)
	public Home login(String usern, String pass)
	{	
		username.sendKeys(usern);
		password.sendKeys(pass);
		submit.click();	
		return new Home();
		
	}
	
	

}
