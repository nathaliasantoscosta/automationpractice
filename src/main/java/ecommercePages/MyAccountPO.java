package ecommercePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPO {

    private WebDriver driver;

    public MyAccountPO(WebDriver driver){
        this.driver = driver;
    }

    public MyAccountPO clickOrder(){
        driver.findElement(orderButton).click();
        return this;
    }

    public MyAccountPO clickReorderButton(){
        driver.findElement(reorderButton).click();
        return this;
    }

    private By orderButton = By.className("icon-list-ol");

    private By reorderButton = By.cssSelector("a[title=\"Reorder\"]");
}
