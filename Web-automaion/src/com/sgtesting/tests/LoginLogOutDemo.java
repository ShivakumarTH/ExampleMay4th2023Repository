package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogOutDemo {
	private static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		 Minimize();
		 Logout();

	}
	private static void launchBrowser()
	{
		try {
			oBrowser=new ChromeDriver();
			
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
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
	   	oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();                    
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	private static void Minimize()
	{
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try {
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(5000);
			
			
		} catch (Exception e) {
			
		}
	}
	private static void close()
	{
		try {
			oBrowser.close();
			
		} catch (Exception e) {
		  e.printStackTrace();
		}
	}

}
