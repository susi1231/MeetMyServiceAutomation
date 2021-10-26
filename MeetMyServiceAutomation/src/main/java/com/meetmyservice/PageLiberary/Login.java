package com.meetmyservice.PageLiberary;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.meetmyservice.TestBasePackage.TestBase;

public class Login extends TestBase{
 public Login() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
 
   @FindBy(xpath="//a[.='LOG IN']")
   WebElement headerLoginButton;
 
 
   @FindBy(name="mobile")
   WebElement memberPhnumber;
   
   @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
   WebElement robotCheck;
   
   @FindBy(xpath = "//button[.='Get OTP']")
   WebElement getOTP;
   
   @FindBy(xpath = "//input[@name='otp']")
   WebElement enterOTP;
   
   @FindBy(xpath = "//button[.='Log in']")
   WebElement loginButtonAfterOTP;
   
   /*public static void m1() {
	   System.out.println("method");
   }
   public static void main(String[] args) {
   m1();
   System.out.println("hello");
   }
   */
   
   
    //logo on header
    @FindBy(xpath = "(//img[contains(@src, './assets/images/png')])[1]")
    WebElement headerLogo;
    //@findby for logo on middle
   @FindBy(xpath = "(//img[contains(@src, './assets/images/png')])[3]")
   WebElement middleLogo;
   //findby for logo in footer
   @FindBy(xpath = "(//img[contains(@src, './assets/images/png')])[4]")
   WebElement footerLogo;
    
   
   
   
   
}
