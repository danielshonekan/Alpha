package page;

import config.PropertyReader;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public abstract class Utility {

    private static final CharSequence URL = null;

    WebDriver driver ;

    public Utility(WebDriver driver) {
        this.driver = driver ;
    }

    public void click(By element){
        waitUntilElementIsVisible(element);
        new WebDriverWait(driver, 30).until(
                ExpectedConditions.elementToBeClickable(element));

        driver.findElement(element).click();
    }


    public void clickFromList (By element, int increment)  {
        List<WebElement> menuOption = driver.findElements(element);
        waitUntilElementIsVisible(element);
        WaitAndClickElement(menuOption.get(increment));
    }


    public void WaitAndClickElement ( WebElement element) {
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public String getProperty(String username)  {
        String data = new PropertyReader().readProperty(username) ;
        return data ;
    }


    public void waitUntilElementIsVisible (By element) {
        new WebDriverWait(driver, 30).until
                (ExpectedConditions.presenceOfAllElementsLocatedBy(element)) ;
    }

    public void enterText(By element, String text){
        new WebDriverWait(driver, 20).until(
                ExpectedConditions.elementToBeClickable(element));
        clear(element);
        driver.findElement(element).sendKeys(text);
    }

    public void clear(By element){
        driver.findElement(element).clear();
    }

    public void sleep(int i){
        try {
            Thread.sleep(i*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void waitUntilElementIsNotPresent (By element, int maxSeconds) {
        Long startTime = System.currentTimeMillis();
        try {
            while (System.currentTimeMillis() - startTime < maxSeconds * 1000 && driver.findElement(element).isDisplayed()) {}
        } catch (NoSuchElementException e) {
            return;
        } catch (StaleElementReferenceException e) {
            return;
        }
    }


    public void enterTextFromList (By element, int increment, String text){
        WebElement myelement = driver.findElements(element).get(increment) ;
        new WebDriverWait(driver, 20).until(
                ExpectedConditions.elementToBeClickable(myelement));
        myelement.clear();
        myelement.sendKeys(text);

    }

    public void mouseHover (By element) {
        Actions actions = new Actions(driver) ;
        WebElement webElement = driver.findElement(element) ;
        actions.moveToElement(webElement).build().perform();

    }


}
