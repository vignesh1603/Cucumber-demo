package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telecom.objectrepository.Addcustomerpage;
import com.telecom.resources.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Addcustomer extends CommonActions {
	CommonActions c = new CommonActions();
	Addcustomerpage a = new Addcustomerpage();
	Hooks h = new Hooks();
	@Given("user launches telecom application")
	public void user_launches_telecom_application() {
	    h.beforescenario();
	}
	 
	
	
	@Given("user click on add customer")
	public void user_click_on_add_customer() {
		c.button(a.getCustomerButton());
	  }

	@When("user enter values in fields")
	public void user_enter_values_in_fields() {
		c.button(a.getDoneButton());
		c.write(a.getFirstname(),"vignesh");
		c.write(a.getLastname(), "vijayaraman");
		c.write(a.getMail(),"java@gmail.com");
		c.write(a.getAdrress(), "coimbatore");
		c.write(a.getNum(), "8940422633");
		}
	@When("user enter values in fields by using one dim list")
	public void user_enter_values_in_fields_by_using_one_dim_list(DataTable datas) {
		List<String> d = datas.asList();
		
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(d.get(0));
		driver.findElement(By.id("lname")).sendKeys(d.get(1));
		driver.findElement(By.id("email")).sendKeys(d.get(2));
		driver.findElement(By.name("addr")).sendKeys(d.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(d.get(4));
	
	}
	@When("user enter values in fields by using one dim map")
	public void user_enter_values_in_fields_by_using_one_dim_map(io.cucumber.datatable.DataTable dataTable) {
	   Map<String, String> m = dataTable.asMap(String.class, String.class);
	   driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(m.get("fname"));
		driver.findElement(By.id("lname")).sendKeys(m.get("lname"));
		driver.findElement(By.id("email")).sendKeys(m.get("mail"));
		driver.findElement(By.name("addr")).sendKeys(m.get("addr"));
		driver.findElement(By.id("telephoneno")).sendKeys(m.get("phno"));
	}
	@When("user enter values in fields by using two dim list")
	public void user_enter_values_in_fields_by_using_two_dim_list(io.cucumber.datatable.DataTable dataTable) {
	    List<List<String>> l = dataTable.asLists();
	    driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(l.get(0).get(0));
		driver.findElement(By.id("lname")).sendKeys(l.get(1).get(1));
		driver.findElement(By.id("email")).sendKeys(l.get(2).get(2));
		driver.findElement(By.name("addr")).sendKeys(l.get(3).get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(l.get(2).get(4));
	}
	@When("user enter values in fields by using two dim map")
	public void user_enter_values_in_fields_by_using_two_dim_map(io.cucumber.datatable.DataTable dataTable) {
	   List<Map<String, String>> m = dataTable.asMaps();
	   driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(m.get(2).get("fname"));
		driver.findElement(By.id("lname")).sendKeys(m.get(1).get("lname"));
		driver.findElement(By.id("email")).sendKeys(m.get(3).get("mail"));
		driver.findElement(By.name("addr")).sendKeys(m.get(1).get("addr"));
		driver.findElement(By.id("telephoneno")).sendKeys(m.get(3).get("phno"));
	   
	}
@When("user click on submit button")
	public void user_click_on_submit_button() {
		c.button(a.getSubmit());
	    }

	@Then("user shoukld be displayed customer id is generated")
	public void user_shoukld_be_displayed_customer_id_is_generated() throws InterruptedException {
		
	c.button(a.getText());
		System.out.println(a.getText());
		
	    
	}

}
