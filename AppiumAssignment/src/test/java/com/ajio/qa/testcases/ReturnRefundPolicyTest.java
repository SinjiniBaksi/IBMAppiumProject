package com.ajio.qa.testcases;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ajio.qa.base.TestBase;
import com.ajio.qa.pages.AccountPage;
import com.ajio.qa.pages.Homepage;
import com.ajio.qa.pages.ReturnRefundPolicy;

public class ReturnRefundPolicyTest extends TestBase {
	
	Homepage homepage;
	AccountPage accountpage;
	ReturnRefundPolicy returnrefundpolicypage;
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		initialization();
		homepage = new Homepage();
		accountpage = homepage.clickOnAccountIcon();
		returnrefundpolicypage = accountpage.clickOnReturnRefundPolicyLink();
	}
	
	@Test(priority = 1, enabled = true)
	public void verifyReturnRefundPolicyPageHeader() {
		
		Assert.assertEquals("Returns & Refunds | Policy followed | AJIO", returnrefundpolicypage.ReturnRefundPageHeader());
		Assert.fail(); //test to attach failed screenshot to extent report
	}

}
