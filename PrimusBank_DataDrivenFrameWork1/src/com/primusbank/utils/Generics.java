package com.primusbank.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.primusbank.constants.PrimusbankConstants;

public class Generics extends PrimusbankConstants 
{
	public static void selectItem(String locator,String item) 
	{
		WebElement listElement;
		listElement = driver.findElement(By.xpath(locator));
		Select list = new Select(listElement);
		list.selectByVisibleText(item);
		
		
		
	}

}
