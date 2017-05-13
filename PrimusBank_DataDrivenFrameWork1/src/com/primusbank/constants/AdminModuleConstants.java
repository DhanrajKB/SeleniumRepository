package com.primusbank.constants;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.primusbank.library.AdminHomepage;
import com.primusbank.library.PrimusbankHomepage;

public class AdminModuleConstants extends PrimusbankConstants
{
	@BeforeTest
	public void adminLogin() 
	{
		PrimusbankHomepage phome = new PrimusbankHomepage();
		          
		         phome.adminLogin("Admin","Admin");
	}
	@AfterTest
	public void adminLogout() 
	{
		AdminHomepage ahome = new AdminHomepage();
		              ahome.adminLogout();	
	}

}
