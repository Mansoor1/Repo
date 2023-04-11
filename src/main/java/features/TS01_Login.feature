Feature: Login Action
Scenario: Verify Login with valid Data and display message as Login Successful
Given When user is on Home page
When User Clicks on Sign in link
Then Verify Login title
When user enters valid User name and Password click on Signin 
Then check user and display message as Login Successful
And Close AUT
Scenario: Verify Login with invalid Data and display message as Login Successful
Given When user is on Home page
When User Clicks on Sign in link
When user enters invalid User name or invalid Password click on Signin 
Then check error message
And Close AUT
