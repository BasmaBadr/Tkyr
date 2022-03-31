package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase  {
    public static WebDriver driver;
    @BeforeSuite
    public void startDriver(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
        driver.navigate().to("https://twitter.com");

    }
    @AfterMethod
    public void takeScreenShot(ITestResult result) throws IOException {
      // if (ITestResult.SUCCESS== result.getStatus()){

            TakesScreenshot ts  = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source,new File("./Screenshots/" + result.getName() + ".png"));
      //  }

    }


    @AfterSuite
    public void closeDriver(){
        driver.quit();

    }
}
