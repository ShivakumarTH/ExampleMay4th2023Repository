package com.sgtesting.tests.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Advance1<Advancescenerio1> {
	public Advance1(WebDriver o)
	{

		PageFactory.initElements(o, this);
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


	@FindBy(xpath= "//*[@id=\"createUserDiv\"]/div/div[2]")
	private WebElement adduser1;
	public WebElement getadduser1()
	{
		return adduser1;
	}
	private WebElement userDataLightBox_firstNameField;
	public WebElement firstname1()
	{
		return userDataLightBox_firstNameField;
	}
	private WebElement userDataLightBox_lastNameField;
	public WebElement lastname1()
	{
		return userDataLightBox_lastNameField;
	}
	private WebElement userDataLightBox_emailField;
	public WebElement email1()
	{
		return userDataLightBox_emailField;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_usernameField\"]")
	private WebElement userna ;
	public WebElement username1()
	{
		return userna;
	}
	private WebElement userDataLightBox_passwordField;
	public WebElement getpassword1()
	{
		return userDataLightBox_passwordField;
	}
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement passwordCopy1()
	{
		return userDataLightBox_passwordCopyField;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement Savecopy1;
	public WebElement getSavecopy1()
	{
		return Savecopy1;
	}


	@FindBy(xpath= "//*[@id=\"createUserDiv\"]/div/div[2]")
	private WebElement adduser2;
	public WebElement getadduser2()
	{
		return adduser1;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_firstNameField\']")
	private WebElement fir;
	public WebElement firstname2()
	{
		return fir;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_lastNameField\"]")
	private WebElement las;
	public WebElement lastname2()
	{
		return las;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_emailField\']")
	private WebElement em;
	public WebElement email2()
	{
		return em;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_usernameField\"]")
	private WebElement usernam;
	public WebElement username2()
	{
		return usernam;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
	private WebElement pas;
	public WebElement getpassword2()
	{
		return pas;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
	private WebElement pasc;
	public WebElement passwordCopy2()
	{
		return pasc;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement Savecopy2;
	public WebElement getSavecopy2()
	{
		return Savecopy2;
	}
	//Create webelement for Logoutasadmin
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogoutasadmin()
	{
		return oLogout;
	}
	//Create webelement for Loginasuser1
	@FindBy(xpath="//*[@id=\"username\"]")
	private WebElement use;
	public WebElement getu()
	{
		return use;
	}
	@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
	private WebElement pa;
	public WebElement getpas()
	{
		return pa;
	}
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lo;
	public WebElement getlo()
	{
		return lo;
	}
	@FindBy(xpath="//span[text()='Start exploring actiTIME']")
	private WebElement exp;
	public WebElement getexp()
	{
		return exp;
	}
	//Create webelement for Logoutasuser1
	@FindBy(linkText="Logout")
	private WebElement Logoutu1;
	public WebElement getLogoutasu1()
	{
		return Logoutu1;
	}
	
	//Create webelement for Loginasuser2
		@FindBy(xpath="//*[@id=\"username\"]")
		private WebElement use2;
		public WebElement getu2()
		{
			return use2;
		}
		@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
		private WebElement pa2;
		public WebElement getpas2()
		{
			return pa2;
		}
		@FindBy(xpath="//div[text()='Login ']")
		private WebElement lo2;
		public WebElement getlo2()
		{
			return lo2;
		}
		@FindBy(xpath="//span[text()='Start exploring actiTIME']")
		private WebElement exp2;
		public WebElement getexp2()
		{
			return exp2;
		}
		//Create webelement for Logoutasuser2
		@FindBy(linkText="Logout")
		private WebElement Logoutu2;
		public WebElement getLogoutasu2()
		{
			return Logoutu2;
		}
		
		//Create webelement for Loginasuser1
		@FindBy(xpath="//*[@id=\"username\"]")
		private WebElement use3;
		public WebElement getu3()
		{
			return use;
		}
		@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
		private WebElement pa3;
		public WebElement getpas3()
		{
			return pa;
		}
		@FindBy(xpath="//div[text()='Login ']")
		private WebElement lo3;
		public WebElement getlo3()
		{
			return lo3;
		}
		@FindBy(xpath="//span[text()='Start exploring actiTIME']")
		private WebElement exp3;
		public WebElement getexp3()
		{
			return exp3;
		}
		//Create webelement for Logoutasuser3
		@FindBy(linkText="Logout")
		private WebElement Logoutu3;
		public WebElement getLogoutasu3()
		{
			return Logoutu3;
		}
		
		@FindBy(xpath="//*[@id=\"username\"]")
		private  WebElement userad;
		public WebElement getuserad()
		{
			return userad;
		}
		//Create WebElement for password
		@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
		private WebElement pwd1;
		public WebElement getPasswo()
		{
			return pwd1;
		}
		//create WebElement for Login button
		@FindBy(xpath="//*[@id=\"loginButton\"]/div")
		private WebElement Login;
		public WebElement getLogin()
		{
			return Login;
		}
		@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")
		private WebElement user1;
		public WebElement getuser1()
		{
			return user1;
		}
		@FindBy(xpath="//span[text()='user1, demo1']")
        private  WebElement userco1;
		public WebElement getuserco()
		{
			return userco1;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
		private WebElement pas1;
		public WebElement getpassword3()
		{
			return pas1;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
		private WebElement pas2;
		public WebElement getpassword4()
		{
			return pas2;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
		private WebElement pasc1;
		public WebElement passwordCopy3()
		{
			return pasc1;
		}
		@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
		private WebElement Savecopy3;
		public WebElement getSavecopy3()
		{
			return Savecopy3;
		}
		
		
		@FindBy(xpath="//span[text()='user2, demo2']")
        private  WebElement userco2;
		public WebElement getuserco1()
		{
			return userco2;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
		private WebElement pas4;
		public WebElement getpassword6()
		{
			return pas4;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
		private WebElement pas3;
		public WebElement getpassword5()
		{
			return pas3;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
		private WebElement pasc2;
		public WebElement passwordCopy4()
		{
			return pasc2;
		}
		@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
		private WebElement Savecopy4;
		public WebElement getSavecopy4()
		{
			return Savecopy4;
		}
		
		@FindBy(xpath="//span[text()='user3, demo3']")
        private  WebElement userc2;
		public WebElement getuserco2()
		{
			return userc2;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
		private WebElement pasw1;
		public WebElement getpasswor3()
		{
			return pasw1;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
		private WebElement pasw2;
		public WebElement getpasswor4()
		{
			return pasw2;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
		private WebElement pasco1;
		public WebElement passwordCop3()
		{
			return pasco1;
		}
		@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
		private WebElement Savecop3;
		public WebElement getSavecop3()
		{
			return Savecop3;
		}
		//Create webelement for Logoutasadmin
		@FindBy(linkText="Logout")
		private WebElement Logout;
		public WebElement getLogoutasadmi()
		{
			return Logout;
		}
		
		//Create webelement for Loginasuser1
		@FindBy(xpath="//*[@id=\"username\"]")
		private WebElement use1;
		public WebElement getu1()
		{
			return use1;
		}
		@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
		private WebElement pa1;
		public WebElement getpas1()
		{
			return pa1;
		}
		@FindBy(xpath="//div[text()='Login ']")
		private WebElement lo1;
		public WebElement getlo1()
		{
			return lo1;
		}
		
		@FindBy(linkText="Logout")
		private WebElement Logoutu4;
		public WebElement getLogoutasu4()
		{
			return Logoutu4;
		}
		
		@FindBy(xpath="//*[@id=\"username\"]")
		private WebElement us3;
		public WebElement getu4()
		{
			return us3;
		}
		@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
		private WebElement pa4;
		public WebElement getpas4()
		{
			return pa4;
		}
		@FindBy(xpath="//div[text()='Login ']")
		private WebElement lo4;
		public WebElement getlo4()
		{
			return lo4;
		}
		@FindBy(linkText="Logout")
		private WebElement Logoutu5;
		public WebElement getLogoutasu5()
		{
			return Logoutu5;
		}
		
		@FindBy(xpath="//*[@id=\"username\"]")
		private WebElement us4;
		public WebElement getu5()
		{
			return us4;
		}
		@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
		private WebElement pa5;
		public WebElement getpas5()
		{
			return pa5;
		}
		@FindBy(xpath="//div[text()='Login ']")
		private WebElement lo5;
		public WebElement getlo5()
		{
			return lo5;
		}
		@FindBy(linkText="Logout")
		private WebElement Logoutu6;
		public WebElement getLogoutasu6()
		{
			return Logoutu6;
		}
		
		@FindBy(xpath="//*[@id=\"username\"]")
		private  WebElement userad1;
		public WebElement getuserad1()
		{
			return userad;
		}
		//Create WebElement for password
		@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
		private WebElement pwd2;
		public WebElement getPasswo1()
		{
			return pwd2;
		}
		//create WebElement for Login button
		@FindBy(xpath="//*[@id=\"loginButton\"]/div")
		private WebElement Login1;
		public WebElement getLogin1()
		{
			return Login1;
		}
		
		@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")
		private WebElement user2;
		public WebElement getuser2()
		{
			return user2;
		}
		
		//create webelement for delete
		@FindBy(xpath="//span[text()='user1, demo1']")
        private  WebElement userco3;
		public WebElement getuserco3()
		{
			return userco3;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
		private WebElement userDataLightBox_deleteBtn;
		public WebElement getdelete()
		{
			return userDataLightBox_deleteBtn;
		}
		
		@FindBy(xpath="//span[text()='user2, demo2']")
        private  WebElement userco4;
		public WebElement getuserco4()
		{
			return userco4;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
		private WebElement delete1;
		public WebElement getdelete1()
		{
			return delete1;
		}
		
		@FindBy(xpath="//span[text()='user3, demo3']")
        private  WebElement userco5;
		public WebElement getuserco5()
		{
			return userco5;
		}

@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
private WebElement userDataLightBox_deleteBtn2;
private WebElement delete2;
public WebElement getdelete2()
		{
			return delete2;
		}
		
		//create WebElement for Logoutlink()
		@FindBy(linkText="Logout")
		private WebElement o1Logout;
		public WebElement getLogoutButton()
		{
			return o1Logout;
		}
		 //create WebElement for Close()	
		private WebElement close;
		public WebElement Close()
		{
			return close;
		}
		{
		

		}
			public static WebDriver l=null;
			public static Advance1 opage=null;
			public static void main(String[] args) {
				launch();
				navigate();
				login();
				Minimize();
				CreateUser();Logoutasaadmin();
				Loginasu1(); Logoutasu1();
				Loginasu2(); Logoutasu2();
				Loginasu3(); Logoutasu3();
				Loginasadmin();
				Modifyu1();   Logoutasaadmi();
				Loginasuse1(); Logoutasuse1();
				Loginasuse2(); Logoutasus1();
				Loginasuse3(); Logoutasu();
				Loginasadmin1();
				deleteu1();  Logoutasadmin();
				Close1();
			}
			private static void launch()
			{
				try {
					l=new ChromeDriver();
					opage=new Advance1(l);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			private static void navigate()
			{
				try {
					l.get("http://localhost:81/login.do");
					Thread.sleep(3000);

				} catch (Exception e) {
					e.printStackTrace();
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
					e.printStackTrace();

				}
			}
			private static void Minimize()
			{
				try {
					opage.getFlyOutwindow().click();
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			private static void CreateUser()
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
					opage.email().sendKeys("shivu38@gmail.com");
					Thread.sleep(2000);
					opage.username().sendKeys("suman");
					Thread.sleep(2000);
					opage.getpassword().sendKeys("1234");
					Thread.sleep(2000);
					opage.passwordCopy().sendKeys("1234");
					Thread.sleep(2000);
					opage.getSavecopy().click();
					Thread.sleep(4000);
					opage.getadduser1().click();
					Thread.sleep(2000);
					opage.firstname1().sendKeys("demo2");
					Thread.sleep(2000);
					opage.lastname1().sendKeys("user2");
					Thread.sleep(2000);
					opage.email1().sendKeys("shivu65@gmail.com");
					Thread.sleep(2000);
					opage.username1().sendKeys("mani");
					Thread.sleep(2000);
					opage.getpassword1().sendKeys("2468");
					Thread.sleep(2000);
					opage.passwordCopy1().sendKeys("2468");
					Thread.sleep(2000);
					opage.getSavecopy1().click();
					Thread.sleep(2000); 

					opage.getadduser2().click();
					Thread.sleep(2000);
					opage.firstname2().sendKeys("demo3");
					Thread.sleep(2000);
					opage.lastname2().sendKeys("user3");
					Thread.sleep(2000);
					opage.email1().sendKeys("shivu651@gmail.com");
					Thread.sleep(2000);
					opage.username2().sendKeys("shivu");
					Thread.sleep(2000);
					opage.getpassword2().sendKeys("3456");
					Thread.sleep(2000);
					opage.passwordCopy1().sendKeys("3456");
					Thread.sleep(2000);
					opage.getSavecopy2().click();
					Thread.sleep(2000); 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			private static void Logoutasaadmin()
			{
				try {
					opage.getLogoutasadmin().click();
					Thread.sleep(2000);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			private static void Loginasu1()
			{
				try {
					opage.getu().sendKeys("suman");
					Thread.sleep(2000);
					opage.getpas().sendKeys("1234");
					Thread.sleep(2000);
					opage.getlo().click();
					Thread.sleep(2000);	
					opage.getexp().click();
					Thread.sleep(2000);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			private static void Logoutasu1()
			{
				try {
					opage.getLogoutasu1().click();
					Thread.sleep(2000);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}


			private static void Loginasu2()
			{
				try {
					opage.getu2().sendKeys("mani");
					Thread.sleep(2000);
					opage.getpas2().sendKeys("2468");
					Thread.sleep(2000);
					opage.getlo2().click();
					Thread.sleep(2000);	
					opage.getexp2().click();
					Thread.sleep(2000);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			private static void Logoutasu2()
			{
				try {
					opage.getLogoutasu2().click();
					Thread.sleep(2000);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}


			private static void Loginasu3()
			{
				try {
					opage.getu3().sendKeys("shivu");
					Thread.sleep(2000);
					opage.getpas3().sendKeys("3456");
					Thread.sleep(2000);
					opage.getlo3().click();
					Thread.sleep(2000);	
					opage.getexp3().click();
					Thread.sleep(2000);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			private static void Logoutasu3()
			{
				try {
					opage.getLogoutasu3().click();
					Thread.sleep(2000);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			private static void Loginasadmin()
			{
				try {
					opage.getuserad().sendKeys("admin");
					Thread.sleep(2000);
					opage.getPasswo().sendKeys("manager");
					Thread.sleep(2000);
					opage.getLogin().click();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			private static void Modifyu1()
			{
				try {
					opage.getuser1().click();
					Thread.sleep(2000);
					opage.getuserco().click();
					Thread.sleep(2000);
					opage.getpassword3().clear();
					Thread.sleep(2000);
					opage.getpassword4().sendKeys("5678");
					Thread.sleep(2000);
					opage.passwordCopy3().sendKeys("5678");
					Thread.sleep(2000);
					opage.getSavecopy3().click();
					Thread.sleep(4000);

					opage.getuserco1().click();
					Thread.sleep(2000);
					opage.getpassword6().clear();
					Thread.sleep(2000);
					opage.getpassword5().sendKeys("samp");
					Thread.sleep(2000);
					opage.passwordCopy4().sendKeys("samp");
					Thread.sleep(2000);
					opage.getSavecopy4().click();
					Thread.sleep(4000);

					opage.getuserco2().click();
					Thread.sleep(2000);
					opage.getpasswor3().clear();
					Thread.sleep(2000);
					opage.getpasswor4().sendKeys("manj");
					Thread.sleep(2000);
					opage.passwordCop3().sendKeys("manj");
					Thread.sleep(2000);
					opage.getSavecop3().click();
					Thread.sleep(4000);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			private static void Logoutasaadmi()
			{
				try {
					opage.getLogoutasadmi().click();
					Thread.sleep(2000);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}



			private static void Loginasuse1()
			{
				try {
					opage.getu4().sendKeys("suman");
					Thread.sleep(2000);
					opage.getpas4().sendKeys("5678");
					Thread.sleep(2000);
					opage.getlo4().click();
					Thread.sleep(2000);	


				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			private static void Logoutasuse1()
			{
				try {
					opage.getLogoutasu5().click();
					Thread.sleep(2000);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}


			private static void Loginasuse2()
			{
				try {
					opage.getu5().sendKeys("mani");
					Thread.sleep(2000);
					opage.getpas5().sendKeys("samp");
					Thread.sleep(2000);
					opage.getlo5().click();
					Thread.sleep(2000);	

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			private static void Logoutasus1()
			{
				try {
					opage.getLogoutasu6().click();
					Thread.sleep(2000);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			private static void Loginasuse3()
			{
				try {
					opage.getu5().sendKeys("shivu");
					Thread.sleep(2000);
					opage.getpas5().sendKeys("manj");
					Thread.sleep(2000);
					opage.getlo5().click();
					Thread.sleep(2000);	

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			private static void Logoutasu()
			{
				try {
					opage.getLogoutasu6().click();
					Thread.sleep(2000);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			private static void Loginasadmin1()
			{
				try {
					opage.getuserad1().sendKeys("admin");
					Thread.sleep(2000);
					opage.getPasswo1().sendKeys("manager");
					Thread.sleep(2000);
					opage.getLogin1().click();
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			private static void deleteu1()
			{
				try {
					opage.getuser2().click();
					Thread.sleep(2000);
					opage.getuserco3().click();
					Thread.sleep(2000);
					opage.getdelete().click();
					Thread.sleep(2000);
					l.switchTo().alert().accept();
					Thread.sleep(2000);
					
					opage.getuserco4().click();
					Thread.sleep(2000);
					opage.getdelete1().click();
					Thread.sleep(2000);
					l.switchTo().alert().accept();
					Thread.sleep(2000);
					
					opage.getuserco4().click();
					Thread.sleep(2000);
					opage.getdelete2().click();
					Thread.sleep(2000);
					l.switchTo().alert().accept();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			private static void Logoutasadmin()
			{
				try {
					opage.getLogoutButton().click();
					Thread.sleep(2000);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			private static void Close1()
			{
				try {
					l.close();
					Thread.sleep(2000);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}


		}

		

