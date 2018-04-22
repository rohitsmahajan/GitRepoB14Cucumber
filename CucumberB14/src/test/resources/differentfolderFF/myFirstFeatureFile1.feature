Feature: Create account of Facebook
As a user i need to open facebook homepage and do validations

Scenario: Validate First name Field
Given User needs to be on facebook login page
When User enters "David" First name 
Then user checks entered name "David" is present in first name