package com.meetmyservice.TestBasePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	static WebDriver driver;
	static Properties prop;
	
	public TestBase() throws IOException {
		prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\kalyan\\git\\repository4\\MeetMyServiceAutomation\\src\\main\\java\\com\\meetmyservice\\config");
		prop.load(ip);
	}
	///MeetMyServiceAutomation/src/main/java/com/meetmyservice/config/config.properties
	
	public static void initialization() {
		String browserName=prop.getProperty("browser");
	if (browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");;
		driver=new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	}
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	 public static void main(String[] args) throws IOException {
	 FileInputStream ip=new FileInputStream("C:\\Users\\kalyan\\git\\repository4\\MeetMyServiceAutomation\\src\\main\\java\\com\\meetmyservice\\config\\config.properties");
	 Properties p=new Properties();
	 p.load(ip);
	 String url1=p.getProperty("url1");
	 WebDriver driver=new ChromeDriver();
	 driver.get(url1);

	 }
	
	/*
	 * Properties
	 * webdriver
	 * wait
	 * maximise
	 * delete all cookies
	 * thread
	 * get url
	 * 
	 */
}
