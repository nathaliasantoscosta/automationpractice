package ecommercePages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SacolaPo {

    private WebDriver driver;

    public SacolaPo(WebDriver driver){
        this.driver = driver;
    }

    public SacolaPo clickCheckout(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,400)");
        driver.findElement(checkoutButton).click();
        return this;
    }

    public SacolaPo fillMensagem(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("window.scrollBy(0,400)");
        driver.findElement(MensagemInput).sendKeys("Entrega na portaria");
        return this;
    }

    public SacolaPo clickProcessAddress(){
        driver.findElement(processAddressButton).click();
        return this;
    }

    public SacolaPo checkAgree(){
        driver.findElement(agreeCheck).click();
        return this;
    }

    public SacolaPo clickProcessShipping(){
        driver.findElement(processShoppingButton).click();
        return this;
    }

    public SacolaPo clickPagamento(){
        driver.findElement(pagamentoButton).click();
        return this;
    }

    public SacolaPo clickConfirmaOrdem(){
        driver.findElement(confimaOrdemButton).click();
        return this;
    }

    public boolean checkMensagemSucesso(){
       String validaMensagem = driver.findElement(messageSuccess).getText();

       if(validaMensagem.contains("Your order on My Store is complete.")){
           return true;
       } else {
           return false;
       }
    }

    public SacolaPo clickTrash(){
        driver.findElement(trashButton).click();
        return this;
    }

    public boolean checkMensagemCarrinho(){
        String validaMensagemCarrinho = driver.findElement(messageCartEmpty).getText();

        if(validaMensagemCarrinho.contains("Your shopping cart is empty.")){
            return true;
        } else {
            return false;
        }
    }

    private By checkoutButton = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span");

    private By MensagemInput = By.xpath("//*[@id=\"ordermsg\"]/textarea");

    private By processAddressButton = By.xpath("//*[@id=\"center_column\"]/form/p/button");

    private By agreeCheck = By.id("cgv");

    private By processShoppingButton = By.xpath("//*[@id=\"form\"]/p/button/span");

    private By pagamentoButton = By.xpath("//a[contains(text(), 'Pay by bank wire')]");

    private By confimaOrdemButton = By.xpath("//*[@id=\"cart_navigation\"]/button/span");

    private By messageSuccess = By.xpath("//strong[contains(text(), 'Your order on My Store is complete.')]");

    private By trashButton = By.className("icon-trash");

    private By messageCartEmpty = By.xpath("//*[@id=\"center_column\"]/p");
}
