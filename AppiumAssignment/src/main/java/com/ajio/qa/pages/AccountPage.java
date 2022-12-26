package com.ajio.qa.pages;

import org.openqa.selenium.By;

import com.ajio.qa.base.TestBase;
import com.ajio.qa.util.TestUtil;

public class AccountPage extends TestBase {
	
	//XPaths
	private static By headerText = By.id("com.ril.ajio:id/toolbar_title_tv");
	private static By SignupOrSignIn = By.id("com.ril.ajio:id/signin_bt_myact");
	private static By CustomerCare = By.xpath("//android.widget.TextView[@text='Customer Care']");
	private static By ReferAndEarn = By.xpath("//android.widget.TextView[@text='Invite Friends & Earn']");
	private static By ReferAndEarnDesc = By.id("com.ril.ajio:id/feature_info");
	private static By CouponQuest = By.xpath("//android.widget.TextView[@text='Coupon Quest']");
	private static By GameZone = By.xpath("//android.widget.TextView[@text='Game Zone']");
	private static By Notifications = By.xpath("//android.widget.TextView[@text='Notifications']");
	private static By ReturnCreationDemo = By.xpath("//android.widget.TextView[@text='Return Creation Demo']");
	private static By HowToReturn = By.xpath("//android.widget.TextView[@text='How To Return']");
	private static By CouponRedeem = By.xpath("//android.widget.TextView[@text='How Do I Redeem My Coupon?']");
	private static By TermsAndConditions = By.xpath("//android.widget.TextView[@text='Terms & Conditions']");
	private static By PromoTermsAndConditions = By.xpath("//android.widget.TextView[@text='Promotions Terms & Conditions']");
	private static By ReturnRefundPolicy = By.xpath("//android.widget.TextView[@text='Returns & Refunds Policy']");
	private static By PrivacyPolicy = By.xpath("//android.widget.TextView[@text='We Respect Your Privacy']");
	private static By FeesAndPayments = By.xpath("//android.widget.TextView[@text='Fees & Payments']");
	private static By AboutUs = By.xpath("//android.widget.TextView[@text='Who We Are']");
	private static By JoinTeam = By.xpath("//android.widget.TextView[@text='Join Our Team']");
	
	public static By getHeaderText() {
		return headerText;
	}
	public static By getSignupOrSignIn() {
		return SignupOrSignIn;
	}
	public static By getCustomerCare() {
		return CustomerCare;
	}
	public static By getReferAndEarn() {
		return ReferAndEarn;
	}
	public static By getReferAndEarnDesc() {
		return ReferAndEarnDesc;
	}
	public static By getCouponQuest() {
		return CouponQuest;
	}
	public static By getGameZone() {
		return GameZone;
	}
	public static By getNotifications() {
		return Notifications;
	}
	public static By getReturnCreationDemo() {
		return ReturnCreationDemo;
	}
	public static By getHowToReturn() {
		return HowToReturn;
	}
	public static By getCouponRedeem() {
		return CouponRedeem;
	}
	public static By getTermsAndConditions() {
		return TermsAndConditions;
	}
	public static By getPromoTermsAndConditions() {
		return PromoTermsAndConditions;
	}
	public static By getReturnRefundPolicy() {
		return ReturnRefundPolicy;
	}
	public static By getPrivacyPolicy() {
		return PrivacyPolicy;
	}
	public static By getFeesAndPayments() {
		return FeesAndPayments;
	}
	public static By getAboutUs() {
		return AboutUs;
	}
	public static By getJoinTeam() {
		return JoinTeam;
	}
	
	//Actions
	public String AccountPageHeader() {
		TestUtil.waitUntilElementPresent(getHeaderText());
		return TestUtil.getPageHeader(getHeaderText());
	}
	
	public SignUpOrSignInPage clickOnSignUpSignInLink() {
		if(TestUtil.displayElement(getSignupOrSignIn()))
			TestUtil.clickOn(getSignupOrSignIn());
		return new SignUpOrSignInPage();
	}
	
