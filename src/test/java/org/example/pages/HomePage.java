package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class HomePage extends PageObject {

    @Value("${aut.url}")
    private String url;

    @FindBy(partialLinkText = "Sign in")
    WebElement lnkSignIn;


    public void openURL() {
        driver.get(url);
    }

    public void waitForPageLoad(){
        waitForElement(lnkSignIn);
    }

    public void clickSignin() {
       waitForPageLoad();
       lnkSignIn.click();
    }

}
