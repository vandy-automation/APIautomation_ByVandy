$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GetEmployeeList.feature");
formatter.feature({
  "line": 2,
  "name": "Get employee list",
  "description": "",
  "id": "get-employee-list",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@employeelist"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "I want to get the list of all employees",
  "description": "",
  "id": "get-employee-list;i-want-to-get-the-list-of-all-employees",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I have a Get Employee List request",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I triggered the Get request to fetch all employee list",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "The success code response should be \"200\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "The count of employee must be 24",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "The Json schema should contain fields \"id\",\"employee_name\",\"employee_salary\",\"employee_age\",\"profile_image\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "The Age of all Employee should be greater than \"18\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "The Salary of every Employee should be greater than zero",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "The Employee Name must not be null",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "The ID of every Employee should be unique",
  "keyword": "And "
});
formatter.match({
  "location": "GetEmployeeListSteps.iHaveAGetEmployeeListRequest()"
});
formatter.result({
  "duration": 754286400,
  "status": "passed"
});
formatter.match({
  "location": "GetEmployeeListSteps.iTriggeredTheGetRequestToFetchAllEmployeeList()"
});
formatter.result({
  "duration": 2151845800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 37
    }
  ],
  "location": "GetEmployeeListSteps.theSuccessCodeResponseShouldBe(String)"
});
formatter.result({
  "duration": 18578500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "24",
      "offset": 30
    }
  ],
  "location": "GetEmployeeListSteps.theCountOfEmployeeMustBe(int)"
});
formatter.result({
  "duration": 118404700,
  "error_message": "io.restassured.path.json.exception.JsonPathException: Failed to parse the JSON document\r\n\tat io.restassured.path.json.JsonPath$ExceptionCatcher.invoke(JsonPath.java:930)\r\n\tat io.restassured.path.json.JsonPath$4.doParseWith(JsonPath.java:895)\r\n\tat io.restassured.path.json.JsonPath$JsonParser.parseWith(JsonPath.java:974)\r\n\tat io.restassured.path.json.JsonPath.get(JsonPath.java:201)\r\n\tat io.restassured.path.json.JsonPath.getString(JsonPath.java:351)\r\n\tat com.de.steps.GetEmployeeListSteps.theCountOfEmployeeMustBe(GetEmployeeListSteps.java:52)\r\n\tat ✽.And The count of employee must be 24(GetEmployeeList.feature:8)\r\nCaused by: groovy.json.JsonException: Lexing failed on line: 1, column: 1, while reading \u0027\u003c\u0027, no possible valid JSON value or punctuation could be recognized.\r\n\tat groovy.json.JsonLexer.nextToken(JsonLexer.java:85)\r\n\tat groovy.json.JsonLexer$nextToken.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:113)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:117)\r\n\tat io.restassured.internal.path.json.ConfigurableJsonSlurper.parse(ConfigurableJsonSlurper.groovy:97)\r\n\tat io.restassured.internal.path.json.ConfigurableJsonSlurper$parse.callCurrent(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallCurrent(CallSiteArray.java:52)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:154)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:166)\r\n\tat io.restassured.internal.path.json.ConfigurableJsonSlurper.parseText(ConfigurableJsonSlurper.groovy:83)\r\n\tat io.restassured.path.json.JsonPath$4$1.method(JsonPath.java:893)\r\n\tat io.restassured.path.json.JsonPath$ExceptionCatcher.invoke(JsonPath.java:928)\r\n\tat io.restassured.path.json.JsonPath$4.doParseWith(JsonPath.java:895)\r\n\tat io.restassured.path.json.JsonPath$JsonParser.parseWith(JsonPath.java:974)\r\n\tat io.restassured.path.json.JsonPath.get(JsonPath.java:201)\r\n\tat io.restassured.path.json.JsonPath.getString(JsonPath.java:351)\r\n\tat com.de.steps.GetEmployeeListSteps.theCountOfEmployeeMustBe(GetEmployeeListSteps.java:52)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:220)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:53)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "id",
      "offset": 39
    },
    {
      "val": "employee_name",
      "offset": 44
    },
    {
      "val": "employee_salary",
      "offset": 60
    },
    {
      "val": "employee_age",
      "offset": 78
    },
    {
      "val": "profile_image",
      "offset": 93
    }
  ],
  "location": "GetEmployeeListSteps.theJsonSchemaShouldContainFields(String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "18",
      "offset": 48
    }
  ],
  "location": "GetEmployeeListSteps.theAgeOfAllEmployeeShouldBeGreaterThan(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GetEmployeeListSteps.theSalaryOfEveryEmployeeShouldBeGreaterThan()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GetEmployeeListSteps.theEmployeeNameMustNotBeNull()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GetEmployeeListSteps.theIDOfEveryEmployeeShouldBeUnique()"
});
formatter.result({
  "status": "skipped"
});
});