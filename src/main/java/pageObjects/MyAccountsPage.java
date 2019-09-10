package pageObjects;

import org.openqa.selenium.By;

public class MyAccountsPage {
    public By successfulRegisterMessage = By.xpath("//div[@id='body-section']//div//div[@class='container']");
    public By preferredLangPlace = By.cssSelector("nav.navbar.navbar-default:nth-child(5) div.container div.collapse.navbar-collapse ul.nav.navbar-nav.navbar-right.hidden-sm.go-left:nth-child(2) ul.nav.navbar-nav.navbar-side.navbar-right.sidebar.go-left.user_menu ul.nav.navbar-nav:nth-child(4) li.dropdown > ul.dropdown-menu.wow.fadeIn.animated");

    //Test Data
    public String prefferedLanguage[] = {"Russian", "Farsi", "German", "French", "Turkish", "Arabic", "Spanish"};
}
