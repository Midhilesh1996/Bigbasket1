package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CareerPage;
import pages.HomePage1;
import testbase.WebTestBase;

import java.util.Calendar;

public class CareerTest extends WebTestBase {
    public CareerPage careerPage;

    CareerTest(){
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialization();


        careerPage = new CareerPage();
    }
    @Test(description = "verify failure test case")
    public void verifyCheckBox() {
        careerPage.clickOnCategory();
        careerPage.clickOnFruits();
        careerPage.clickOnRelevance();
        careerPage.clickOnLowToHigh();
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}




