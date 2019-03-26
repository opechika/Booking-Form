Feature: Booking 
	As an Administrator 
	I want the ability to manage hotel bookings
	So that I can add and delete bookings
	
	
Scenario: Administrator can delete booking from Hotel Booking Form
			Given I am on Hotel Booking Form
			And a booking has been created for "John_Brexit"
			When I click on the delete button against the booking
			Then the details of the booking for "John_Brexit" is removed from the form  
	