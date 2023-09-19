package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;

public class LogInPage extends WebTestBase {

    @FindBy(id = "username")
    WebElement usernameTextBox;

    @FindBy(id = "password")
    WebElement passwordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement signInBtn;

    public LogInPage (){
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password) {
        usernameTextBox.sendKeys(username);
        passwordTextBox.sendKeys(password);
        signInBtn.click();
    }

}
