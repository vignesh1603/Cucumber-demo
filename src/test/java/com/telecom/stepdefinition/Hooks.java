package com.telecom.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telecom.resources.CommonActions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends CommonActions {
	
	CommonActions c = new CommonActions();
	
	
	@Before 
	public void beforescenario() {
		 c.launch("http://www.demo.guru99.com/telecom/index.html");
		
			
			driver.manage().window().maximize();   
		    
		}

	@After
	public void afterscenario(Scenario Scenario) {
		if(Scenario.isFailed()) {
			final byte[] Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			Scenario.embed(Screenshot, "image/png");
		}
		else {
			final byte[] Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			Scenario.embed(Screenshot, "image/png");
			
		}
		
		driver.close();
		

	}
	
}
