package pageObjects;

import org.openqa.selenium.By;

public class RegistrationPage {

     public String lowersideAlerts = "The Email field must contain a valid email address.\n" +
             "The Password field must be at least 6 characters in length.\n" +
             "Password not matching with confirm password.\n" +
             "The First name field is required.\n" +
             "The Last Name field is required.";

    //Locators
    public By validateSignupPage = By.xpath("//div[@class='go-text-right panel-heading']");
    public By firstNameTextBox = By.xpath("//input[@placeholder='First Name']");
    public By lastNameTextBox = By.xpath("//input[@placeholder='Last Name']");
    public By mobileNumberTextBox = By.xpath("//input[@placeholder='Mobile Number']");
    public By emailTextBox = By.xpath("//input[@placeholder='Email']");
    public By passwordTextBox = By.xpath("//input[@placeholder='Password']");
    public By confirmPasswordTextBox = By.xpath("//input[@placeholder='Confirm Password']");
    public By signupButton = By.xpath("//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']");
    public By resultAlert = By.xpath("//div[@class='resultsignup']");
    public By registPageLocator = By.tagName("body");





}
