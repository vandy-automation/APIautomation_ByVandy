@employeeId
Feature: Get employee id information

  Scenario: I want to get the specific employees Id
    Given I have a Get Employee Id request
    When I triggered the Get request to fetch specific employee id
    Then The success code response should be 200
    And The employee Id fetched is correct
    And The Json schema should contain fields "id","employee_name","employee_salary","employee_age","profile_image"
    And The Age of all Employee should be greater than 18
    And The Salary of Employee should be greater than zero
    And The Employee Name must not be null
    And The ID of Employee should be unique


