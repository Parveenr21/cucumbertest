Feature: Login to App


Scenario:  Normal user valid login with dynamic values yetAGAIN
Given  user is at login page
When   Title of page is MYtitle
And  user Enters userName  and password
  |Name |Passwd|Age|
  |ramu |ramupasword|20|
  |Shamu|Shamupassword|30|
And  user clicks submit button
Then user is at homepage


  