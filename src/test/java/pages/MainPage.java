package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='/login']")
    private WebElement signUpLogInButton;

    @FindBy(xpath = "//p[text()='Consent']/ancestor::button")
    private WebElement consentButton;

    public void clickConsentButton(){
        elementHelper.clickElement(consentButton);
    }

    public void interactWithSignUpLogInButton(){
        elementHelper.clickElement(signUpLogInButton);
        LoggerUtility.infoLog("The user clicks on SignUp/Login button");
    }
}
