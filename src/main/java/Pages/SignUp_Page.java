package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUp_Page extends PageBase{
    public SignUp_Page(WebDriver driver) {
        super(driver);
    }
   @FindBy(xpath = "//span[contains(text(),'Sign up with phone or email')]")
    WebElement signUpbutton ;
    @FindBy(xpath = "//input[@name='name']")
    WebElement nameText ;
    @FindBy(xpath = "//input[@name='phone_number']")
    WebElement phoneNumberText ;
//    @FindBy(xpath = "//span[contains(text(),'Sign up with phone or email')]")
//    WebElement signUpbutton ;
    @FindBy(id = "SELECTOR_1")
    WebElement month ;
    @FindBy(id = "SELECTOR_2")
    WebElement day ;
    @FindBy(id = "SELECTOR_3")
    WebElement year ;


    public void clickSignUp(){
        clickButton(signUpbutton);
    }
    public void selectMonth(){
        Select options = new Select(month);
        options.selectByVisibleText("May");
    }
    public void selectDay(){
        Select options = new Select(day);
        options.selectByVisibleText("27");
    }
    public void selectYear(){
        Select options = new Select(year);
        options.selectByVisibleText("1991");
    }
}
