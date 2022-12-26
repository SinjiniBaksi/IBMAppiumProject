package com.ajio.qa.testcases;

import java.net.MalformedURLException;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ajio.qa.base.TestBase;
import com.ajio.qa.pages.AboutUs;
import com.ajio.qa.pages.AccountPage;
import com.ajio.qa.pages.CouponQuest;
import com.ajio.qa.pages.CouponRedeem;
import com.ajio.qa.pages.CustomerCare;
import com.ajio.qa.pages.FeesAndPayments;
import com.ajio.qa.pages.GameZone;
import com.ajio.qa.pages.Homepage;
import com.ajio.qa.pages.HowToReturn;
import com.ajio.qa.pages.JoinTeam;
import com.ajio.qa.pages.Notifications;
import com.ajio.qa.pages.PrivacyPolicy;
import com.ajio.qa.pages.PromoTermsAndConditions;
import com.ajio.qa.pages.Referral;
import com.ajio.qa.pages.ReturnCreationDemo;
import com.ajio.qa.pages.ReturnRefundPolicy;
import com.ajio.qa.pages.TermsAndConditions;

public class AccountPageTest extends TestBase {
	
	AccountPage accountpage;
	Homepage homepage;
	CustomerCare customercare;
	Referral referral;
	CouponQuest couponquest;
	GameZone gamezone;
	Notifications notifications;
	ReturnCreationDemo returncreationdemo;
	HowToReturn howtoreturn;
	CouponRedeem couponredeem;
	TermsAndConditions termsandconditions;
	PromoTermsAndConditions promotermsandconditions;
	ReturnRefundPolicy returnrefundpolicy;
	PrivacyPolicy privacypolicy;
	FeesAndPayments feesandpayments;
	AboutUs aboutus;
	JoinTeam jointeam;
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		initialization();
		homepage = new Homepage();
		accountpage = homepage.clickOnAccountIcon();
	}
	
	@Test(priority = 1, enabled = false)
	public void verifyAccountPageHeader() {
		
		Assert.assertEquals("My Account", accountpage.AccountPageHeader());
	}
	
	@Test(priority = 2, enabled = false)
	public void verifyCustomerCareLinkTest() {
		
		customercare = accountpage.clickOnCustomerCareLink();
	}
	@Test(priority = 3, enabled = false)
	public void verifyReferralLinkTest() {
		
		referral = accountpage.clickOnReferralLink();
	}
	@Test(priority = 4, enabled = false)
	public void verifyCouponQuestLinkTest() {
		
		couponquest = accountpage.clickOnCouponQuestLink();
	}
	@Test(priority = 5, enabled = false)
	public void verifyGameZoneLinkTest() {
		
		gamezone = accountpage.clickOnGameZoneLink();
	}
	@Test(priority = 6, enabled = false)
	public void verifyNotificationsLinkTest() {
		
		notifications = accountpage.clickOnNotificationsLink();
	}
	@Test(priority = 7, enabled = false)
	public void verifyReturnCreationDemoLinkTest() {
		
		returncreationdemo = accountpage.clickOnReturnCreationDemoLink();
	}
	@Test(priority = 8, enabled = false)
	public void verifyHowToReturnLinkTest() {
		
		howtoreturn = accountpage.clickOnHowToReturnLink();
	}
	@Test(priority = 9, enabled = false)
	public void verifyCouponRedeemLinkTest() {
		
		couponredeem = accountpage.clickOnCouponRedeemLink();
	}
	@Test(priority = 10, enabled = false)
	public void verifyTermsandConditionsLinkTest() {
		
		termsandconditions = accountpage.clickOnTAndCLink();
	}
	@Test(priority = 11, enabled = false)
	public void verifyPromoTermsandConditionsLinkTest() {
		
		promotermsandconditions = accountpage.clickOnPromoTAndC();
	}
	@Test(priority = 12, enabled = true)
	public void verifyReturnRefundPolicyLinkTest() {
		
		returnrefundpolicy = accountpage.clickOnReturnRefundPolicyLink();
	}
	@Test(priority = 13, enabled = false)
	public void verifyPrivacyPolicyLinkTest() {
		
		privacypolicy = accountpage.clickOnPrivacyPolicyLink();
	}
	@Test(priority = 14, enabled = false)
	public void verifyFeesAndPaymentsLinkTest() {
		
		feesandpayments = accountpage.clickOnFeesAndPaymentsLink();
	}
	@Test(priority = 15, enabled = false)
	public void verifyAboutUsLinkTest() {
		
		aboutus = accountpage.clickOnAboutUsLink();
	}
	@Test(priority = 16, enabled = false)
	public void verifyJoinTeamLinkTest() {
		
		jointeam = accountpage.clickOnJoinTeamLink();
	}

}