	public boolean ReferralDescriptionIsVisible() {
		return TestUtil.displayElement(getReferAndEarnDesc());
	}
	
	public CustomerCare clickOnCustomerCareLink() {
		TestUtil.waitUntilElementPresent(getCustomerCare());
		if(TestUtil.displayElement(getCustomerCare()))
			TestUtil.clickOn(getCustomerCare());
		return new CustomerCare();
	}
	public Referral clickOnReferralLink() {
		TestUtil.waitUntilElementPresent(getReferAndEarn());
		if(TestUtil.displayElement(getReferAndEarn()))
			TestUtil.clickOn(getReferAndEarn());
		return new Referral();
	}
	public CouponQuest clickOnCouponQuestLink() {
		if(TestUtil.displayElement(getCouponQuest()))
			TestUtil.clickOn(getCouponQuest());
		return new CouponQuest();
	}
	public GameZone clickOnGameZoneLink() {
		if(TestUtil.displayElement(getGameZone()))
			TestUtil.clickOn(getGameZone());
		return new GameZone();
	}
	public Notifications clickOnNotificationsLink() {
		if(TestUtil.displayElement(getNotifications()))
			TestUtil.clickOn(getNotifications());
		return new Notifications();
	}
	public ReturnCreationDemo clickOnReturnCreationDemoLink() {
		if(TestUtil.displayElement(getReturnCreationDemo()))
			TestUtil.clickOn(getReturnCreationDemo());
		return new ReturnCreationDemo();
	}
	public HowToReturn clickOnHowToReturnLink() {
		if(TestUtil.displayElement(getHowToReturn()))
			TestUtil.clickOn(getHowToReturn());
		return new HowToReturn();
	}
	public CouponRedeem clickOnCouponRedeemLink() {
		TestUtil.scrollToElement("How Do I Redeem My Coupon?");
		if(TestUtil.displayElement(getCouponRedeem()))
			TestUtil.clickOn(getCouponRedeem());
		return new CouponRedeem();
	}
	public TermsAndConditions clickOnTAndCLink() {
		TestUtil.scrollToElement("Terms & Conditions");
		if(TestUtil.displayElement(getTermsAndConditions()))
			TestUtil.clickOn(getTermsAndConditions());
		return new TermsAndConditions();
	}
	public PromoTermsAndConditions clickOnPromoTAndC() {
		TestUtil.scrollToElement("Promotions Terms & Conditions");
		if(TestUtil.displayElement(getPromoTermsAndConditions()))
			TestUtil.clickOn(getPromoTermsAndConditions());
		return new PromoTermsAndConditions();
	}
	public ReturnRefundPolicy clickOnReturnRefundPolicyLink() {
		TestUtil.scrollToElement("Returns & Refunds Policy");
		if(TestUtil.displayElement(getReturnRefundPolicy()))
			TestUtil.clickOn(getReturnRefundPolicy());
		return new ReturnRefundPolicy();
	}
	public PrivacyPolicy clickOnPrivacyPolicyLink() {
		TestUtil.scrollToElement("We Respect Your Privacy");
		if(TestUtil.displayElement(getPrivacyPolicy()))
			TestUtil.clickOn(getPrivacyPolicy());
		return new PrivacyPolicy();
	}
	public FeesAndPayments clickOnFeesAndPaymentsLink() {
		TestUtil.scrollToElement("Fees & Payments");
		if(TestUtil.displayElement(getFeesAndPayments()))
			TestUtil.clickOn(getFeesAndPayments());
		return new FeesAndPayments();
	}
	public AboutUs clickOnAboutUsLink() {
		TestUtil.scrollToElement("Who We Are");
		if(TestUtil.displayElement(getAboutUs()))
			TestUtil.clickOn(getAboutUs());
		return new AboutUs();
	}
	public JoinTeam clickOnJoinTeamLink() {
		TestUtil.scrollToElement("Join Our Team");
		if(TestUtil.displayElement(getJoinTeam()))
			TestUtil.clickOn(getJoinTeam());
		return new JoinTeam();
	}
}
