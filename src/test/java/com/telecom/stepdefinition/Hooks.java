package com.telecom.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	public static WebDriver driver;
	@Before 
	public void beforescenario() {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://www.demo.guru99.com/telecom/index.html");
			driver.manage().window().maximize();   
		    
		}

	@After
	public void afterscenario() {
		driver.close();

	}
	
}
