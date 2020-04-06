/*
 * 
 * Coder - Parikshit
 * 
 * 
 * */ 


package com.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.BeforeClass;

import com.utils.CommonUtils;
import com.utils.WebEventListener;



public class Base {
	public static WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\src\\main\\resources\\com\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	//EventListener WebDriver
	
	EventFiringWebDriver e_driver = new EventFiringWebDriver(driver);

	WebDriverEventListener eventListener = new WebEventListener();
	e_driver.register(eventListener);
	driver = e_driver;
	
	//
	
	driver.manage().timeouts().pageLoadTimeout(CommonUtils.Page_LoadOut_Time, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(CommonUtils.Implicitely_Wait, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
	
		
	}

}
