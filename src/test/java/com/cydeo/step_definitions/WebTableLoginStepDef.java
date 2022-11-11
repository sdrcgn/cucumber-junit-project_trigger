package com.cydeo.step_definitions;

import com.cydeo.page.WebTableLoginPage;
import com.cydeo.utility.ConfigurationReader;
import com.cydeo.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.lang.module.Configuration;
import java.util.Map;

public class WebTableLoginStepDef {
    WebTableLoginPage webTableLoginPage=new WebTableLoginPage();

    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
      Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
         webTableLoginPage.userName.sendKeys(string);
    }
    @When("user enters password {string}")
    public void user_enters_password(String stringPass) {
       webTableLoginPage.password.sendKeys(stringPass);
    }
    @When("user clicks enter button")
    public void user_clicks_enter_button() {
     webTableLoginPage.clickEnter.click();
    }
    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        System.out.println("Driver.getDriver().getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));

    }

    @When("user enters username {string} password {string} and login")
    public void user_enters_username_password_and_login(String username, String password) {
        // webTableLoginPage.userName.sendKeys(username);
        //webTableLoginPage.password.sendKeys(password);
       // webTableLoginPage.clickEnter.click();
        webTableLoginPage.login(username,password);
    }


    @When("user enter below credentials")
    public void userEnterBelowCredentials(Map<String,String> credentials) {
   /* webTableLoginPage.userName.sendKeys(credentials.get("username"));
    webTableLoginPage.password.sendKeys(credentials.get("password"));
    webTableLoginPage.clickEnter.click(); */
      webTableLoginPage.login(credentials.get("username"), credentials.get("password"));
    }

}
