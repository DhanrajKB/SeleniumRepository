package com.primusbank.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.primusbank.constants.AdminModuleConstants;
import com.primusbank.library.Branch;

public class BranchCreationTest extends AdminModuleConstants
{
	@Test
	public void newBranchCreateTest() 
	{
	    boolean res;
		Branch br = new Branch();
		br.brname ="Balasore23";
		br.add1 ="Balasore";
		br.zip ="12345";
		br.country ="INDIA";
		br.state ="Andhra Pradesh";
		br.city ="Hyderabad";
		res=br.createBranch(br.brname, br.add1, br.zip, br.country, br.state, br.city);
		Assert.assertTrue(res);
		
	}

}
