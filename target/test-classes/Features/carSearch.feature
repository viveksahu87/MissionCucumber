Feature: validation of car search
  In order to validate car search as buyer
  i will navigate to http://www.carsguide.com.au

  Scenario: Searching new car

    Given I am on the home page of carsguide website -> http://www.carsguide.com.au
    When I move to car for sale menu
    Then I click on Search Cars
    And I select make as "BMW"
    And I select model as "1Series"
    And I select location as "Australia"
    And I select price as "$10000"
    And I click on Find My Next Car Button
    Then I should see list of searched cars
    And the page title should be "BMW 1 Series Cars Under $10000 for sale"