package com.meetmyservice.TestLayer;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.meetmyservice.PageLiberary.HomePage;
import com.meetmyservice.PageLiberary.Login;
import com.meetmyservice.TestBasePackage.TestBase;

public class LoginTest extends TestBase{
	Login lg1;
	HomePage homepage;
	
    public LoginTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
    public void setUp() throws IOException {
    	initialization();
    	lg1=new Login();
    }
	
	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title=lg1.validateLoginPageTitle();
		Assert.assertEquals(title, "Sign in | Login | User Control Panel | Meet My Service");
	}
	
	/*@Test(priority = 2)
	public void loginTest() {
		homepage=lg1.login(prop.getProperty("memberphnumber"), prop.getProperty("enterOTP"));
		
	}
	
	*/
	
	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}
	
}
