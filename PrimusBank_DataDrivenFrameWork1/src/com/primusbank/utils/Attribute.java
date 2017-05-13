package com.primusbank.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Attribute {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://gmail.com");
		String str =driver.findElement(By.id("Email")).getAttribute("placeholder");
		System.out.println(str);
		str =driver.findElement(By.id("Email")).getAttribute("name");
		System.out.println(str);
		str =driver.findElement(By.linkText("Find my account")).getAttribute("herf");
		System.out.println(str);

	}

}
