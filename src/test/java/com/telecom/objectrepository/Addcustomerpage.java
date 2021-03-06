package com.telecom.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.telecom.resources.CommonActions;

public class Addcustomerpage extends CommonActions{
	public Addcustomerpage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[text()='Add Customer'])[1]")
	private WebElement customerButton;
	
	@FindBy(xpath="//label[@for='done']")
	private WebElement doneButton;
	
	@FindBy(id="fname")
	private WebElement firstname;
	
	@FindBy(id="lname")
	private WebElement lastname;
	
	@FindBy(id="email")
	private WebElement mail;
	
	@FindBy(id="addr")
	private WebElement adrress;
	
	@FindBy(id="telephoneno")
	private WebElement num;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath="(//td[@align='center'])[2]")
	private WebElement text;

	public WebElement getCustomerButton() {
		return customerButton;
	}

	public WebElement getDoneButton() {
		return doneButton;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getAdrress() {
		return adrress;
	}

	public WebElement getNum() {
		return num;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getText() {
		return text;
	}


}
