package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupBrowserdemo {
public static WebDriver o=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		 handlepopup();

	}
	private static void launchBrowser()
	{
		try
		{
		o=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			o.get("http://localhost:81/login.do");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void handlepopup()
	{
		WebElement olink=null;
		
		try
		{
		olink=	o.findElement(By.linkText("actiTIME Inc."));
		Thread.sleep(2000);
		System.out.println("Before click the count of popup:"+popupcount());
		olink.click();
		System.out.println("After click the count of popup:"+popupcount());
		if(popupcount()>0)
		{
			popupoperations();
		}
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	private static int popupcount()
	{
		int count=0;
		count=o.getWindowHandles().size()-1;
		return count;
	}
   private static void popupoperations()
   {
	   try
	   {
		   String parentBrowser=o.getCurrentUrl();
		   System.out.println("Parent adress:"+parentBrowser);
		   
		   Object[] popups=o.getWindowHandles().toArray();
		   for(int i=1;i<popups.length;i++)
		   {
			   String childBrowser=popups[i].toString();
			   Thread.sleep(2000);
			   o.switchTo().window(childBrowser);
			   String url=o.getCurrentUrl();
			   System.out.println("URl"+url);
			   String title =o.getTitle();
			   System.out.println("Tiltle:"+title);
			   o.findElement(By.xpath("//*[@id=\'my-app\']/section/header/div[2]/div/div[2]/div/ul/li[5]/span")).click();
			   
		   }
		   
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
}
