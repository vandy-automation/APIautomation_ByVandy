package com.de.steps;

import com.de.constants.Constant;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapper;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.List;

public class GetCompanySteps {

    public Response response;
    public RequestSpecification request;
    public String company_count;
    Constant constant=new Constant();

    @Given("^I logged to the DE API system as admin$")
    public void iLoginToTheDEAPISystemAsAdmin() {
                request = RestAssured.given()
                .baseUri("http://admin.newdiningedge.baitek.org:8100/api")
                .header("ContentType", "application/json")
                .cookie("PHPSESSID", constant.getPhpSessId())
                .basePath("/companies")
                .queryParam("page",1);
    }

    @When("^I Trigger the get request$")
    public void iTriggerTheGetRequest() {
        response = request.get();
    }

    @Then("^Verify the success code response of the API$")
    public void verifyTheSuccessCodeResponseOfTheAPI() {
        int status_code = response.getStatusCode();
        System.out.println(status_code);
        Assert.assertEquals(200, status_code);
        response.prettyPrint();

        System.out.println("Passed");
    }


    @And("^Verify the total count of the companies$")
    public void verifyTheTotalCountOfTheCompanies() {
    }

    @And("^Get the list of companies$")
    public void getTheListOfCompanies() {
    }


    @And("^get the phpSessId$")
    public void getThePhpSessId() {
        
    }

    @And("^phpSessId is provided$")
    public void phpsessidIsProvided() {
    }
}
