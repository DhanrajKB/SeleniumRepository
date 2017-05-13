package com.primusbank.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("debashis300@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9776505880");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		

	}

}
