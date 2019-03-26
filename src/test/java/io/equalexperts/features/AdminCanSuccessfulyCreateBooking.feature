Feature: Booking 
	As an Administrator 
	I want the ability to manage hotel bookings
	So that I can add and delete bookings
	
	
Scenario Outline: Administrator can successfully add new bookings

		Given I am on Hotel Booking Form 
		When I enter a firstname  as "<FirstName>"
		And I enter a surname as "<Surname>"
		And I enter a price as "<Price>"
		And I select deposit as "<Deposit>"
		And I select check in date as "<Checkin>"
		And I select check out date as "<Checkout>"
		And I click on save button
		Then the "<FirstName>" displayed on the list of bookings
		
		
Examples:
		|FirstName|Surname|Price|Deposit|Checkin     |Checkout        |
		|John	  |Brexit |1000 |True   |2019-03-28  |2019-03-31      |
		|Ben      |France |500  |False  |2019-03-28  |2019-03-31      |