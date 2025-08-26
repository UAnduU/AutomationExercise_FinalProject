package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BasePage{
    public ContactPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "name")
    private WebElement contactName;

    @FindBy(name = "email")
    private WebElement contactEmail;

    @FindBy(name = "subject")
    private WebElement contactSubject;

    @FindBy(id = "message")
    private WebElement contactMessage;

    public void fillContactForm(String name, String email, String subject, String message){

    elementHelper.fillElement(contactName, name);
    LoggerUtility.infoLog("The user fills the Name field");
    elementHelper.fillElement(contactEmail, email);
    LoggerUtility.infoLog("The user fills the Email field");
    elementHelper.fillElement(contactSubject, subject);
    LoggerUtility.infoLog("The user fills the Subject field");
    elementHelper.fillElement(contactMessage, message);
    LoggerUtility.infoLog("The user fills the Message field");

    }

}
