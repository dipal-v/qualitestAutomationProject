package Tests;

import com.thedeanda.lorem.LoremIpsum;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountsPage;
import pageObjects.RegistrationPage;
import reusableMethods.Utils;
import org.apache.commons.lang3.RandomStringUtils;

public class BehaviourTests {

    LoremIpsum lorem = new LoremIpsum();

    String baseUrl = "https://www.phptravels.net";
    String userName = "dipal_vyas@somedomain.com";
    String paswrd = "dipal@vyas1";

    Utils utils = new Utils();
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    MyAccountsPage myAccountsPage = new MyAccountsPage();
    LoginPage loginPage = new LoginPage();

    @BeforeMethod
    public void getHomePage()
    {
        utils.getWebPage(baseUrl);
    }

//    @AfterTest
//    public void closeDriver()
//    {
//      utils.closenquitDriver();
//    }

    @Test
    public void userShouldBeAbleToTrabverseToHomePage()
    {
         utils.clickOnAnElement(homePage.myAccount);
         utils.clickOnAnElement(homePage.signUpOption);
        Assert.assertEquals(utils.getWebElement(registrationPage.validateSignupPage).getText(), "SIGN UP");
    }

    @Test
    public void validateLowerSideSignupRules()
    {
        utils.clickOnAnElement(homePage.myAccount);
        utils.clickOnAnElement(homePage.signUpOption);
        Assert.assertEquals(utils.getWebElement(registrationPage.validateSignupPage).getText(), "SIGN UP");
        utils.typeInTextField(registrationPage.firstNameTextBox, lorem.getWords(0,1));
        utils.typeInTextField(registrationPage.mobileNumberTextBox, RandomStringUtils.randomAlphanumeric(0,9));
        utils.typeInTextField(registrationPage.emailTextBox, RandomStringUtils.randomAlphanumeric(0,10));
        utils.typeInTextField(registrationPage.passwordTextBox, RandomStringUtils.randomAlphanumeric(0,5));
        utils.typeInTextField(registrationPage.confirmPasswordTextBox, RandomStringUtils.randomAlphanumeric(0,5));
        utils.clickOnAnElement(registrationPage.signupButton);
        utils.waitForSomeTime(10).until(ExpectedConditions.visibilityOf(utils.getWebElement(registrationPage.resultAlert)));
        Assert.assertTrue(utils.getWebElement(registrationPage.registPageLocator).getText().contains(utils.getWebElement(registrationPage.resultAlert).getText()));
    }

    @Test
    public void validateHigherSideSignupRules()
    {
        utils.clickOnAnElement(homePage.myAccount);
        utils.clickOnAnElement(homePage.signUpOption);
        Assert.assertEquals(utils.getWebElement(registrationPage.validateSignupPage).getText(), "SIGN UP");
        utils.typeInTextField(registrationPage.firstNameTextBox, lorem.getWords(16,20));
        utils.typeInTextField(registrationPage.mobileNumberTextBox, RandomStringUtils.randomAlphanumeric(11,20));
        utils.typeInTextField(registrationPage.emailTextBox, RandomStringUtils.randomAlphanumeric(0,10));
        utils.typeInTextField(registrationPage.passwordTextBox, RandomStringUtils.randomAlphanumeric(7,10));
        utils.typeInTextField(registrationPage.confirmPasswordTextBox, RandomStringUtils.randomAlphanumeric(7,10));
        utils.clickOnAnElement(registrationPage.signupButton);
        utils.waitForSomeTime(10).until(ExpectedConditions.visibilityOf(utils.getWebElement(registrationPage.resultAlert)));
        Assert.assertTrue(utils.getWebElement(registrationPage.registPageLocator).getText().contains(utils.getWebElement(registrationPage.resultAlert).getText()));
    }

