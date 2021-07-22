Feature: Login to application under test

  In order to validate login with the correct credentials

  Background:
    Given User is on facebook page

@smoke
Scenario: Positive validation for successful login

   When user enter "username"
   And  user enter "password"
   And user click on login button
   Then validate successful login message
   And user is able to see profile page



  @regression
  Scenario Outline: positive validation for successful login

    When user enter "<username>" and "<password>"
    And user click on login button
    Then validate successful login message
    And user is able to see profile page
    Examples:
      | username | password |
      | vinay    | 123      |
      | vivek    | 567      |