package com.cucumber.qa.steps;

import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.qa.pages.FlightPurchasePage;
import com.cucumber.qa.utils.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightPurchaseSteps {
	
	FlightPurchasePage autoObj;

	@Given("User Navigates to Flight Purchase Page {string}")
	public void navigateToFlightPage(String url) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		Constants.driver = new ChromeDriver();
		Constants.driver.manage().window().maximize();
		
		Thread.sleep(3000);
		Constants.driver.get(url);
		
		autoObj = new FlightPurchasePage();
	}

	@When("User enters Full Name {string}")
	public void enterUserFullName(String name) {
		autoObj.enterFullName(name);
	}

	@When("User enters Address {string}")
	public void enterUserAddress(String address) {
		autoObj.enterAddress(address);
	}

	@When("User enters City {string}")
	public void enterUserCity(String city) {
		autoObj.enterCity(city);

	}

	@When("User enters State {string}")
	public void enterUserState(String state) {
		autoObj.enterState(state);
	}

	@When("User enters ZipCode {string}")
	public void enterUserZipCode(String zipcode) {
		autoObj.enterZipCode(zipcode);
	}

	@When("User selects CardType {string}")
	public void selectUserCardType(String cardType) {
		autoObj.selectCardTypr(cardType);
	}

	@When("User enters Card Number {string}")
	public void enterUserCardNumber(String cardNum) {
		autoObj.enterCardNumber(cardNum);
	}

	@When("User enters Card Exp. Month {string}")
	public void enterUserCardExpMonth(String month) {
		autoObj.enterCardExpiryMonth(month);
	}

	@When("User enters Card Exp. Year {string}")
	public void enterUserCardExpYear(String year) {
		autoObj.enterCardExpiryYear(year);
	}

	@When("User enters Name on Card {string}")
	public void enterUserNameOnCard(String nameOnCard) {
		autoObj.enterNameOnCard(nameOnCard);
	}

	@When("User checks Remember me CheckBox")
	public void userChecksRememberMe() {
		autoObj.checkRememberMeBox();
	}

	@When("User clicks Purchase Flight button")
	public void userClicksPurchaseFlight() {
		autoObj.submitFlightPurchase();
	}

	@Then("User Verifies success message {string}")
	public void verifyUserSuccessMessage(String message) throws InterruptedException {
		autoObj.verifyMessage(message);
		
		
	Thread.sleep(2000);
	Constants.driver.quit();
	}
}
