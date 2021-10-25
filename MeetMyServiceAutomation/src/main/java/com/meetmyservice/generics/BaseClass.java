package com.meetmyservice.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
 static {
	 System.setProperty("webdriverchrome.driver", "./driver/chromedriver.exe");
 }
 public WebDriver driver;
 @BeforeClass
 public void openBrowser() {
	 Reporter.log("openBrowser", true);
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 }
 
 @AfterClass
 public void closeBrowser() {
	 Reporter.log("closeBrowser", true);
	 driver.close();
 }
 
 @BeforeMethod
 public void login() {
	 Reporter.log("login", true);
	 driver.get("https://meetmyservice.com/");
	 driver.findElement(By.xpath("")).click();
 }
 
 
}
