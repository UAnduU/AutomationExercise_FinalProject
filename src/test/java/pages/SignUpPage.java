package pages;

import helpermethods.PageHelper;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SignUpPage extends BasePage{

    public SignUpPage(WebDriver driver){
        super(driver);
    }

    @FindBy(name = "name")
    private WebElement signUpName;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    private WebElement signUpEmail;

    @FindBy(xpath = "//button[text()='Signup']")
    private WebElement signUpButton;

    @FindBy(xpath = "//input[@name='title' and @type='radio']")
    private List<WebElement> titleRadioButtonList;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "days")
    private WebElement days;

    @FindBy(id = "months")
    private WebElement months;

    @FindBy(id = "years")
    private WebElement years;

    @FindBy(id = "newsletter")
    private WebElement newsletterCheckbox;

    @FindBy(id = "optin")
    private WebElement specialOffersCheckbox;

    @FindBy(id = "first_name")
    private WebElement firstNameElement;

    @FindBy(id = "last_name")
    private WebElement lastNameElement;

    @FindBy(id = "company")
    private WebElement companyElement;

    @FindBy(id = "address1")
    private WebElement address1Element;

    @FindBy(id = "address2")
    private WebElement address2Element;

    @FindBy(id = "country")
    private WebElement countryElement;

    @FindBy(id = "state")
    private WebElement stateElement;

    @FindBy(id = "city")
    private WebElement cityElement;

    @FindBy(id = "zipcode")
    private WebElement zipcodeElement;

    @FindBy(id = "mobile_number")
    private WebElement mobileNumberElement;

    @FindBy(xpath = "//button[text()='Create Account']")
    private WebElement createAccountElement;

    public void fillSignUPForm(String name,String email){
        elementHelper.fillElement(signUpName, name);
        LoggerUtility.infoLog("The user fills the Name field");
        elementHelper.fillElement(signUpEmail, email);
        LoggerUtility.infoLog("The user fills the Email field");
    }

    public void clickSignUpButton(){
        elementHelper.clickElement(signUpButton);
        LoggerUtility.infoLog("The user clicks the Signup button");
    }

    public void fillAccountInformation(String titleValue, String passwordValue, String daysValue, String monthsValue, String yearsValue, String firstNameValue,
                                       String lastNameValue, String companyValue, String address1Value, String address2Value, String countryValue, String stateValue, String cityValue, String zipcodeValue, String mobileValue){
        switch (titleValue){
            case "Mr":
                elementHelper.clickElement(titleRadioButtonList.get(0));
                break;
            case "Mrs":
                elementHelper.clearElement(titleRadioButtonList.get(1));
                break;
        }
        LoggerUtility.infoLog("The user selects the title");
        elementHelper.fillElement(password, passwordValue);
        LoggerUtility.infoLog("The user fills the Password field");
        elementHelper.clickElement(days);
        LoggerUtility.infoLog("The user clicks on the Days dropdown");
        elementHelper.fillPressElement(days,daysValue, Keys.ENTER);
        LoggerUtility.infoLog("The user enters the Days value");
        elementHelper.clickElement(months);
        LoggerUtility.infoLog("The user clicks on the Months dropdown");
        elementHelper.fillPressElement(months,monthsValue, Keys.ENTER);
        LoggerUtility.infoLog("The user enters the Months value");
        elementHelper.clickElement(years);
        LoggerUtility.infoLog("The user clicks on the Years dropdown");
        elementHelper.fillPressElement(years,yearsValue, Keys.ENTER);
        LoggerUtility.infoLog("The user enters the Years value");
        elementHelper.clickElement(newsletterCheckbox);
        LoggerUtility.infoLog("The user checks the newsletter checkbox");
        elementHelper.clickElement(specialOffersCheckbox);
        LoggerUtility.infoLog("The user checks the special offers checkbox");
        elementHelper.fillElement(firstNameElement,firstNameValue);
        LoggerUtility.infoLog("The user fills the First Name field");
        elementHelper.fillElement(lastNameElement,lastNameValue);
        LoggerUtility.infoLog("The user fills the Last Name field");
        elementHelper.fillElement(companyElement,companyValue);
        LoggerUtility.infoLog("The user fills the Company field");
        elementHelper.fillElement(address1Element,address1Value);
        LoggerUtility.infoLog("The user fills the Address field");
        elementHelper.fillElement(address2Element,address2Value);
        LoggerUtility.infoLog("The user fills the Address 2 field");
        elementHelper.clickElement(countryElement);
        LoggerUtility.infoLog("The user clicks on the Country dropdown");
        elementHelper.fillPressElement(countryElement,countryValue, Keys.ENTER);
        LoggerUtility.infoLog("The user enters the Country value");
        pageHelper.scrollPage(0,400);
        elementHelper.fillElement(stateElement,stateValue);
        LoggerUtility.infoLog("The user fills the State field");
        elementHelper.fillElement(cityElement,cityValue);
        LoggerUtility.infoLog("The user fills the City field");
        elementHelper.fillElement(zipcodeElement,zipcodeValue);
        LoggerUtility.infoLog("The user fills the Zipcode  field");
        elementHelper.fillElement(mobileNumberElement,mobileValue);
        LoggerUtility.infoLog("The user fills the Mobile Number field");
        elementHelper.clickElement(createAccountElement);
        LoggerUtility.infoLog("The user clicks the Create Account button");
    }
}
