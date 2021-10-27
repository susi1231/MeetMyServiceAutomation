package com.meetmyservice.TestLayer;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
@Test
    public void demo() throws IOException {
	WebDriver driver=new ChromeDriver();
	FileInputStream file=new FileInputStream("C:\\Users\\kalyan\\git\\MeetMyServiceAutomation\\MeetMyServiceAutomation\\src\\main\\java\\com\\meetmyservice\\config\\config.properties");
	Properties p=new Properties();
	p.load(file);
	driver.get(p.getProperty("url"));
}

}
