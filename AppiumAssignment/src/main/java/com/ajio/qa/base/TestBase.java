package com.ajio.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.ajio.qa.util.TestUtil;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {
	
	public static Properties prop;
	public static AndroidDriver driver;
	public static ExtentReports report;
	public static ExtentTest extentTest;
	
	public TestBase() {
		prop = new Properties();
		FileInputStream ip;
		try {
			ip = new FileInputStream(".\\src\\main\\java\\com\\ajio\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@BeforeTest
	public void setExtent() {
		report = new ExtentReports(System.getProperty("user.dir")+"//Reports//ExtentReport.html",true);
		report.addSystemInfo("Host Name", "admin");
		report.addSystemInfo("User Name", "admin");
		report.addSystemInfo("Environment", "QA");
		extentTest = report.startTest("Extent Report");
	}
	
	@AfterTest
	public void endReport() {
		report.flush();
	}
	
	public static void initialization() throws MalformedURLException {
		File appDir = new File(prop.getProperty("url"));
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, prop.getProperty("platform"));
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, prop.getProperty("appPackage"));
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, prop.getProperty("appActivity"));
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, prop.getProperty("device"));
		cap.setCapability("autoGrantPermissions", true);
		cap.setCapability(MobileCapabilityType.APP, appDir.getAbsolutePath());
		driver = new AndroidDriver(new URL(prop.getProperty("appiumServer")), cap);
		
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT_TIMEOUT, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void teardown(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName());
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable());
			
			String screenshotPath;
			try {
				screenshotPath = TestUtil.getScreenshot(result.getName());
				extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath)); //add screenshot in extent report
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(result.getStatus()==ITestResult.SKIP)
			extentTest.log(LogStatus.SKIP, "TEST CASE SKIPPED IS "+result.getName());
		
		else if(result.getStatus()==ITestResult.SUCCESS)
			extentTest.log(LogStatus.PASS, "TEST CASE PASSED IS "+result.getName());
		
		report.endTest(extentTest);
		driver.quit();
	}

}
