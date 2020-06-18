Feature: Login to App


Scenario:  Normal user valid login
Given  user is at login page
When   Title of page is MYtitle
And  user Enters userName and password "parawat" "Test@123"
And  user clicks submit button
Then user is at homepage


