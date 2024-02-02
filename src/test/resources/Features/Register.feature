@tag
Feature: Exploring the Register Page
  

  @tag1
  Scenario: Successful Register with proper User name and Password
  
    Given User entered Valid username and password
    When  user clicks register button1
    Then user will redirect to dsportal home page
    

  @tag2
  Scenario Outline: Unsuccessful login with invalid or empty credentials
    Given User have entered invald "<username>" and "<password>" and "<confirmpwd>"
    When User clicks register button
    Then user will get the error message

    Examples: 
    
      | username  | password | confirmpwd  |
      |  |     samplepwd | samplepwd |
      | girija |     123456 | 123456    |
      | sai |     123456 | sample    |
      | shami |     123456 |     |
      | saranya |      | 123456    |