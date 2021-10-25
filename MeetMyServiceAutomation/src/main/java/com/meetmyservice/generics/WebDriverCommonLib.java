package com.meetmyservice.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {
/**
 * implicit wait for element in GUI
 * @param driver
 */
	public void waitForElementInGui(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	/**
	 * Explicitwait for element
	 * @param driver
	 * @param element
	 */
	public void waitForElement(WebDriver driver, WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * CustomWait For Enabled Element
	 * @param element
	 */
	public void customWaitForEnablesElement(WebElement element) {
	int i=0;
	while(i<=100) {
		try {
			element.isEnabled();
			break;
		}
		catch(Exception e) {
			i++;
		}
	}
	}
	
	
	/**
	 * Select the option from the listbox based on index
	 * @param element
	 * @param index
	 */
	public void selectOption(WebElement element, int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	
	/**
	 * Select the option from the listbox based on visible text
	 * @param element
	 * @param text
	 */
	public void selectOption(WebElement element, String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	
}
