@employeelist
Feature: Get employee list

  Scenario: I want to get the list of all employees
    Given I have a Get Employee List request
    When I triggered the Get request to fetch all employee list
    Then The success code response should be "200"
    And The count of employee must be 24
    And The Json schema should contain fields "id","employee_name","employee_salary","employee_age","profile_image"
    And The Age of all Employee should be greater than "18"
    And The Salary of every Employee should be greater than zero
    And The Employee Name must not be null
    And The ID of every Employee should be unique


