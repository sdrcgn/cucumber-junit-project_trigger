package com.cydeo.step_definitions;

import com.cydeo.page.EtsySearchPage;
import com.cydeo.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsyStepDef {

    EtsySearchPage etsySearchPage=new EtsySearchPage();


    @Given("user is on homepage")
    public void user_is_on_homepage() {
        Driver.getDriver().get("https://www.etsy.com");
    }
    @Then("user sees title is as expected")
    public void user_sees_title_is_as_expected() {
       String actualTitle= Driver.getDriver().getTitle();
       String expectedTitle= "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
    }
    @Given("user types Wooden Spoon in the search box")
    public void user_types_Wooden_Spoon_in_the_search_box() {
       etsySearchPage.searchBox.sendKeys("Wooden Spoon");
    }
    @When("user clicks search button")
    public void user_clicks_search_button() {
     etsySearchPage.searchBox.click();
    }
    @Then("user sees Wooden Spoon is in the title")
    public void user_sees_Wooden_Spoon_is_in_the_title() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Wooden Spoon"));
    }
    @Given("user types {string} in the search box")
    public void user_types_in_the_search_box(String searchKeyword) {
        etsySearchPage.searchBox.sendKeys(searchKeyword);

    }
    @Then("user sees {string} is in the title")
    public void user_sees_is_in_the_title(String expectedTitle) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));

    }
}