    @Test
    public void validateuserCanRegister()
    {
        utils.clickOnAnElement(homePage.myAccount);
        utils.clickOnAnElement(homePage.signUpOption);
        Assert.assertEquals(utils.getWebElement(registrationPage.validateSignupPage).getText(), "SIGN UP");
        String firstName = lorem.getFirstName();
        utils.typeInTextField(registrationPage.firstNameTextBox, firstName);
        String lastName = lorem.getLastName();
        utils.typeInTextField(registrationPage.lastNameTextBox, lastName);
        utils.typeInTextField(registrationPage.mobileNumberTextBox, RandomStringUtils.randomNumeric(10));
        String email = lorem.getEmail();
        System.out.println(email);
        utils.typeInTextField(registrationPage.emailTextBox, lorem.getEmail());
        String pwd = lorem.getFirstName() + "@" + lorem.getZipCode();
        System.out.println(pwd);
        utils.typeInTextField(registrationPage.passwordTextBox, pwd);
        utils.typeInTextField(registrationPage.confirmPasswordTextBox, pwd);
        utils.clickOnAnElement(registrationPage.signupButton);
       utils.waitForGivenSeconds(20);
        Assert.assertTrue((utils.getWebElement(myAccountsPage.successfulRegisterMessage).getText().contains(firstName + " " + lastName)));
    }

    @Test
    public void userShouldBeAbleToTrabverseToLoginPage()
    {
        utils.clickOnAnElement(homePage.myAccount);
        utils.clickOnAnElement(homePage.loginOption);
        Assert.assertEquals(utils.getWebElement(loginPage.validateLoginPage).getText(), "LOGIN");
    }

    @Test
    public void successfulLogin() throws Exception
    {
        {
            utils.clickOnAnElement(homePage.myAccount);
            utils.clickOnAnElement(homePage.loginOption);
            Assert.assertEquals(utils.getWebElement(loginPage.validateLoginPage).getText(), "LOGIN");
            utils.waitForSomeTime(10).until(ExpectedConditions.visibilityOf(utils.getWebElement(loginPage.loginButton)));
            utils.typeInTextField(loginPage.emailTextField, userName);
            utils.typeInTextField(loginPage.passwordTextField, paswrd);
            utils.scrollDown();
            utils.makeThreadSleep(2000);
            utils.clickOnAnElement(loginPage.loginButton);
            utils.waitForGivenSeconds(10);
            Assert.assertTrue(utils.getWebElement(myAccountsPage.successfulRegisterMessage).getText().contains("Dipal Vyas"));
        }
    }

    @Test
    public void validatePrefferredLangCurrency() throws Exception
    {
        {
            utils.clickOnAnElement(homePage.myAccount);
            utils.clickOnAnElement(homePage.loginOption);
            Assert.assertEquals(utils.getWebElement(loginPage.validateLoginPage).getText(), "LOGIN");
            utils.waitForSomeTime(10).until(ExpectedConditions.visibilityOf(utils.getWebElement(loginPage.loginButton)));
            utils.typeInTextField(loginPage.emailTextField, userName);
            utils.typeInTextField(loginPage.passwordTextField, paswrd);
            utils.scrollDown();
            utils.makeThreadSleep(2000);
            utils.clickOnAnElement(loginPage.loginButton);
            utils.waitForGivenSeconds(10);
            Assert.assertTrue(utils.getWebElement(myAccountsPage.successfulRegisterMessage).getText().contains("Dipal Vyas")); }
            String preferredLanguages = utils.getWebElement(myAccountsPage.preferredLangPlace).getText();

        System.out.println(preferredLanguages);  //delete **********************
            for (int i = 0; i <= myAccountsPage.prefferedLanguage.length; i++)
                 {
                    Assert.assertTrue(preferredLanguages.contains(myAccountsPage.prefferedLanguage[i]));
                  }
        }


        @Test
        public void searchFunctionality()
        {
            utils.writeInTextBox(homePage.searchTextBox, homePage.searchCity );
          utils.selectDateFromDatePicker(homePage.arriveDateLocator, homePage.arrivalDate());
          utils.selectDateFromDatePicker(homePage.returnDateLodator, homePage.returnDate());
          utils.clickOnAnElement(homePage.searchButton);
        }
    }
