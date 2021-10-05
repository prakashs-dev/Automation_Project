Feature: Hotel Booking In Adactin Applications

@smoketest
Scenario Outline: Login Page

Given user Lanuch The Applications
When user Enter The "<username>" In Username Field
And user Enter The "<password>" In Password Field
Then user Click The Login Button And It Navigate To The Select Hotel Page

Examples:

		|username|password|
		|Advija|Advi@123|
		|Alpha|Alpha@123|
		|vinilakumar|vinila@123|

@sanitytest
Scenario: Search Hotel Page

When user Select The Hotel Location
And user Select "Hotel Hervey"
And user Select Room Type 
And user Select Number of Numbers
And user Enter The Check IN Date
And user Enter The Check Out Date
And user Select Adult Room
And User Select Child Room
Then user Click Search a Hotel And Navigate To Select Hotel Page

@sanitytest
Scenario: Select Hotel Page

When user Click On The Radio Button Select Hotel On Given A List
Then user Click A Continue Button And Navigate To Book Hotel Page

@sanitytest
Scenario: Book Hotel Page

When user Enter A First Name On The Fname Field
And user Enter A Last Name On The Lname Field
And user Enter A Address On The Billing Address Field
And user Enter A Card Number In Credit Card No Field
And user Select A Card Type In Card Type Field
And user Select A Exprie Month In Exp Month Field
And user Select A Exprie Year In Exp Year Field
And user Enter A CVV No In CVV Field
Then user Click A BooK Now Button And Its Navigate To Booking Confirmation Page

@sanitytest
Scenario: Booking Confirmation 

When user Click The My Itinerary Button And Navigate To Booked Itinerary Page

@regressiontest
Scenario: Booked Itinerary Page

Then user Click The Logut Button




