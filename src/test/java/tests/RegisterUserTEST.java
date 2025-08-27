package tests;

import org.testng.annotations.Test;
import pages.MainPage;
import pages.SignUpPage;
import sharedData.SharedData;

public class RegisterUserTEST extends SharedData {

    @Test
    public void thestMethod(){
        String name="John";
        String email="john.doe5@email.com";
        String titleValue="Mr";
        String passwordValue="password123!";
        String daysValue="5";
        String monthsValue="Jul";
        String yearsValue="1998";
        String firstNameValue="John";
        String lastNameValue="Doe";
        String companyValue="EC";
        String addressValue="Str. TestStr, No.259, Building 5";
        String address2Value="Floor. 10, Room 5";
        String countryValue="Un";
        String stateValue="Un";
        String cityValue="Boston";
        String zipcodeValue="100203";
        String mobileValue="+3049518285";

        MainPage mainPage=new MainPage(getDriver());
        mainPage.clickConsentButton();
        mainPage.interactWithSignUpLogInButton();

        SignUpPage signUpPage=new SignUpPage(getDriver());
        signUpPage.fillSignUPForm(name,email);
        signUpPage.clickSignUpButton();
        signUpPage.fillAccountInformation(titleValue,passwordValue,daysValue,monthsValue,yearsValue,firstNameValue,
                lastNameValue,companyValue,addressValue,address2Value,countryValue,stateValue,cityValue,zipcodeValue,mobileValue);
    }

}
