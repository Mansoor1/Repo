Feature: Login Action
Scenario Outline: Login Validation with multiple data
Given When user is on Home page
When User Clicks on Sign in link
When user enters "<uname>" and "<password>" to Login page
Then user should able to see his Account

Examples:
|uname|password|
|m.arpana|arpana123|
|riya|riya123| 