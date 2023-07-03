package com.sgtesting.tests.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actipagedemo2 {

	public  Actipagedemo2(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
	}

	//Create WebElement for UserName
		private  WebElement username;
		public WebElement getuserName()
		{
			return username;
		}
		//Create WebElement for password
		private WebElement pwd;
		public WebElement getPassword()
		{
			return pwd;
		}
		//create WebElement for Login button
		@FindBy(xpath="//*[@id=\"loginButton\"]/div")
		private WebElement OLogin;
		public WebElement getLoginButton()
		{
			return OLogin;
		}
		//create WebElement for Flyoutwindow
		private WebElement gettingStartedShortcutsPanelId;
		public WebElement getFlyOutwindow()
		{
			return gettingStartedShortcutsPanelId;
		}
		
		//create WebElement for createuser
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
		public WebElement getpassword()
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
		//create webelement for modifyuser
		@FindBy(xpath="//span[text()='user1, demo1']")
	    private WebElement Modifycopy;
	    public WebElement getModify()
	    {
			return Modifycopy;
	    }
		
		private WebElement userDataLightBox_lastNameField;
		public WebElement getclearlastName()
		{
			return userDataLightBox_lastNameField;
		}
		@FindBy(xpath="//*[@id=\"userDataLightBox_lastNameField\"]")
		private WebElement lastName2;
		public WebElement getModifylastName()
		{
			return lastName2;
		}
		@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div")
		private WebElement Name;
		public WebElement getanotherlastname()
		{
			return Name;
		}
		//create webelement for deleteuser()
		@FindBy(xpath="//span[text()='mani, demo1']")
		private WebElement deletebutton;
		public WebElement getdelete()
		{
			return deletebutton;
		}
		private WebElement userDataLightBox_deleteBtn;
		public WebElement getdelete1()
		{
			return userDataLightBox_deleteBtn;
		}
		//create webelement for Logout()
		@FindBy(linkText="Logout")
		private WebElement oLogout;
		public WebElement getLogoutButton()
		{
			return oLogout;
		}

	public static WebDriver oBrowser=null;
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
			oBrowser=new ChromeDriver();
			opage=new Actipagedemo2(oBrowser);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Navigate()
	{
		try {
			oBrowser.get("http://localhost:81/login.do");
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
			opage.email().sendKeys("shivu@gmail.com");
			Thread.sleep(2000);
			opage.username().sendKeys("shivu");
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
			oBrowser.switchTo().alert().accept();
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
			oBrowser.close();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
