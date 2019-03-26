package io.equalexperts.pages;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.equalexperts.helper.Helper;

public class Homepage extends Helper {

	WebElement header;
	WebElement firstName;
	WebElement surName;
	WebElement price;
	WebElement deposit;
	WebElement checkin;
	WebElement checkout;
	WebElement save;
	List<WebElement> savedName;
	List<WebElement> delete;
	public void isHomePageDisplayed() throws Exception {
		header = getElementByCssSelector(".jumbotron h1");
		Assert.assertTrue(header.isDisplayed());
	}

	public void enterFirstName(String item) throws Exception {
		firstName = getElementById("firstname");
		firstName.sendKeys(item);
	}

	public void enterSurName(String item) throws Exception {
		surName = getElementById("lastname");
		surName.sendKeys(item);

	}

	public void enterPrice(String item) throws Exception {
		price = getElementById("totalprice");
		price.sendKeys(item);
	}

	public void selectDeposit(String option) throws Exception {
		deposit = getElementById("depositpaid");
		
		int optionIndex = 0;

		if (option.equalsIgnoreCase("true")) {
			optionIndex = 0;
		} else if (option.equalsIgnoreCase("false")) {
			optionIndex = 1;
		}

		selectByIndex(deposit, optionIndex);
	}

	public void entercheckindate(String checkinDate) throws Exception {
		checkin = getElementById("checkin");
		checkin.sendKeys(checkinDate);
	
}
	public void entercheckoutdate(String checkoutDate) throws Exception {
		checkout = getElementById("checkout");
		checkout.sendKeys(checkoutDate);
	}
	public void clicksavebutton () throws Exception {
		save = getElementByCssSelector("[value=\" Save \"]");
		save.click();
	}
	public void detailSuppliedSaved(String name) throws Exception{
		Thread.sleep(10000);
		savedName = getElementsByCssSelector(".col-md-2 p");
		ArrayList<String> names = new ArrayList<String>();
		
		for(WebElement element : savedName)
		{
			names.add(element.getText());
		}
		
		Assert.assertTrue(names.contains(name));
		
	}
	public void deletesavedbookings() throws Exception {
		refreshPage();
		
		Thread.sleep(5000);
		delete = getElementsByCssSelector(".col-md-1 input");
		
		
		waitForElementsToBeDisplayed(delete);
		int deleteSize = delete.size()-3;
		delete.get(deleteSize).click();
		
	}
	public void detailSuppliedDeleted(String name) throws Exception{
		Thread.sleep(10000);
		savedName = getElementsByCssSelector(".col-md-2 p");
		ArrayList<String> names = new ArrayList<String>();
		
		for(WebElement element : savedName)
		{
			names.add(element.getText());
		}
		
		Assert.assertFalse(names.contains(name));
		
	}
	
	
}
