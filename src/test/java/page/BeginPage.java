package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Wale on 05/04/2018.
 */
public class BeginPage extends Utility {

    public BeginPage (WebDriver driver) {
        super(driver);
    }

    private static final By POLICY_REFERENCE_FIELD = By.cssSelector("input[id='policyReferenceNum']") ;

    public void enterPolicyReferenceNumber () {
        enterText(POLICY_REFERENCE_FIELD, getProperty("policy.reference"));
    }
}
