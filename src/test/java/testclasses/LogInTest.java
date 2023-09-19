package testclasses;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CareerPage;
import pages.LogInPage;
import testbase.WebTestBase;

public class LogInTest extends WebTestBase {



    public LogInPage logInPage;

    public CareerPage careerPage;

     LogInTest(){
         super();
     }
     @BeforeMethod
     public void beforeMethod(){
         initialization();
       //  homePage = new HomePage();
         logInPage = new LogInPage();

         careerPage = new CareerPage();
     }
     @Test
    public void verifyLoginWithValidUsernameAndValidPassword() {
         //SoftAssert softAssert = new SoftAssert();
         //careerPage.clickOnLogin();
         logInPage.login(prop.getProperty("username"), prop.getProperty("password"));
      /*  softAssert.assertEquals(myCareerPage.getTextOfMyCareer(), "Welcome,", "Text must me match");
         softAssert.assertAll();

     }
        @AfterMethod
        public void teardown(){  */
         driver.close();
        }


}
