package com.primusbank.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Orange {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.linkText("Welcome Admin")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div/ul/li[3]/a")).click();
	
	}

}
