package com.primusbank.tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.primusbank.library.BankerHomepage;
import com.primusbank.library.PrimusbankHomepage;

public class BankerLoginTest extends PrimusbankHomepage
{
	@Test
	public void bankerLoginTest()
	{
		boolean res;
	PrimusbankHomepage phome = new PrimusbankHomepage();
	phome.brname = "Ameerpet";
	phome.bankeruid = "Richards";
	phome.bankerpwd = "demo";
	res = phome.bankerLogin(phome.brname,phome.bankeruid,phome.bankerpwd);
	Assert.assertTrue(res);
	BankerHomepage bhome = new BankerHomepage();
	               bhome.bankerLogout();
	}

}
