package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.*;
import java.net.*;
import java.nio.file.*;

import java.io.File;

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

    @FindBy(name = "upload_file")
    private WebElement contactUploadFile;

    @FindBy(name = "submit")
    private WebElement submitButton;

    @FindBy(xpath = "//a[@class='btn btn-success' and @href='/']")
    private WebElement okButton;

    public void fillContactForm(String name, String email, String subject, String message, String uploadValue) throws MalformedURLException {

    elementHelper.fillElement(contactName, name);
    LoggerUtility.infoLog("The user fills the Name field");
    elementHelper.fillElement(contactEmail, email);
    LoggerUtility.infoLog("The user fills the Email field");
    elementHelper.fillElement(contactSubject, subject);
    LoggerUtility.infoLog("The user fills the Subject field");
    elementHelper.fillElement(contactMessage, message);
    LoggerUtility.infoLog("The user fills the Message field");
        String fileURL = "https://github.com/UAnduU/AutomationExercise_FinalProject/blob/30e1c2711a479efef4f3245c34480811c77ce5cb/src/test/resources/TEST.png";
        String localFilePath = System.getProperty("java.io.tmpdir") + "TEST.png";
        try (InputStream in = new URL(fileURL).openStream()) {
            Files.copy(in, Paths.get(localFilePath), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File file = new File(localFilePath);
        elementHelper.fillElement(contactUploadFile, file.getPath());
        LoggerUtility.infoLog("The user uploads the file");
        elementHelper.clickElement(submitButton);
        LoggerUtility.infoLog("The user clicks the Submit button");
        Alert alert = driver.switchTo().alert();
        alert.accept();
        LoggerUtility.infoLog("The user accepts the alert");
    }

}
