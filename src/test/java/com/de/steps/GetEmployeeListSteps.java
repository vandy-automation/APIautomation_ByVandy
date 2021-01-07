package com.de.steps;


import com.de.constants.Constant;
import com.de.dto.Employee;
import com.de.framework.RestUtils;
import com.google.gson.Gson;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.Argument;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class GetEmployeeListSteps {

    public RequestSpecification requestSpecification;
    public Response response;
    RestUtils restUtils=new RestUtils();
    //    List<Employee> employeeList;
    Employee[] employeeList;

    @Given("^I have a Get Employee List request$")
    public void iHaveAGetEmployeeListRequest() {
        requestSpecification = restUtils.getRequestSpecification(Constant.p_employees);
    }

    @Given("^I have a Get Employee Id request$")
    public void iHaveAGetEmployeeIdRequest() {
        requestSpecification = restUtils.getRequestSpecification(Constant.p_employeeId);
    }

    @When("^I triggered the Get request to fetch all employee list$")
    public void iTriggeredTheGetRequestToFetchAllEmployeeList() {
        response = requestSpecification.get();
    }

    @Then("^The success code response should be \"([^\"]*)\"$")
    public void theSuccessCodeResponseShouldBe(String status_code) {
        int Status_code = response.getStatusCode();
        Assert.assertEquals("200", status_code);
        System.out.println(status_code);
        System.out.println(response.asString());
    }

    @And("^The count of employee must be (\\d+)$")
    public void theCountOfEmployeeMustBe(int count) {
//       employeeList =response.getBody().jsonPath().getList("data");
        String json = response.getBody().jsonPath().getString("data");
        System.out.println("json string : " + json);
        Gson gson = new Gson();
        Employee[] employees = gson.fromJson(json, Employee[].class);
        count = employeeList.length;
        System.out.println(count);
        Assert.assertEquals(24, count);
    }

    @And("^The Json schema should contain fields \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void theJsonSchemaShouldContainFields(String id, String employee_name, String employee_salary, String employee_age, String profile_image) {

    }


    @And("^The Age of all Employee should be greater than \"([^\"]*)\"$")
    public void theAgeOfAllEmployeeShouldBeGreaterThan(String age) {

    }

    @And("^The Salary of every Employee should be greater than zero$")
    public void theSalaryOfEveryEmployeeShouldBeGreaterThan() {
        for (Employee employee : employeeList) {
            String salary = employee.getEmployee_salary();
            int sal = Integer.parseInt(salary);
            if (sal <= 100000) {
                Assert.fail();
            }

        }

    }

    @And("^The Employee Name must not be null$")
    public void theEmployeeNameMustNotBeNull() {
    }

    @And("^The ID of every Employee should be unique$")
    public void theIDOfEveryEmployeeShouldBeUnique() {
    }


    @When("^I triggered the Get request to fetch specific employee id$")
    public void iTriggeredTheGetRequestToFetchSpecificEmployeeId() {
    }

    @Then("^The success code response should be (\\d+)$")
    public void theSuccessCodeResponseShouldBe(int arg0) {
    }

    @And("^The employee Id fetched is correct$")
    public void theEmployeeIdFetchedIsCorrect() {
    }

    @And("^The Age of all Employee should be greater than (\\d+)$")
    public void theAgeOfAllEmployeeShouldBeGreaterThan(int arg0) {
    }

    @And("^The Salary of Employee should be greater than zero$")
    public void theSalaryOfEmployeeShouldBeGreaterThanZero() {
    }

    @And("^The ID of Employee should be unique$")
    public void theIDOfEmployeeShouldBeUnique() {
    }
}
