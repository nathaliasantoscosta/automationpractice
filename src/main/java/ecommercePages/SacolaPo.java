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
        driver.findElement(mensagemInput).sendKeys("Entrega na portaria");
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

    private By checkoutButton = By.xpath("//span[text()='Proceed to checkout']");

    private By mensagemInput = By.xpath("//div[@id='ordermsg']/textarea");

    private By agreeCheck = By.id("cgv");

    private By processShoppingButton = By.name("processCarrier");

    private By pagamentoButton = By.xpath("//a[contains(text(), 'Pay by bank wire')]");

    private By confimaOrdemButton = By.xpath("//span[text()='I confirm my order']");

    private By messageSuccess = By.xpath("//p[@class='cheque-indent']/strong");

    private By trashButton = By.className("icon-trash");

    private By messageCartEmpty = By.cssSelector(".alert-warning");
}
