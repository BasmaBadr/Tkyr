package Tests;

import Pages.SignUp_Page;
import org.testng.annotations.Test;

public class SignUp_Test extends TestBase{

    SignUp_Page signUp;

    @Test
    public void signUp(){
        signUp=new SignUp_Page(driver);
        signUp.clickSignUp();
        signUp.addNameandPhone("Basma","01090000000");
        signUp.selectMonth();
        signUp.selectDay();
        signUp.selectYear();
        signUp.clickNext();
    }
}
