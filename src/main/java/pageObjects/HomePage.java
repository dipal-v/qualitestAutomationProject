
package pageObjects;

import org.openqa.selenium.By;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class HomePage   {
       //Locators
       public By myAccount = By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
       public By signUpOption = By.cssSelector("nav.navbar.navbar-default:nth-child(5) div.container div.collapse.navbar-collapse ul.nav.navbar-nav.navbar-right.hidden-sm.go-left:nth-child(2) ul.nav.navbar-nav.navbar-side.navbar-right.sidebar.go-left.user_menu li.open:nth-child(1) ul.dropdown-menu li:nth-child(2) > a.go-text-right");
       public By loginOption = By.cssSelector("nav.navbar.navbar-default:nth-child(5) div.container div.collapse.navbar-collapse ul.nav.navbar-nav.navbar-right.hidden-sm.go-left:nth-child(2) ul.nav.navbar-nav.navbar-side.navbar-right.sidebar.go-left.user_menu li.open:nth-child(1) ul.dropdown-menu li:nth-child(1) > a.go-text-right");
       public By searchTextBox = By.xpath("//div[@id='select2-drop']//input[@class='select2-input']");
       public By arriveDateLocator = By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']");
       public By returnDateLodator = By.xpath("//input[@placeholder='Check out']");
       public By searchButton = By.xpath("//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']//i[@class='icon_set_1_icon-66']");


       public String searchCity = "London";

       public String arrivalDate()
       {
           String date = LocalDate.now().plusDays(2).format(DateTimeFormatter.ofPattern("dd-MMM-YYYY"));
           return date;
       }

       public String returnDate()
       {
              String date = LocalDate.now().plusDays(9).format(DateTimeFormatter.ofPattern("dd-MMM-YYYY"));
              return date;
       }

}
