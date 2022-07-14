package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        super(driver);

    }

    By homePageTitleBy = By.xpath("//*[@id='header_container']/div[2]/span");
    
    public HomePage verifySuccesfulLogin(String expectedText){
        String actualText= readText(homePageTitleBy);
        assertTextEquals(expectedText, actualText);
        return this;
    }
}
