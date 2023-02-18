package com.cydeo.step_definations;
import com.cydeo.utilities.configurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.*;
import com.cydeo.utilities.Driver;

public class Login_step_Definations {

    @Given("the user is on the log in page")
    public void the_user_is_on_the_log_in_page() {
        Driver.getDriver().get(configurationReader.getProperty("seamless.url"));
    }
    @When("the user enter valid username")
    public void the_user_enter_valid_username() {


    }
    @When("the user enter valid password")
    public void the_user_enter_valid_password() {

    }
    @When("the user clicks the log in button")
    public void the_user_clicks_the_log_in_button() {

    }
    @Then("the user should be able to log in")
    public void the_user_should_be_able_to_log_in() {

    }



}





