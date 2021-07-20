Feature: Login to facebook

@smoke
Scenario: positive validation for successful login
  Given User is on facebook page
  When user enter "username"
  And  user enter "password"
  And user click on login button
  Then validate successful login message
  And user is able to see profile page



@regression
Scenario: positive validation for successful login
    Given User is on facebook page
    When user enter username and password
      |username|password|
      |vinay   |123     |
      |vivek   |567     |
    And user click on login button
    Then validate successful login message
    And user is able to see profile page
