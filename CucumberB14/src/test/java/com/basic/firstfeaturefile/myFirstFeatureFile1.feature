Feature: Create account of Facebook
As a user i need to open facebook homepage and do validations

Scenario: Validate First name Field
Given User needs to be on facebook login page
When User enters "Rohit" and "Mahajan" as First name and Last name
Then user checks entered names "Rohit" and "Mahajan" are present in name fields