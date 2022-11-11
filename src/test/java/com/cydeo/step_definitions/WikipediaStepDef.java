package com.cydeo.step_definitions;

import com.cydeo.page.WikipediaPage;
import com.cydeo.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class WikipediaStepDef {

    WikipediaPage wikipediaPage=new WikipediaPage();

    @Given("user is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }
    @Then("user types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
       wikipediaPage.searchBox.sendKeys("Steve Jobs");
    }
    @Then("user clicks wiki search button")
    public void user_clicks_wiki_search_button() {
    wikipediaPage.wikiButton.click();
    }
    @Then("user sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Steve Jobs"));
    }
    @Then("user types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String searchKey) {
        wikipediaPage.searchBox.sendKeys(searchKey);
    }
    @When("user sees {string} is in the main header")
    public void user_sees_is_in_the_main_header(String buttonKey) {
       Assert.assertTrue(Driver.getDriver().getTitle().contains(buttonKey));


    } }
