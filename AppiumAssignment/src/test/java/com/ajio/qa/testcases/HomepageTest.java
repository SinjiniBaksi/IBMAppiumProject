package com.ajio.qa.testcases;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ajio.qa.base.TestBase;
import com.ajio.qa.pages.AccountPage;
import com.ajio.qa.pages.CartPage;
import com.ajio.qa.pages.Homepage;
import com.ajio.qa.pages.MenuPage;
import com.ajio.qa.pages.StoresPage;
import com.ajio.qa.pages.WishlistPage;

public class HomepageTest extends TestBase {

	Homepage homepage = new Homepage();
	MenuPage menupage;
	AccountPage accountpage;
	WishlistPage wishlistpage;
	CartPage cartpage;
	StoresPage storespage;
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		initialization();
	}

	@Test(priority = 1)
	public void verifyPageLogoTest() {
		Assert.assertTrue(homepage.pageLogoExists(), "Error:Logo doesn't exist.");
	}

	@Test(priority = 2)
	public void verifyMenuIconTest() {
		menupage = homepage.clickMenuIcon();
	}
	
	@Test(priority = 3)
	public void verifyAccountIconTest() {
		accountpage = homepage.clickOnAccountIcon();
	}

}
