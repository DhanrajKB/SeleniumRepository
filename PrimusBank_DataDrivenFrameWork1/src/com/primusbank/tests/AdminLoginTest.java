package com.primusbank.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.primusbank.constants.PrimusbankConstants;
import com.primusbank.library.AdminHomepage;
import com.primusbank.library.PrimusbankHomepage;

public class AdminLoginTest extends PrimusbankConstants
{
	@Test
	public void adminLoginTest() 
	{
		boolean res;
		PrimusbankHomepage phome = new PrimusbankHomepage();
		                phome.adminuid ="Admin";
		                phome.adminpwd ="Admin";
		 res = phome.adminLogin(phome.adminuid,phome.adminpwd);
		 //res = phome.adminLogin("Admin","Admin");
		 Assert.assertTrue(res);
		 AdminHomepage ahome = new AdminHomepage();
		               ahome.adminLogout();
		 
	}

}
