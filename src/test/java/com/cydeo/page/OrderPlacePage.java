package com.cydeo.page;

import com.cydeo.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPlacePage {
    public OrderPlacePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//select[@name='product']")
    public WebElement product;
   @FindBy(xpath = "//*[@id=\"root\"]/section/div/form/div/div[1]/div[1]/div[2]/div/input")
    public WebElement quantity;
    @FindBy(xpath = "//*[@id=\"root\"]/section/div/form/div/div[1]/div[2]/div[1]/div/input")
    public WebElement customerName;
    @FindBy(xpath = "//*[@id=\"root\"]/section/div/form/div/div[1]/div[2]/div[2]/div/input")
    public WebElement street;
    @FindBy(xpath = "//*[@id=\"root\"]/section/div/form/div/div[1]/div[2]/div[3]/div/input")
    public WebElement city;
    @FindBy(xpath = "//*[@id=\"root\"]/section/div/form/div/div[1]/div[2]/div[4]/div/input")
    public WebElement state;
    @FindBy (name = "zip")
    public WebElement zip;

    @FindBy (name = "cardNo")
    public WebElement cardNumber;
    @FindBy(xpath = "//*[@id=\"root\"]/section/div/form/div/div[1]/div[3]/div[3]/div/input")
    public WebElement expireDate;
    @FindBy(xpath = "//*[@id=\"root\"]/section/div/form/div/div[2]/button[1]")
    public WebElement processButton;
    @FindBy(xpath = "//*[@id=\"root\"]/nav/div[2]/a[3]/button")
    public WebElement order;
    @FindBy (xpath = "//tbody/tr/td")
    public WebElement  actualName;

    public void selectCard(String cardType){
        String locater= "//label[.='"+cardType+"']";
        Driver.getDriver().findElement(By.xpath(locater)).click();


    }


}
