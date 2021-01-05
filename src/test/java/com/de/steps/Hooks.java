package com.de.steps;

import com.de.constants.Constant;
import cucumber.api.java.Before;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.HashMap;

public class Hooks {

    Constant constant = new Constant();

    @Before
    public void generateAuth() {
        // code to call login api and parse phpsess ID
        Response response = loginCheck(Constant.qaEnv);
        String sessid= response.getCookie("PHPSESSID");
        System.out.println("session id "+ sessid);
        constant.setPhpSessId(sessid);
    }

    private Response loginCheck(String uri) {
        String csrf = getCsrfToken(uri);
        HashMap<String,String> headermap= new HashMap();
        headermap.put("Accept","*/*");
        headermap.put("Content-Type","application/x-www-form-urlencoded");
        headermap.put("User-Agent"," Mozilla/5.0");

         HashMap<String,String> formmap= new HashMap();
        formmap.put("_csrf_token",csrf);
        formmap.put("_username"," admin");
        formmap.put("_password"," 123456");
        formmap.put("_submit","Log in");

        RequestSpecification requestSpecification = RestAssured
                .given()
                .baseUri(uri)
                .basePath("/login_check")
                .headers(headermap)
                .formParams(formmap);

       Response response= requestSpecification.post();
        Assert.assertEquals(302, response.statusCode());
        return response;
    }

    private String getCsrfToken(String uri) {
        Response response = RestAssured.given().baseUri(uri).basePath("/login").post();
        String responseHtml = response.getBody().asString();
        String inputTag = responseHtml.substring(responseHtml.indexOf("_csrf_token"));
        return inputTag.substring(inputTag.indexOf("=\""),inputTag.indexOf("/>")-2).replace("=","");
    }

}
