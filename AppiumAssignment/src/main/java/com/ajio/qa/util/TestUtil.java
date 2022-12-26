package com.ajio.qa.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ajio.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	public static long IMPLICIT_WAIT_TIMEOUT = 20;
	public static WebDriverWait wait;
		
	public TestUtil() {
		super();
	}

	public static void clickOn(By locator) {
		
		driver.findElement(locator).click();
	}
	
	public static void sendKeysText(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}
	
	public static boolean displayElement(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	
	public static String getPageHeader(By locator) {
		String headerText = driver.findElement(locator).getText();
		return headerText;
	}
	
	public static WebElement scrollToElement(String link) {
        return driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)"
                + ".instance(0)).scrollIntoView(new UiSelector().textContains("+"\""+link+"\""+").instance(0))");
	}
	
	public static void waitUntilElementPresent(By locator) {
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static String getScreenshot(String screenshotName) throws IOException {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String destFolder = System.getProperty("user.dir")+"\\Reports\\Failed_Screenshots\\"+screenshotName+dateName+".jpeg";
		File dest = new File(destFolder);
		FileUtils.copyFile(src, dest);
		return destFolder;
	}



}
