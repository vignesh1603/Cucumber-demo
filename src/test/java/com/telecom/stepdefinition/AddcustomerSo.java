package com.telecom.stepdefinition;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddcustomerSo {


	@Given("user click  add customer")
	public void user_click_add_customer() {
		Hooks.driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	    
	}

	@When("user enter values in fields  {string},{string},{string},{string},{string}")
	public void user_enter_values_in_fields(String s, String s2, String s3, String s4, String s5) {
		Hooks.driver.findElement(By.xpath("//label[@for='done']")).click();
		Hooks.driver.findElement(By.id("fname")).sendKeys(s);
		Hooks.driver.findElement(By.id("lname")).sendKeys(s2);
		Hooks.driver.findElement(By.id("email")).sendKeys(s3);
		Hooks.driver.findElement(By.name("addr")).sendKeys(s4);
		Hooks.driver.findElement(By.id("telephoneno")).sendKeys(s5);
	    	}

	@When("user click  submit button")
	public void user_click_submit_button() {
		Hooks.driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}

	@Then("user should be displayed customer id")
	public void user_should_be_displayed_customer_id() {
		WebElement id = Hooks.driver.findElement(By.xpath("(//td[@align='center'])[2]"));
		//String text = id.getText();
		System.out.println(id.getText());
	   
	}




}
