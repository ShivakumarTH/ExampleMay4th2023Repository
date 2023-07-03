package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
	public static WebDriver o=null;

	public static void main(String[] args) {
		launchbrowser();
		navigate();
		handleframes();

	}
	public static  void launchbrowser()
	{
		try {
			o=new ChromeDriver();
			o.manage().window().maximize();
			
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			o.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void handleframes()
	{
		try {
			o.switchTo().frame(0);
			o.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
			Thread.sleep(2000);
			o.switchTo().defaultContent();
			o.switchTo().frame(1);
			o.findElement(By.xpath("//span[text()='WebDriver']")).click();
			Thread.sleep(2000);
			o.switchTo().defaultContent();
			WebElement oele=o.findElement(By.xpath("//iframe[@title='Package, class and interface descriptions']"));
			o.switchTo().frame(oele);
			String content=o.findElement(By.xpath("/html/body/main/div[2]")).getText();
			System.out.println(content);
		} catch (Exception e) {
		 e.printStackTrace();
		}
	}

}
