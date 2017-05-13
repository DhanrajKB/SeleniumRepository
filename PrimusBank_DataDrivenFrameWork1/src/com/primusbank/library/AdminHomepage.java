package com.primusbank.library;

import org.openqa.selenium.By;

import com.primusbank.constants.PrimusbankConstants;

public class AdminHomepage extends PrimusbankConstants
{
	public void adminLogout() 
	{
		driver.findElement(By.xpath("//tbody/tr/td[3]/a/img")).click();
		
	}

}
