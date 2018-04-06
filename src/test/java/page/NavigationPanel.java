package page;

import config.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Wale on 05/04/2018.
 */
public class NavigationPanel extends Utility {

    public NavigationPanel (WebDriver driver) {
        super(driver) ;
    }

    private static final By NEXT_BUTTON = By.cssSelector("#next-button") ;
    private static final By CONTINUE_BUTTON = By.xpath("//div[@class='col-sm-10']//button") ;
    private static final By START_MEDICAl_DECLARATION_BTN = By.cssSelector("#screen-button") ;



    public void clickNextButton () {
        click(NEXT_BUTTON);
    }

    public void clickContinueButton () {
        if (driver.findElements(CONTINUE_BUTTON).size()>1) {
        clickFromList(CONTINUE_BUTTON, 1) ;

        }else {click(CONTINUE_BUTTON);}

    }

    public void clickStartMedicalDeclaration () {
        click(START_MEDICAl_DECLARATION_BTN);
    }

    public void continueToMedicalSummary () {
        clickFromList(CONTINUE_BUTTON, 3);
        sleep(2);
    }
}
