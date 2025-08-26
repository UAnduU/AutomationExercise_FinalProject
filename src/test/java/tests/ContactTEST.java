package tests;

import org.testng.annotations.Test;
import pages.ContactPage;
import pages.MainPage;
import sharedData.SharedData;

public class ContactTEST extends SharedData {

    @Test

    public void testMethod(){

        String nameValue="John Doe";
        String emailValue="john.doe2@email.com";
        String subjectValue="TEST Subject";
        String messageValue="This is a test message.";
        String uploadValue="C:\\Users\\Andu\\IdeaProjects\\Automation_Project\\src\\test\\resources\\TEST.png";

        MainPage mainPage=new MainPage(getDriver());
        mainPage.clickConsentButton();
        mainPage.interactWithContactButton();

        ContactPage contactPage=new ContactPage(getDriver());
        contactPage.fillContactForm(nameValue, emailValue, subjectValue, messageValue, uploadValue);

    }

}
