package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
    WebDriver driver;
    Select select;
    public PageBase(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public  void clickButton(WebElement button){
        button.click();
    }
    public  void setTextElmentText(WebElement textElment , String value){
        textElment.sendKeys(value);

    }

    public  void select( WebElement element , String name){
         select = new Select(element);
         select.selectByVisibleText(name);
    }
}
