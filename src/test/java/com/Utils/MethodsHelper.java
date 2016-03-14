package com.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import com.Model.Configuration;

public class MethodsHelper {

    private Configuration configParams = new Configuration();

    public void loginToCMS(WebDriver driver) throws Exception {
        // Complete username field.
        Actions builder = new Actions(driver);
        WebElement usernameField = driver.findElement(By.id(configParams.getUsernameField()));
        Actions enterUsername = builder.moveToElement(usernameField).click().sendKeys(usernameField, configParams.getUsername());
        enterUsername.perform();

        // Complete password field.
        WebElement passwordField = driver.findElement(By.id(configParams.getPasswordField()));
        Actions enterPassword = builder.moveToElement(passwordField).click().sendKeys(passwordField, configParams.getPassword());
        enterPassword.perform();

        // Press login button.
        WebElement loginButton = driver.findElement(By.id(configParams.getLoginButton()));
        Actions clickLoginButton = builder.moveToElement(loginButton).click();
        clickLoginButton.perform();
        Thread.sleep(2000);
    }
}
