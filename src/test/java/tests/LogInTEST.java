package tests;

import org.testng.annotations.Test;
import pages.LogInPage;
import pages.MainPage;
import sharedData.SharedData;

public class LogInTEST extends SharedData {

    @Test

public void testMethod(){

    String emailValue="john.doe2@email.com";
    String passwordValue="password123!";

    MainPage mainPage=new MainPage(getDriver());
    mainPage.clickConsentButton();
    mainPage.interactWithSignUpLogInButton();

    LogInPage logInPage=new LogInPage(getDriver());
    logInPage.fillSignInForm(emailValue,passwordValue);
    logInPage.clickLogInButton();

}

}
