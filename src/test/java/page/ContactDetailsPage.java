package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Wale on 06/04/2018.
 */
public class ContactDetailsPage extends Utility {

    public ContactDetailsPage(WebDriver driver) {
        super(driver);
    }

    private static final By EMAIL = By.cssSelector("input[name='email']");
    private static final By CONFIRM_EMAIL = By.cssSelector("input[name='confirmEmail']");
    private static final By POSTCODE = By.cssSelector("input[name='postcode']");

    private static final By CONTACT_DETAILS_FIELDS = By.cssSelector("input[class*='form-control']");




    public void enterContactDetails () {
        enterText(EMAIL, getProperty("email"));
        enterText(CONFIRM_EMAIL, getProperty("email"));
        enterText(POSTCODE, getProperty("postcode"));
        enterTextFromList(CONTACT_DETAILS_FIELDS,3, getProperty("address1") );
        enterTextFromList(CONTACT_DETAILS_FIELDS,4, getProperty("town") );
        enterTextFromList(CONTACT_DETAILS_FIELDS,5, getProperty("county") );
        enterTextFromList(CONTACT_DETAILS_FIELDS,6, getProperty("daytime.number") );
        enterTextFromList(CONTACT_DETAILS_FIELDS,7, getProperty("evening.number") );

    }


}
