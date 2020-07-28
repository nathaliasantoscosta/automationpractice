package ecommercePages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePo {

    private WebDriver driver;

    public HomePo(WebDriver driver){
        this.driver = driver;
    }

    public HomePo fillBuscar(){
        driver.findElement(searchButton).sendKeys("Blouse", Keys.ENTER);
        return this;
    }

    public HomePo clickItem(){
        driver.findElement(item).click();
        return this;
    }

    public HomePo clickAddItem(){
        driver.findElement(addItemButton).click();
        return this;
    }

    public HomePo clickAddCarrinho(){
        driver.findElement(addCarButton).click();
        return this;
    }

    public HomePo clickCollorWhite(){
        driver.findElement(collorWhiteButton).click();
        return this;
    }

    public HomePo clickTamanho(){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"attributes\"]/fieldset[1]/div"));
        Select combo = new Select(element);
        combo.selectByVisibleText("M");
        return this;
    }

    private By searchButton  = By.id("search_query_top");

    private By item = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img");

    private By addItemButton = By.id("add_to_cart");

    private By addCarButton = By.xpath("//span[contains(text(),'Proceed to checkout')]");

    private By collorWhiteButton = By.id("color_8");

    private By tamanhoList = By.id("group_1");
}
