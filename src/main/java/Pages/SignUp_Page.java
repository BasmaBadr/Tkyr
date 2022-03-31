package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

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
    @FindBy(xpath = "//div[@class='css-18t94o4 css-1dbjc4n r-sdzlij r-1phboty r-rs99b7 r-peo1c r-1ps3wis r-1ny4l3l r-1guathk r-o7ynqc r-6416eg r-lrvibr']")
    WebElement next1;
    @FindBy(xpath = "//div[@class='css-18t94o4 css-1dbjc4n r-sdzlij r-1phboty r-rs99b7 r-peo1c r-1ps3wis r-1ny4l3l r-1guathk r-o7ynqc r-6416eg r-lrvibr']")
    WebElement next2;


    @FindBy(id = "SELECTOR_1")
    WebElement month ;
    @FindBy(id = "SELECTOR_2")
    WebElement day ;
    @FindBy(id = "SELECTOR_3")
    WebElement year ;

    public void clickSignUp(){
        clickButton(signUpbutton);
    }

    public void addNameandPhone(String name,String phone){
        nameText.getText();
      setTextElmentText(nameText,name);

    setTextElmentText(phoneNumberText,phone);
    }

    public void selectMonth(){
        select(month , "May");
//        Select options = new Select(month);
//        options.selectByVisibleText("May");
    }
    public void selectDay(){
        select(day , "27");
//        Select options = new Select(day);
//        options.selectByVisibleText("27");
    }
    public void selectYear(){
        select(year , "1991");
//        Select options = new Select(year);
//        options.selectByVisibleText("1991");
    }
    public void clickNext(){

        clickButton(next1);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
        clickButton(next2);
    }
}
