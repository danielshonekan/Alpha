package TestCases;

import config.DriverFactory;
import org.testng.annotations.Test;
import page.*;

/**
 * Created by Wale on 05/04/2018.
 */
public class AlphaTest extends DriverFactory {

    private NavigationPanel navigationPanel ;
    private BeginPage beginPage ;
    private DetailsPage detailsPage ;
    private HomePage homePage ;
    private TravellerPage travellerPage ;
    private Medication medication ;
    private QuestionPage questionPage ;
    private ContactDetailsPage contactDetailsPage ;


    @Test(priority = 0)
    public void navigateToHomePage () {
        navigationPanel = new NavigationPanel(driver) ;
        beginPage = new BeginPage(driver) ;
        detailsPage = new DetailsPage(driver) ;
        homePage = new HomePage(driver) ;
        travellerPage = new TravellerPage(driver) ;
        medication = new Medication(driver) ;
        questionPage = new QuestionPage(driver) ;
        contactDetailsPage = new ContactDetailsPage(driver) ;


        homePage.goToHomePage();
        navigationPanel.clickNextButton();
        navigationPanel.clickNextButton();

    }

    @Test (priority = 1)
    public void enterPolicyReferenceNumber () {
        beginPage.enterPolicyReferenceNumber();
        navigationPanel.clickNextButton();
    }

    @Test(priority = 2)
    public void enterTravelInsuranceDetails () {
        detailsPage.whatCountryAreYouResidentFrom();
        // detailsPage.countryTravellingTo();
        detailsPage.selectPolicyType();
        detailsPage.selectDepartureDate();
        detailsPage.countryTravellingTo();
        detailsPage.enterReturnDate();
        detailsPage.selectLevelOfPolicyCover();
        navigationPanel.clickNextButton();
    }


    @Test(priority = 3)
    public void enterTravellerDetails () {
        travellerPage.clickAddTravellerButton();
        travellerPage.enterTravellerDetails();
        navigationPanel.clickContinueButton();

    }


    @Test(priority = 4)
    public void enterMedicationAndCondition () {
        medication.enterMedication();
        navigationPanel.clickContinueButton();
       // navigationPanel.clickNextButton();
        medication.enterCondition();
        navigationPanel.clickContinueButton();
        navigationPanel.clickStartMedicalDeclaration();
        medication.clickYesAllHaveBeenAdded();

    }

    @Test(priority = 5)
    public void answerMedicalDeclaration () {
        questionPage.clickNoNonOfThese();
        questionPage.clickContinueBtn();
        navigationPanel.continueToMedicalSummary();
       // navigationPanel.clickContinueButton();
        navigationPanel.clickContinueButton();
    }


    @Test(priority = 6)
    public void enterContactDetails () {
        contactDetailsPage.enterContactDetails();
    }

}
