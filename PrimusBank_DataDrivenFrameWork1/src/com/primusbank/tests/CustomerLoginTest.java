package com.primusbank.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.primusbank.constants.PrimusbankConstants;
import com.primusbank.library.CustomerHomepage;
import com.primusbank.library.PrimusbankHomepage;

public class CustomerLoginTest extends PrimusbankConstants 
{
	@Test
	public void bankerLoginTest() 
	{
		boolean res;
		PrimusbankHomepage phome = new PrimusbankHomepage();
		phome.customeruid="shailaja";
		phome.customerpwd="shailaja";
		res=phome.customerLogin(phome.customeruid,phome.customerpwd);
		Assert.assertTrue(res);
		CustomerHomepage chome = new CustomerHomepage();
		                 chome.customerLogout();	
	}
		           
}
