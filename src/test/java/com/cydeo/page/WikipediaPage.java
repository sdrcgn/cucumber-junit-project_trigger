package com.cydeo.page;

import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaPage {
    public WikipediaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "searchInput")
    public WebElement searchBox;

    @FindBy(xpath = "//i[@class='sprite svg-search-icon']")
    public WebElement wikiButton;

    @FindBy(xpath = "//*[@id=\"firstHeading\"]/span")
    public WebElement mainHeader;
}
