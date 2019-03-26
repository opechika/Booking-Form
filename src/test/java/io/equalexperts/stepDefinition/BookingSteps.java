package io.equalexperts.stepDefinition;

import org.openqa.selenium.remote.server.handler.RefreshPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.equalexperts.helper.Helper;
import io.equalexperts.pages.Homepage;

public class BookingSteps extends Helper {
	
	Homepage homePage = new Homepage();
	
	@Given("I am on Hotel Booking Form")
	public void i_am_on_Hotel_Booking_Form() throws Throwable {
		
		homePage.isHomePageDisplayed();	    
	}

	@When("I enter a firstname  as {string}")
	public void i_enter_a_firstname_as(String item) throws Throwable {
		
		homePage.enterFirstName(item);	    
	}

	@When("I enter a surname as {string}")
	public void i_enter_a_surname_as(String item) throws Throwable {
		
		homePage.enterSurName(item);	    
	}

	@When("I enter a price as {string}")
	public void i_enter_a_price_as(String item) throws Throwable {
		
		homePage.enterPrice(item);	    
	}

	@When("I select deposit as {string}")
	public void i_select_deposit_as(String option) throws Throwable {
		homePage.selectDeposit(option);
	    
	}

	@When("I select check in date as {string}")
	public void i_select_check_in_date_as(String checkin) throws Throwable {
		homePage.entercheckindate(checkin);
	    
	}

	@When("I select check out date as {string}")
	public void i_select_check_out_date_as(String checkout) throws Throwable {
		homePage.entercheckoutdate(checkout);
	    
	}

	@When("I click on save button")
	public void i_click_on_save_button() throws Throwable {
		
		homePage.clicksavebutton();
	    
	}
	@Then("the {string} displayed on the list of bookings")
	public void the_displayed_on_the_list_of_bookings(String fName) throws Throwable {
		homePage.detailSuppliedSaved(fName);
	    
	}



	@Given("a booking has been created for {string}")
	public void a_booking_has_been_created_for(String name) throws Throwable {
		
		homePage.enterFirstName(name);	
		homePage.enterSurName("Someone");
		homePage.enterPrice("120.34");
		homePage.selectDeposit("true");
		homePage.entercheckindate("2019-05-01");
		homePage.entercheckoutdate("2019-05-03");
		homePage.clicksavebutton();
		
	}

	@When("I click on the delete button against the booking")
	public void i_click_on_the_delete_button_against_the_booking() throws Throwable {
	    homePage.deletesavedbookings();
	}

	@Then("the details of the booking for {string} is removed from the form")
	public void the_details_of_the_booking_for_is_removed_from_the_form(String name) throws Throwable {
		homePage.detailSuppliedDeleted(name);
		
	   
	}

}
