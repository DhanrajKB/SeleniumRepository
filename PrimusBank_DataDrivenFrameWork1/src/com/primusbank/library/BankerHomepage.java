package com.primusbank.library;

import org.openqa.selenium.By;

import com.primusbank.constants.PrimusbankConstants;

public class BankerHomepage extends PrimusbankConstants
{
  public boolean bankerLogout()
  {
	  driver.findElement(By.xpath("//tbody/tr/td[3]/a/img")).click();
	  if (driver.findElement(By.id("login")).isDisplayed()) 
		{
			return true;
		} else 
		{
			return false;
		}
	
  }

}
