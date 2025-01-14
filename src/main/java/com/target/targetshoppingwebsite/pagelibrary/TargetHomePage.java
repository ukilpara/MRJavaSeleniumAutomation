package com.target.targetshoppingwebsite.pagelibrary;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.target.targetshoppingwebsite.base.BasePage;

public class TargetHomePage extends BasePage {
	
	public TargetHomePage(WebDriver driver) {
		super(driver);
	}

//------------------------Defining the locators------------------------------
	public By signin = By.xpath("//*[@id='headerPrimary']/a[4]/span");
	public By signinagain= By.xpath("/html/body/div/div/div/div/ul/div/button");
    public By emailormobilephone= By.xpath("//*[@id='username']");
    public By password= By.xpath("//*[@id='password']");
    public By signinwithpassword= By.xpath("//*[@id='login']/span");
    public By Searchbox= By.xpath("//*[@id='search']");
//-----------------------------Methods-----------------------------------
	public void clickSignin() throws InterruptedException {
		clickElement(signin);
		waitTime(shortWait);
	}
	public void clickSigninagain () throws InterruptedException {
		clickElement (signinagain);
		waitTime(shortWait);
	}
	public void clickEmailormobilephone () throws InterruptedException {
		clickElement (emailormobilephone);
		enterValue(emailormobilephone, "noyna101@gmail.com");
		waitTime(shortWait);
	}
    public void clickPassword() throws InterruptedException {
    	clickElement (password);
    	enterValue(password,"Bangladesh@71");
    }
    public void clickSigninwithpassword () throws InterruptedException {
    	clickElement(signinwithpassword);
    }
    public void clickSearchboxEnterValuePressEnter () throws InterruptedException {
    	clickElement(Searchbox);
    	clickEnterValueAndPressEnter(Searchbox,"Books");
    	
    }
    
}
