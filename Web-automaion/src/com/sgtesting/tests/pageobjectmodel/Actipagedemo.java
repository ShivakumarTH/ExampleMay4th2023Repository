package com.sgtesting.tests.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actipagedemo {

	
	public Actipagedemo(WebDriver o)
	{
		PageFactory.initElements(o,this);
	}
    private WebElement username;
    public WebElement getUserName()
    {
    	return username;
    }
    private WebElement pwd;
    public WebElement getpassword()
    {
    	return pwd;
    }
    @FindBy(xpath="//*[@id=\"loginButton\"]/div")
    private WebElement login;
    public WebElement getLoginButton()
    {
    	return login;
    }
    private WebElement gettingStartedShortcutsMenuCloseId;
    public WebElement getFlyoutWindow()
    {
    	return gettingStartedShortcutsMenuCloseId;
    }
    @FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")
	private WebElement user;
	public WebElement getuser()
    {
    	return user;
    }
    @FindBy(xpath= "//*[@id=\"createUserDiv\"]/div/div[2]")
   	private WebElement adduser;
   	public WebElement getadduser()
   	{
    	return adduser;
   	}

	private WebElement firstName;
	public WebElement firstname()
	{
		return firstName;
	}
	private WebElement lastName;
	public WebElement lastname()
	{
		return lastName;
	}
	private WebElement email;
	public WebElement email()
	{
		return email;
	}
	private WebElement userDataLightBox_usernameField;
	public WebElement username()
	{
		return userDataLightBox_usernameField;
	}
	private WebElement password;
	public WebElement getpassword1()
	{
		return password;
	}
	private WebElement passwordCopy;
	public WebElement passwordCopy()
	{
		return passwordCopy;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement Savecopy;
	public WebElement getSavecopy()
	{
		return Savecopy;
	}
	@FindBy(xpath="//span[text()='user1, demo1']")
	private WebElement clickuser;
	public WebElement getclickonuser()
	{
		return clickuser;
	}
	private WebElement userDataLightBox_deleteBtn;
	public WebElement delete()
	{
		return userDataLightBox_deleteBtn;
    }
    @FindBy(xpath ="//*[@id=\"logoutLink\"]")
    private WebElement logout;
    public WebElement getlogout()
    {
    	return logout;
    }
    @FindBy(linkText="close")
    private WebElement close;
    public WebElement close1()
			{
		 return close;
			}


	public static  WebDriver p=null;
	public static Actipagedemo2 opage=null;
	public static void main(String[] args) {
		launch();
		Navigate();
		login();
		minimize();
		createuser();
		Modifyuser();
		deleteuser();
		Logout();
		 Close();
		 
		
	}
	private static void launch()
	{
		try {
			p=new ChromeDriver();
			opage=new Actipagedemo2(p);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Navigate()
	{
		try {
			p.get("http://localhost:81/login.do");
			Thread.sleep(3000);

		} catch (Exception e) {

		}
	}
	private static void login()
	{
		try {
			opage.getuserName().sendKeys("admin");
			Thread.sleep(2000);
			opage.getPassword().sendKeys("manager");
			Thread.sleep(2000);
		    opage.getLoginButton().click();
			Thread.sleep(2000);

		} catch (Exception e) {

		}
	}
	private static void minimize()
	{
		try {
			opage.getFlyOutwindow().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createuser()
	{
		try {
			opage.getuser().click();
			Thread.sleep(2000);
			opage.getadduser().click();
			Thread.sleep(2000);
			opage.firstname().sendKeys("demo1");
			Thread.sleep(2000);
			opage.lastname().sendKeys("user1");
			Thread.sleep(2000);
			opage.email().sendKeys("shiva@gmail.com");
			Thread.sleep(2000);
			opage.username().sendKeys("suman");
			Thread.sleep(2000);
			opage.getpassword().sendKeys("1234");
			Thread.sleep(2000);
			opage.passwordCopy().sendKeys("1234");
			Thread.sleep(2000);
		    opage.getSavecopy().click();
		    Thread.sleep(4000);;

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Modifyuser()
	{
		try {
			opage.getModify().click();
			Thread.sleep(2000);
			opage.getclearlastName().clear();
			Thread.sleep(2000);
			opage.getModifylastName().sendKeys("shivu");
			Thread.sleep(2000);
			opage.getanotherlastname().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try {
			opage.getdelete().click();
			Thread.sleep(2000);
			opage.getdelete1().click();
			Thread.sleep(2000);
			p.switchTo().alert().accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try {
			opage.getLogoutButton().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Close()
	{
		try {
			p.close();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}


	


