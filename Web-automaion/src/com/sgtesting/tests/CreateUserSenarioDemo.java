package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserSenarioDemo {
    public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
	minimizeFlyoutWindow();	
	 createuser();
   deleteuser();
   Logout();
   close();


	}
	private static void launchBrowser()
	{
		try {
			oBrowser= new ChromeDriver();
			 Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
						
		}
	}
private static void navigate()
{
	try {
		oBrowser.get("http://localhost:81/login.do");
		Thread.sleep(2000);
			
		
	} catch (Exception e) {
		e.printStackTrace();
	

	}

  }
 private static void login()
 {
	 try {
		 oBrowser.findElement(By.id("username")).sendKeys("admin");
		 oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();  
			Thread.sleep(2000);
		
	} catch (Exception e) {
		e.printStackTrace();
			}
 }
   private static void  minimizeFlyoutWindow()
   {
	   try {
		   oBrowser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']")).click();
		   Thread.sleep(2000);
		
	} catch (Exception e) {
		e.printStackTrace();
		
	}
	 
   }
   private static void createuser()
   {
	   try {
		   oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();	
		   Thread.sleep(2000);
		   oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
		   Thread.sleep(2000);
		   oBrowser.findElement(By.name("firstName")).sendKeys("demo");
	
		   oBrowser.findElement(By.name("lastName")).sendKeys("User1");
		   oBrowser.findElement(By.name("email")).sendKeys("shiva@gmail.com");
		   oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
		   oBrowser.findElement(By.name("password")).sendKeys("welcome");
		   oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome");
		   oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
		   Thread.sleep(2000);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	    
   }
     private static void deleteuser()
     {
    	 try {
    		 oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
    		 Thread.sleep(2000);
    		 oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
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
 			oBrowser.findElement(By.linkText("Logout")).click();
 			Thread.sleep(2000);
 			
 			
 		} catch (Exception e)
 		{
 			e.printStackTrace();
 		}
 	}
     private static void close()
     {
    	 try {
    		 oBrowser.close();
    		 Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
     }
}
