package com.primusbank.library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import com.primusbank.constants.PrimusbankConstants;
import com.primusbank.utils.Generics;

public class Branch extends PrimusbankConstants
{
	public String brname,add1,zip,country,state,city;
	public boolean createBranch(String brname,String add1,String zip,String country,String state,String city ) 
	{
		String expbranchname,actbranchname;
		expbranchname = brname;
		driver.findElement(By.xpath("//table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		driver.findElement(By.id("txtbName")).sendKeys(brname);
		driver.findElement(By.id("txtAdd1")).sendKeys(add1);
		driver.findElement(By.id("txtZip")).sendKeys(zip);
		Generics.selectItem("//*[@id='lst_counrtyU']",country);
		Sleeper.sleepTightInSeconds(2);
		Generics.selectItem("//*[@id='lst_stateI']",state);
		Sleeper.sleepTightInSeconds(2);
		Generics.selectItem("//*[@id='lst_cityI']",city);
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.id("btn_insert")).click();
		
		driver.switchTo().alert().accept();
		WebElement branchtable;
		branchtable = driver.findElement(By.id("DG_bankdetails"));
		List<WebElement>rows,cols;
		rows =branchtable.findElements(By.tagName("tr"));
		boolean branchexist = false;
		for (int i = 1; i < rows.size(); i++) 
		{
			cols = rows.get(i).findElements(By.tagName("td"));
			actbranchname = cols.get(829).getText();
			if (expbranchname.equalsIgnoreCase(actbranchname)) 
			{
				branchexist = true;
				break;
			}
			
		}
		if (branchexist) 
		{
			return true;
			
		} else 
		{
			return false;

		}
		
		
	}

}
