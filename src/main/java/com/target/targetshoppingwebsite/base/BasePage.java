package com.target.targetshoppingwebsite.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

	public int shortWait = 1000;

//****************Declare WebDriver Method****************************
	public static WebDriver driver;

//*****Create a constructor for this class and declare driver inside the constructor method*****
	public BasePage(WebDriver driver) {
		BasePage.driver = driver;
	}

//---------------Add all other necessary methods based on the application---------------
//****************Wait Methods****************************************
	public static void waitTime(long time) throws InterruptedException {
		Thread.sleep(time);
	}

//****************Click Method*****************************************
	public void clickElement(By locator) throws InterruptedException {
		driver.findElement(locator).click();
		waitTime(shortWait);
	}

//******************Enter Value Method*********************************
	public void enterValue(By locator, String text) {
		driver.findElement(locator).click();
		driver.findElement(locator).sendKeys(text);
	}
	
//*****************Enter Value and Press Enter*************************
	public void clickEnterValueAndPressEnter (By locator, String text) throws InterruptedException {
		WebElement element= driver.findElement(locator);
		element.sendKeys(text);
		waitTime (shortWait);
		element.sendKeys(Keys.ENTER);
	}

//***************ENTER/UP/DOWN********************************
	public void enterValueArrowDownPressEnter (By locator, String text) throws InterruptedException {
			WebElement elm = driver.findElement(locator);
			elm.sendKeys(text);
			Thread.sleep(1000);
			elm.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			elm.sendKeys(Keys.ENTER);
	}

}
