package com.ajio.qa.pages;

import org.openqa.selenium.By;

import com.ajio.qa.util.TestUtil;

public class ReturnRefundPolicy {
	
	//XPaths
		private static By ReturnRefundHeaderText = By.id("com.ril.ajio:id/toolbar_title_tv");
		
		public static By getReturnRefundHeaderText() {
			return ReturnRefundHeaderText;
		}
		
	//Actions
		public String ReturnRefundPageHeader() {
			TestUtil.waitUntilElementPresent(getReturnRefundHeaderText());
			return TestUtil.getPageHeader(getReturnRefundHeaderText());
		}	

}
