package page;

import config.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class HomePage extends Utility {

    public HomePage (WebDriver driver) {
        super(driver);
    }



    public void goToHomePage () {
        driver.navigate().to(getProperty("home.page.url"));
        driver.manage().window().maximize();
    }


}
