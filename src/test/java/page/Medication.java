package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Wale on 06/04/2018.
 */
public class Medication extends Utility {

    public Medication (WebDriver driver) {
        super(driver);
    }

    private static final By MEDICATION = By.cssSelector("#medication") ;
    private static final By CONDITION = By.cssSelector("#condition") ;
    private static final By POP_UP_MEDICATION_BUTTON = By.cssSelector("button.btn.btn-primary.ng-binding") ;



    public void enterMedication () {
        enterText(MEDICATION, getProperty("medication"));

    }

    public void enterCondition () {
        enterText(CONDITION, getProperty("condition"));

    }

    public void clickYesAllHaveBeenAdded () {
        sleep(2);
        clickFromList(POP_UP_MEDICATION_BUTTON, 1);
    }
}
