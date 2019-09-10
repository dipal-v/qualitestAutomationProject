package reusableMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

public class DriverManager {

    int selectDriver = 1;

    /* 1 = Chrome*/


    public WebDriver getDriver() {
        WebDriver currentDriver = null;
        switch (selectDriver) {
            case 1:
                System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\browsers\\chromedriver.exe");
                Map<String, Object> prefs = new HashMap<String, Object>();
                prefs.put("profile.default_content_setting_values.notifications", 2);
                ChromeOptions options = new ChromeOptions();
                options.setExperimentalOption("prefs", prefs);
                return new ChromeDriver(options);
        }
        return currentDriver;
    }
}