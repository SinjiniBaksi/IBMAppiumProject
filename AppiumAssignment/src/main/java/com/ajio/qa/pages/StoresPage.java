package com.ajio.qa.pages;

import org.openqa.selenium.By;

public class StoresPage {
	
	//XPaths
		private static By StoresheaderText = By.id("com.ril.ajio:id/fahTvStoreName");
		private static By storeSearchBar = By.id("com.ril.ajio:id/llpsSearchLayout");

		public static By getStoresheaderText() {
			return StoresheaderText;
		}
		public static By getStoreSearchBar() {
			return storeSearchBar;
		}
		
		

}
