package com.cydeo.page;

import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {
    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary login__submit']")
    public WebElement clickEnter;

    public void login(String username , String password2){
        userName.sendKeys(username);
         password.sendKeys(password2);
         clickEnter.click();
    }

}
