package com.de.framework;

import com.de.constants.Constant;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RestUtils {

    public RequestSpecification getRequestSpecification(String path, String paramname, String paramval){
       return RestAssured.given()
                .baseUri(Constant.emp_baseUri)
                .basePath(path)
               .param(paramname,paramval)
               //.basePath(Constant.p_employees)
                .header("content-Type", "application/json");
    }
    public RequestSpecification getRequestSpecification(String path){
        return RestAssured.given()
                .baseUri(Constant.emp_baseUri)
                .basePath(path)
                //.basePath(Constant.p_employees)
                .header("content-Type", "application/json");
    }
}
