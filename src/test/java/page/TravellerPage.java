package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Wale on 05/04/2018.
 */
public class TravellerPage extends Utility {

    public TravellerPage(WebDriver driver) {
        super(driver);

    }

    private static final By ADD_TRAVELLER_BUTTON = By.cssSelector("#add-traveller-button") ;
    private static final By FIRSTNAME = By.cssSelector("#firstname") ;
    private static final By LAST_NAME = By.cssSelector("#lastname") ;
    private static final By HEIGHT = By.cssSelector("#height") ;
    private static final By WEIGHT = By.cssSelector("#weight") ;

    private static final By TITLE_LINK = By.cssSelector("select[id='title']") ;
    private static final By TILTE = By.xpath("//select[@id='title']/option[2]") ;

    private static final By DAY_DROPDOWN = By.cssSelector("#dropdownDay") ;
    private static final By DAY  = By.xpath("//select[@id='dropdownDay']/option[2]") ;

    private static final By MONTH_DROPDOWN = By.cssSelector("#dropdownMonth") ;
    private static final By MONTH = By.xpath("//select[@id='dropdownMonth']/option[2]") ;

    private static final By YEAR_DROPDOWN = By.cssSelector("#dropdownYear") ;
    private static final By YEAR = By.xpath("//select[@id='dropdownYear']/option[2]") ;


    public void clickAddTravellerButton () {
        click(ADD_TRAVELLER_BUTTON);
    }

    public void enterTravellerDetails () {
        enterText(FIRSTNAME, getProperty("firstname"));
        enterText(LAST_NAME, getProperty("surname"));
        click(TITLE_LINK);
        click(TILTE);
        click(DAY_DROPDOWN);
        click(DAY);
        click(MONTH_DROPDOWN);
        click(MONTH);
        click(YEAR_DROPDOWN);
        click(YEAR);
        enterText(HEIGHT, getProperty("height"));
        enterText(WEIGHT, getProperty("weight"));

    }

;
}
