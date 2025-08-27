package tests;

import org.testng.annotations.Test;
import pages.ContactPage;
import pages.MainPage;
import sharedData.SharedData;

import java.net.MalformedURLException;

public class ContactTEST extends SharedData {

    @Test

    public void testMethod() throws MalformedURLException {

        String nameValue="John Doe";
        String emailValue="john.doe2@email.com";
        String subjectValue="TEST Subject";
        String messageValue="This is a test message.";
        String uploadValue="https://github.com/UAnduU/AutomationExercise_FinalProject/blob/30e1c2711a479efef4f3245c34480811c77ce5cb/src/test/resources/TEST.png";

        MainPage mainPage=new MainPage(getDriver());
        mainPage.clickConsentButton();
        mainPage.interactWithContactButton();

        ContactPage contactPage=new ContactPage(getDriver());
        contactPage.fillContactForm(nameValue, emailValue, subjectValue, messageValue, uploadValue);

    }

}
