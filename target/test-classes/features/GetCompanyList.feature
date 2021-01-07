@test @regression
Feature: Get Company details
  As an Admin, I want to Retrieves the collection of Company resources.
  Retrieves a Company resource.
  Retrieves the collection of ProductCategory resources.

  Scenario: Retrieves the collection of Company resources.
    Given I logged to the DE API system as admin
    When I Trigger the get request
    Then Verify the success code response of the API
    And Verify the total count of the companies
    And Get the list of companies

