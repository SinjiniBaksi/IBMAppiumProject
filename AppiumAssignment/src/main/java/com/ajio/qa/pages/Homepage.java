package com.ajio.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ajio.qa.base.TestBase;
import com.ajio.qa.util.TestUtil;

import io.appium.java_client.android.AndroidElement;

public class Homepage extends TestBase {
	
	//Xpaths
	
	private static By ajioLogo = By.id("com.ril.ajio:id/fahIvAjioLogo");
	private static By menuIcon = By.id("com.ril.ajio:id/fahIvMenu");
	private static By bellIcon = By.id("com.ril.ajio:id/fahNotiIcon");
	private static By searchBar = By.id("com.ril.ajio:id/llpsTvSearch");
	private static By searchIcon = By.id("com.ril.ajio:id/llpsIvSearch");
	//private static By cameraIcon = By.id("com.ril.ajio:id/llpsIvCamera");
	private static By HomeText = By.xpath("//android.widget.TextView[@text='Home']");
	private static By HomeIcon = By.xpath("(//*[@resource-id='com.ril.ajio:id/tabs']//descendant::android.widget.ImageView)[1]");
	private static By StoresText = By.xpath("//android.widget.TextView[@text='Stores']");
	private static By StoresIcon = By.xpath("(//*[@resource-id='com.ril.ajio:id/tabs']//descendant::android.widget.ImageView)[2]");
	private static By AccountText = By.xpath("//android.widget.TextView[@text='Account']");
	private static By AccountIcon = By.xpath("(//*[@resource-id='com.ril.ajio:id/tabs']//descendant::android.widget.ImageView)[3]");
	private static By WishlistText = By.xpath("//android.widget.TextView[@text='Wishlist']");
	private static By WishlistIcon = By.xpath("(//*[@resource-id='com.ril.ajio:id/tabs']//descendant::android.widget.ImageView)[4]");
	private static By BagText = By.xpath("//android.widget.TextView[@text='Bag']");
	private static By BagIcon = By.xpath("(//*[@resource-id='com.ril.ajio:id/tabs']//descendant::android.widget.ImageView)[5]");
	//private static By ImageSearchBox = By.xpath("//android.view.ViewGroup[contains(@resource-id,'image_search')]");
	private static By MenuList = By.id("com.ril.ajio:id/category_rv");
	private static By DismissButton = By.id("com.ril.ajio:id/footer_button_2");
	
	public static By getDismissButton() {
		return DismissButton;
	}

	public static By getMenuList() {
		return MenuList;
	}

	public static By getAjioLogo() {
		return ajioLogo;
	}

	public static By getMenuIcon() {
		return menuIcon;
	}

	public static By getBellIcon() {
		return bellIcon;
	}

	public static By getSearchBar() {
		return searchBar;
	}

	public static By getSearchIcon() {
		return searchIcon;
	}
	
	public static By getHomeText() {
		return HomeText;
	}

	public static By getHomeIcon() {
		return HomeIcon;
	}

	public static By getStoresText() {
		return StoresText;
	}

	public static By getStoresIcon() {
		return StoresIcon;
	}

	public static By getAccountText() {
		return AccountText;
	}


	public static By getAccountIcon() {
		return AccountIcon;
	}

	public static By getWishlistText() {
		return WishlistText;
	}

	public static By getWishlistIcon() {
		return WishlistIcon;
	}

	public static By getBagText() {
		return BagText;
	}

	public static By getBagIcon() {
		return BagIcon;
	}

	//Actions
	public boolean pageLogoExists() {
		return TestUtil.displayElement(getAjioLogo());
	}
	
	public static void UpdatePopUpExists() {
		if(TestUtil.displayElement(getDismissButton()))
			TestUtil.clickOn(getDismissButton());
	}
	
	public MenuPage clickMenuIcon() {
		
		if(TestUtil.displayElement(getMenuIcon())) {
			TestUtil.clickOn(getMenuIcon());
		}
		return new MenuPage();
	}
	
	public AccountPage clickOnAccountIcon() {
		//UpdatePopUpExists();
		if(TestUtil.displayElement(getAccountIcon()) && TestUtil.displayElement(getAccountText()))
			TestUtil.clickOn(getAccountIcon());
		return new AccountPage();
	}
	
	public StoresPage clickOnStoresIcon() {
		UpdatePopUpExists();
		if(TestUtil.displayElement(getStoresIcon()) && TestUtil.displayElement(getStoresText()))
			TestUtil.clickOn(getAccountIcon());
		return new StoresPage();
	}
	
	public WishlistPage clickOnWishlistIcon() {
		UpdatePopUpExists();
		if(TestUtil.displayElement(getWishlistIcon()) && TestUtil.displayElement(getWishlistText()))
			TestUtil.clickOn(getWishlistIcon());
		return new WishlistPage();
	}
	
	public CartPage clickOnCartIcon() {
		UpdatePopUpExists();
		if(TestUtil.displayElement(getBagIcon()) && TestUtil.displayElement(getBagText()))
			TestUtil.clickOn(getBagIcon());
		return new CartPage();
	}
	
	public NotificationPage clickOnBellIcon() {
		if(TestUtil.displayElement(getBellIcon()))
			TestUtil.clickOn(getBellIcon());
		return new NotificationPage();
		
	}
	

}
