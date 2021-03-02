package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Addtariffplansce {
	public static WebDriver driver;
	@Given("user launch telecom app")
	public void user_launch_telecom_app() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/telecom/index.html");
		driver.manage().window().maximize();   
	    
	}

	@Given("user click on add tariff plan")
	public void user_click_on_add_tariff_plan() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	    
	}

	@When("user enter fill fields by using one dim list")
	public void user_enter_fill_fields_by_using_one_dim_list(io.cucumber.datatable.DataTable datas) {
		List<String> d = datas.asList();
		
		driver.findElement(By.id("rental1")).sendKeys(d.get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(d.get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(d.get(2));
		driver.findElement(By.name("sms_pack")).sendKeys(d.get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(d.get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(d.get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(d.get(6));
	   
	}
	@When("user enter fill fields by using two dim list")
	public void user_enter_fill_fields_by_using_two_dim_list(io.cucumber.datatable.DataTable datas) {
		List<List<String>> l = datas.asLists();
		
		driver.findElement(By.id("rental1")).sendKeys(l.get(0).get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(l.get(1).get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(l.get(2).get(2));
		driver.findElement(By.name("sms_pack")).sendKeys(l.get(0).get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(l.get(1).get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(l.get(2).get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(l.get(0).get(6));
	   
	}
	@When("user enter fill fields by using one dim map")
	public void user_enter_fill_fields_by_using_one_dim_map(io.cucumber.datatable.DataTable datas) {
		Map<String, String> m = datas.asMap(String.class, String.class);
		
		
		driver.findElement(By.id("rental1")).sendKeys(m.get("1"));
		driver.findElement(By.id("local_minutes")).sendKeys(m.get("2"));
		driver.findElement(By.id("inter_minutes")).sendKeys(m.get("3"));
		driver.findElement(By.name("sms_pack")).sendKeys(m.get("4"));
		driver.findElement(By.id("minutes_charges")).sendKeys(m.get("5"));
		driver.findElement(By.id("inter_charges")).sendKeys(m.get("6"));
		driver.findElement(By.id("sms_charges")).sendKeys(m.get("7"));
	   
	}
	@When("user enter fill fields by using two dim map")
	public void user_enter_fill_fields_by_using_two_dim_map(io.cucumber.datatable.DataTable datas) {
		List<Map<String, String>> m = datas.asMaps();
		driver.findElement(By.id("rental1")).sendKeys(m.get(2).get("1"));
		driver.findElement(By.id("local_minutes")).sendKeys(m.get(1).get("2"));
		driver.findElement(By.id("inter_minutes")).sendKeys(m.get(0).get("3"));
		driver.findElement(By.name("sms_pack")).sendKeys(m.get(0).get("4"));
		driver.findElement(By.id("minutes_charges")).sendKeys(m.get(1).get("5"));
		driver.findElement(By.id("inter_charges")).sendKeys(m.get(2).get("6"));
		driver.findElement(By.id("sms_charges")).sendKeys(m.get(0).get("7"));
	   
	}


	@When("user clicks  submit button")
	public void user_clicks_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}

	@Then("user should be displayed  message")
	public void user_should_be_displayed_message() {
		WebElement id = driver.findElement(By.xpath("//h2[contains(text(),'Congratulation')]"));
		//String text = id.getText();
		System.out.println(id.getText());
		
	}



}
