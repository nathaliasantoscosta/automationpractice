package support;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;

    @Before
    public void setup(){
        driver = Browsers.chromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

//    @After
//    public void close(){
//        driver.quit();
//    }

}
