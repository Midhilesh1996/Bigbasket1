package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage1;
import testbase.WebTestBase;

public class HomeTest1 extends WebTestBase {
    public HomePage1 homePage1;

    HomeTest1(){
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialization();


        homePage1 = new HomePage1();
    }
    @Test(description = "verify dropdown")
    public void verifyDropDown() {
        homePage1.clickOnCategory();
        homePage1.clickOnFruits();

    }
    @Test(description = "verify sendKeys")
    public void verifySendKeys(){

        homePage1.sendKeysForSearch(prop.getProperty("keyword"));
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
