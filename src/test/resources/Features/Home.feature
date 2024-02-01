
Feature: Getting Dsalgo App portal
   
  Scenario: Navigating to Dsalgo Home page
    Given User launch the browser  
    And enters Dsalgo portal Url
    When  User clicks get started button
    Then user navigate to Dsalgo home page
    
  Scenario: Registered user can access Home Page 
   Given User is on Home Page
   When User Clicks data structures Drop down
   And clicks any of the listed six options
   Then User gets error message 'You are not logged in'
    
  Scenario: Exploring Get started button in data structure Topics
   Given User is on dsportal Home Page
   When User clicks Get Started button in data structure Topics
   Then User gets alert message
   
  Scenario: User clicks Register link
   Given User is on Dsportal home page
   When User clicks register link
   Then User will redirect to the register page
   
   Scenario: User clicks Login link
   Given User is on DSportal home page
   When User clicks login link
   Then User will redirect to the login page