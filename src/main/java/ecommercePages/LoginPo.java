package ecommercePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPo {

    private WebDriver driver;

    public LoginPo(WebDriver driver){
        this.driver = driver;
    }

    public LoginPo clickLogin(){
        driver.findElement(loginButton).click();
        return this;
    }

    public LoginPo fillEmail(){
        driver.findElement(emailInput).sendKeys("hekafar210@mailop7.com");
        return this;
    }

    public LoginPo fillSenha(){
        driver.findElement(senhaInput).sendKeys("dbcimpact");
        return this;
    }

    public LoginPo clickSignIn(){
        driver.findElement(signButton).click();
        return this;
    }

    private By loginButton = By.className("login");

    private By emailInput = By.id("email");

    private By senhaInput = By.id("passwd");

    private By signButton = By.id("SubmitLogin");
}
