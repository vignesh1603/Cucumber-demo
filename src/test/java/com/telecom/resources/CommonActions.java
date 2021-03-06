package com.telecom.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
	public static WebDriver driver;
	
	public void launch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		
	}
	public void write(WebElement ele, String value) {
		ele.sendKeys(value);
		
		
	}
	
	public void button(WebElement ele) {
		ele.click();
	}

}
