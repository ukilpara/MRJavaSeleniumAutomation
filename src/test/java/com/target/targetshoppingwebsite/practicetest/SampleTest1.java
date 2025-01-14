package com.target.targetshoppingwebsite.practicetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.target.targetshoppingwebsite.base.BasePage;
import com.target.targetshoppingwebsite.pagelibrary.TargetHomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest1 {
	
public static WebDriver driver;
	
	BasePage basePage;
	TargetHomePage targetHomePage;

	@Test
	public void testWithConstructor() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

//-------------------------------------------------------------------------
		targetHomePage = new TargetHomePage(driver);
        basePage= new BasePage(driver);
        
//-------------------------------------------------------------------------
		driver.navigate().to("https://www.target.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		targetHomePage.clickSignin();
		targetHomePage.clickSigninagain();
		targetHomePage.clickEmailormobilephone();
		targetHomePage.clickPassword();
		targetHomePage.clickSigninwithpassword();
		targetHomePage.clickSearchboxEnterValuePressEnter();
		
		//your codes are failing.

	}

}
