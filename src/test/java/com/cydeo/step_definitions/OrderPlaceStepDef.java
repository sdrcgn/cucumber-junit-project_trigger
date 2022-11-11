package com.cydeo.step_definitions;

import com.cydeo.page.OrderPlacePage;
import com.cydeo.page.WebTableLoginPage;
import com.cydeo.utility.ConfigurationReader;
import com.cydeo.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPlaceStepDef {
    OrderPlacePage orderPlacePage =new OrderPlacePage();
    WebTableLoginPage webTableLoginPage=new WebTableLoginPage();
    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        webTableLoginPage.login("Test","Tester");
        orderPlacePage.order.click();
    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String stringProduct) {
        Select select =new Select(orderPlacePage.product);
        select.selectByVisibleText(stringProduct);
    }
    @When("user enters quantity {string}")
    public void user_enters_quantity(String stringQuantity) {
        orderPlacePage.quantity.sendKeys(stringQuantity);
    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String stringCustomerName) {
        orderPlacePage.customerName.sendKeys(stringCustomerName);

    }
    @When("user enters street {string}")
    public void user_enters_street(String string) {
       orderPlacePage.street.sendKeys(string);
    }
    @When("user enters city {string}")
    public void user_enters_city(String string) {
        orderPlacePage.city.sendKeys(string);
    }
    @When("user enters state {string}")
    public void user_enters_state(String string) {
        orderPlacePage.state.sendKeys(string);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
       orderPlacePage.zip.sendKeys(string);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String string) {
         orderPlacePage.selectCard(string);
            
    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
        orderPlacePage.cardNumber.sendKeys(string);
    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
        orderPlacePage.expireDate.sendKeys(string);
    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
        orderPlacePage.processButton.click();
    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String string) {
        String actualCustomerName = orderPlacePage.actualName.getText();

        Assert.assertEquals(string,actualCustomerName);
    }












}
