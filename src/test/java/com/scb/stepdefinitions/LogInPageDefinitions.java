package com.scb.stepdefinitions;

import com.scb.base.Base;
import com.scb.pageexecution.SignInPageExecution;
import io.cucumber.java.en.*;
import io.cucumber.java.ro.Si;

public class LogInPageDefinitions extends Base
{
    @Given("user is on the login page")
    public void user_is_on_the_login_page() throws InterruptedException
    {
        launchUrl("https://practicetestautomation.com/practice-test-login/");
    }

    @When("user enters the valid username {string} and password {string}")
    public void user_enters_the_valid_username_and_password(String username, String password)
    {
        SignInPageExecution.enterUsername(username);
        SignInPageExecution.enterPassword(password);
    }

    @Then("user click on the submit button")
    public void userClickOnTheSubmitButton()
    {
        SignInPageExecution.clickLogInButton();
    }
    @Then("user should be able to navigated to the homepage")
    public void user_should_be_able_to_navigated_to_the_homepage()
    {

    }
}
