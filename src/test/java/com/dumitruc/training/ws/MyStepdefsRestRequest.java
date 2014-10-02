package com.dumitruc.training.ws;

import com.jayway.restassured.response.Response;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.jayway.restassured.RestAssured.*;
import static com.jayway.restassured.matcher.RestAssuredMatchers.*;


/**
 * Created with IntelliJ IDEA.
 * User: dumitruc
 * Date: 01/10/14
 * Time: 20:25
 * To change this template use File | Settings | File Templates.
 */
public class MyStepdefsRestRequest {

    private static final String DEST_URL="http://localhost:8123/hello";
    private static final String OPEN_ENDPOINT="http://localhost:8321/helloBack";


    @Given("^I have generated the most basic request$")
    public void i_have_generated_the_most_basic_request() throws Throwable {
        System.out.println("Some request...");
    }

    @When("^I forward the request to my api component$")
    public void i_forward_the_request_to_my_api_component() throws Throwable {

        Response restResponse = get(DEST_URL).andReturn();

        restResponse.getBody().peek();
    }

    @Then("^it will forward a request to backend component$")
    public void it_will_forward_a_request_to_backend_component() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^respond back successfully$")
    public void respond_back_successfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
