Feature: Login to App


Scenario Outline:  Normal user valid login with dynamic values
Given  user is at login page
When   Title of page is MYtitle
And  user Enters userName "<userNAME>" and password "<userPASSWORD>"
And  user clicks submit button
Then user is at homepage

Examples:
  | userNAME | userPASSWORD |
  | hotmail | hot@123 |
  | yahoomail | yahoo@123 |

