package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class LoginPage extends PageObject {

    @FindBy(id = "login-username")
    WebElement txtUserName;

    @FindBy(id = "login-passwd")
    WebElement txtPassword;

    @FindBy(id = "login-signin")
    WebElement btnSignIn;

    public void waitForPageLoad(){
        waitForElement(txtUserName);
    }

    public void signIn(String userName, String password) {
       this.txtUserName.sendKeys(userName);
       this.btnSignIn.click();
       this.txtPassword.sendKeys(password);
       this.btnSignIn.click();
    }
}
