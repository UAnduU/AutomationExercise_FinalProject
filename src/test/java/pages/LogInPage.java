package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage{
    public LogInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "email")
    private WebElement signInEmail;

    @FindBy(name = "password")
    private WebElement passwordElement;

    @FindBy(xpath = "//button[text()='Login']")
    private WebElement logInButton;

    @FindBy(xpath = "//a[@href='/logout']" )
    private WebElement logOutButton;

    public void fillSignInForm(String email,String password){
        elementHelper.fillElement(signInEmail, email);
        LoggerUtility.infoLog("The user fills the Name field");
        elementHelper.fillElement(passwordElement, password);
        LoggerUtility.infoLog("The user fills the Password field");
    }

    public void clickLogInButton(){
        elementHelper.clickElement(logInButton);
        LoggerUtility.infoLog("The user clicks the Login button");
    }

    public void clickLogOutButton()
    {
        elementHelper.clickJSElement(logOutButton);
        LoggerUtility.infoLog("The user clicks on the LogOut button");
    }
}
