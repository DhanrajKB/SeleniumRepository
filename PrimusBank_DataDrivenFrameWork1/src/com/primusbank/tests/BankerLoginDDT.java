package com.primusbank.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.primusbank.constants.PrimusbankConstants;
import com.primusbank.library.BankerHomepage;
import com.primusbank.library.PrimusbankHomepage;
import com.primusbank.utils.XLUtils;

public class BankerLoginDDT extends PrimusbankConstants
{
	public String datafile = "E:\\FrameWork11.30\\PrimusBank_DataDrivenFrameWork1\\src\\com\\keyword\\excel\\test.xlsx";
	public String dataSheet="LoginData";
	public int j = 1;
	//boolean res;
	@Test(dataProvider="testdata")
	public void bankerLoginTest(String brname,String uid,String pwd) throws IOException 
	{
		boolean res;
		PrimusbankHomepage phome = new PrimusbankHomepage();
		res =phome.bankerLogin(brname, uid, pwd);
		Assert.assertTrue(res);
		if (res) 
		{
			XLUtils.setCellData(datafile, dataSheet, j, 3, "pass");
			XLUtils.fillGreenColour(datafile, dataSheet, j, 3);
			
		} else 
		{
			XLUtils.setCellData(datafile, dataSheet, j, 3, "fail");
			XLUtils.fillRedColour(datafile, dataSheet, j, 3);

		}
		BankerHomepage bhome = new BankerHomepage();
		bhome.bankerLogout();
		j++;

	}
	@DataProvider
	public Object[][] testdata() throws IOException
	{
		int rc;
		rc=XLUtils.getRowCount(datafile, dataSheet);
		Object[][] data = new Object[rc][3];
		for (int i = 1; i <=rc; i++) 
		{
			data[i-1][0]=XLUtils.getCellData(datafile, dataSheet, i, 0);
			data[i-1][1]=XLUtils.getCellData(datafile, dataSheet, i, 1);
			data[i-1][2]=XLUtils.getCellData(datafile, dataSheet, i, 2);
		}
		return data;
		
	}
	
}

