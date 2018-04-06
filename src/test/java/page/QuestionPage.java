package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Wale on 06/04/2018.
 */
public class QuestionPage extends Utility {

    public QuestionPage (WebDriver driver) {
        super(driver);
    }

    private static final By NO_NONE_OF_THESE_RADIO_BTN = By.cssSelector("#answer-109636") ;
    private static final By CONTINUE_BTN_QUESTION_PAGE = By.cssSelector("button.btn.btn-primary.pull-right.screening-summary-continue") ;



    public void clickNoNonOfThese () {
        click(NO_NONE_OF_THESE_RADIO_BTN);
    }

    public void clickContinueBtn () {
        sleep(2);
        clickFromList(CONTINUE_BTN_QUESTION_PAGE,0);
    }
}
