package com.primusbank.library;

import org.openqa.selenium.By;

import com.primusbank.constants.PrimusbankConstants;

public class CustomerHomepage extends PrimusbankConstants
{
	public void customerLogout()
	{
		driver.findElement(By.xpath("//table/tbody/tr/td[3]/a/img")).click();
		
	}

}
