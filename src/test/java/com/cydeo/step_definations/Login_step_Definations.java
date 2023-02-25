package com.cydeo.step_definations;
import com.cydeo.pages.SeamLessLogin_page;
import com.cydeo.utilities.configurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.*;
import com.cydeo.utilities.Driver;
import org.junit.Assert;

public class Login_step_Definations {

    SeamLessLogin_page loginPage=new SeamLessLogin_page();
    @Given("the user is on the log in page")
    public void the_user_is_on_the_log_in_page() {
        Driver.getDriver().get(configurationReader.getProperty("seamless.url"));
    }
    @When("the user enter valid username")
    public void the_user_enter_valid_username() {
        loginPage.txt_username.sendKeys(configurationReader.getProperty("seamless.username"));
    }
    @When("the user enter valid password")
    public void the_user_enter_valid_password() {
        loginPage.txt_password.sendKeys(configurationReader.getProperty("seamless.password"));
    }
    @When("the user clicks the log in button")
    public void the_user_clicks_the_log_in_button() {
        loginPage.btn_log_in.click();
    }
    @Then("the user should be able to log in")
    public void the_user_should_be_able_to_log_in() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Files"));
    }





    @When("the user enters username {string}")
    public void the_user_enter_username_with_param(String username) {
        loginPage.txt_username.sendKeys(configurationReader.getProperty("seamless.username"));
    }
    @When("the user enters password {string}")
    public void the_user_enter_password_with_param(String password) {
        loginPage.txt_password.sendKeys(configurationReader.getProperty("seamless.password"));
    }


    @Then("the user should not be able to log in")
    public void theUserShouldNotBeAbleToLogIn() {
    }
}




