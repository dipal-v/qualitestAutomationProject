package pageObjects;

import org.openqa.selenium.By;

public class LoginPage {

    public By validateLoginPage = By.xpath("//div[@class='panel-heading go-text-right']");
    public By emailTextField = By.cssSelector("div.col-md-4.col-md-offset-4.col-sm-6.col-sm-offset-3 div.panel.panel-default:nth-child(2) div.wow.fadeIn.animated:nth-child(5) div.panel-body div.form-group:nth-child(1) > input.form-control.padding-10");
                    //By.xpath("//div[@class='panel-body']//div[1]");
    public By passwordTextField = By.cssSelector("div.col-md-4.col-md-offset-4.col-sm-6.col-sm-offset-3 div.panel.panel-default:nth-child(2) div.wow.fadeIn.animated:nth-child(5) div.panel-body div.form-group:nth-child(2) > input.form-control.padding-10");
                            //By.xpath("//input[@placeholder='Password']");
    public By loginButton = By.cssSelector("div:nth-child(6) div:nth-child(2) div.col-md-4.col-md-offset-4.col-sm-6.col-sm-offset-3 form:nth-child(1) > button.btn.btn-action.btn-lg.btn-block.loginbtn:nth-child(3)");
                                    //By.xpath("//button[@class='btn btn-action btn-lg btn-block loginbtn']");

}
