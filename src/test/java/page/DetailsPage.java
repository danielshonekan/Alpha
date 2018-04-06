package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Wale on 05/04/2018.
 */
public class DetailsPage extends Utility {

    public DetailsPage (WebDriver driver) {
        super(driver);
    }

    private static final By COUNTRY_RESIDENT_DROP_DOWN = By.id("residentCountry") ;
    private static final By COUNTRY_LIST = By.xpath("//option[@label='United Kingdom']") ;

    private static final By COUNTRY_TRAVELLING_TO_DROP_DOWN = By.cssSelector("#destination") ;
    private static final By COUNTRY_TRAVELLING_TO_LIST = By.cssSelector("#destination>option") ;

    private static final By POLICY_TYPE_DROP_DOWN = By.cssSelector("#policyTypes") ;
    private static final By POLICY_TYPE_LIST = By.cssSelector("#policyTypes>option") ;

    private static final By DEPARTURE_DATE_FIELD = By.cssSelector("#departureDate") ;
    private static final By TODAY_BUTTON = By.cssSelector("button.btn.btn-sm.btn-info.ng-binding") ;

    private static final By RETURN_DATE = By.cssSelector("input[id='returnDate']") ;

    private static final By LEVEL_OF_COVER = By.cssSelector("#policy") ;
    private static final By COVER_TYPE = By.xpath("//*[@id='policy']/option[2]") ;



    public void whatCountryAreYouResidentFrom () {
        click(COUNTRY_RESIDENT_DROP_DOWN);
        sleep(3);
        clickFromList(COUNTRY_LIST, 0);
    }

    public void countryTravellingTo () {
         sleep(2);
        click(COUNTRY_TRAVELLING_TO_DROP_DOWN);
        clickFromList(COUNTRY_TRAVELLING_TO_LIST, 1);

    }

    public void selectPolicyType () {
        click(POLICY_TYPE_DROP_DOWN);
        clickFromList(POLICY_TYPE_LIST, 1);
    }

    public void selectDepartureDate () {
        click(DEPARTURE_DATE_FIELD);
        click(TODAY_BUTTON);
    }

    public void enterReturnDate () {
        enterText(RETURN_DATE, getProperty("return.date"));
    }

    public void selectLevelOfPolicyCover () {
        click(LEVEL_OF_COVER);
        click(COVER_TYPE);
        waitUntilElementIsNotPresent(COVER_TYPE, 5);

    }

}
