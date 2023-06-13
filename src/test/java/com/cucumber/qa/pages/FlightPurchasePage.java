package com.cucumber.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.qa.utils.Constants;

public class FlightPurchasePage {
	
	// a: Inspect Highlighted Objects
	@FindBy(id = "inputName")
	WebElement fullNameField;
	
	@FindBy(id = "address")
	WebElement addressField;
	
	@FindBy(id = "city")
	WebElement cityField;

	@FindBy(id = "state")
	WebElement stateField;
	
	@FindBy(id = "zipCode")
	WebElement zipCodeField;
	
	@FindBy(id = "cardType")
	WebElement cardTypeDropdown;
	
	@FindBy(id = "creditCardNumber")
	WebElement creditCardNumberField;
	
	@FindBy(id = "creditCardMonth")
	WebElement creditCardMonthField;
	
	@FindBy(id = "creditCardYear")
	WebElement creditCardYearField;
	
	@FindBy(id = "nameOnCard")
	WebElement nameOnCardField;
	
	@FindBy(id = "rememberMe")
	WebElement rememberMeChechBox;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement purchaseFlightButton;
	
	@FindBy(xpath = "//h1[text()='Thank you for your purchase today!']")
	WebElement successMessage;
	
	//b. Create Constructor
	public FlightPurchasePage() {
		PageFactory.initElements(Constants.driver, this);
	}
	
	//c. Create Methods
	public void enterFullName(String fullNeme) {
		fullNameField.sendKeys(fullNeme);
	}
	public void enterAddress(String address) {
		addressField.sendKeys(address);
	}
	public void enterCity(String city) {
		cityField.sendKeys(city);
	}
	public void enterState(String state) {
		stateField.sendKeys(state);
	}
	public void enterZipCode(String zipcode) {
		zipCodeField.sendKeys(zipcode);
	}
	public void selectCardTypr(String cardType) {
		Select select = new Select(cardTypeDropdown);
		select.selectByVisibleText(cardType);
	}
	public void enterCardNumber(String cardNumber) {
		creditCardNumberField.sendKeys(cardNumber);
	}
	public void enterCardExpiryMonth(String month) { 
		creditCardMonthField.clear();
		creditCardMonthField.sendKeys(month);
	}
	public void enterCardExpiryYear(String year) { 
		creditCardYearField.clear();
		creditCardYearField.sendKeys(year);
	}
	public void enterNameOnCard(String name) {
		nameOnCardField.sendKeys(name);
	}
	public void checkRememberMeBox() {
		rememberMeChechBox.click();
	}
	public void submitFlightPurchase() {
		purchaseFlightButton.click();
	}
	public void verifyMessage(String message) {
		String textMessage = successMessage.getText();
		
		if(textMessage.equals(message)) {
			System.out.println("PASSED");
		}else {
			System.out.println("FAILED");
		}
	}

}
