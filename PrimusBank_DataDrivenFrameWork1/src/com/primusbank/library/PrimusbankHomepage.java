package com.primusbank.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.primusbank.constants.PrimusbankConstants;


public class PrimusbankHomepage extends PrimusbankConstants
{
	public String adminuid,adminpwd;
	public String brname,bankeruid,bankerpwd;
	public String customeruid,customerpwd;
	
	public boolean adminLogin(String uid,String pwd)
	{
		String expurl,acturl;
		expurl = "adminflow";
		login(uid,pwd);
		acturl = driver.getCurrentUrl();
		if (acturl.toLowerCase().contains(expurl.toLowerCase())) 
		{
			return true;
		} else 
		{
			return false;
		}
	}
	public boolean bankerLogin(String branchname,String uid,String pwd) 
	{
		String expurl,acturl;
		expurl ="Bankers_flow";
		WebElement brlistElement = driver.findElement(By.id("drlist"));
		Select brlist = new Select(brlistElement);
		brlist.selectByVisibleText(branchname);
		login(uid,pwd);
		acturl = driver.getCurrentUrl();
		    if (acturl.toLowerCase().contains(expurl.toLowerCase())) 
		    {
				return true;
			} 
		    else {
		    	return false;
			}	    	
	}
	
	public boolean customerLogin(String uid,String pwd) 
	{
		driver.findElement(By.id("personal")).click();
		driver.findElement(By.id("idtxt")).sendKeys(uid);
		driver.findElement(By.id("pswdtxt")).sendKeys(pwd);
		driver.findElement(By.id("btnGO")).click();
		if (driver.findElement(By.xpath("//table/tbody/tr[2]/td/a/img")).isDisplayed()) 
		{
			return true;
			
		} else 
		{
			return false;

		}
		
		
	}
	
	public void login(String uid,String pwd) 
	{
		driver.findElement(By.id("txtuId")).sendKeys(uid);
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
	
	}

}












