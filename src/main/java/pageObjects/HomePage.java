package pageObjects;

import org.openqa.selenium.By;


public class HomePage   {
       //Locators
       public By myAccount = By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
       public By signUpOption = By.cssSelector("nav.navbar.navbar-default:nth-child(5) div.container div.collapse.navbar-collapse ul.nav.navbar-nav.navbar-right.hidden-sm.go-left:nth-child(2) ul.nav.navbar-nav.navbar-side.navbar-right.sidebar.go-left.user_menu li.open:nth-child(1) ul.dropdown-menu li:nth-child(2) > a.go-text-right");
       public By loginOption = By.cssSelector("nav.navbar.navbar-default:nth-child(5) div.container div.collapse.navbar-collapse ul.nav.navbar-nav.navbar-right.hidden-sm.go-left:nth-child(2) ul.nav.navbar-nav.navbar-side.navbar-right.sidebar.go-left.user_menu li.open:nth-child(1) ul.dropdown-menu li:nth-child(1) > a.go-text-right");

}
