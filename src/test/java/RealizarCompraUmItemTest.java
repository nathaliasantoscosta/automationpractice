import ecommercePages.HomePo;
import ecommercePages.LoginPo;
import ecommercePages.SacolaPo;
import org.junit.Assert;
import org.junit.Test;
import support.TestBase;

public class RealizarCompraUmItemTest extends TestBase {

    @Test
    public void realizarCompraUmItem(){
        LoginPo loginPo = new LoginPo(driver);
        loginPo.clickLogin().fillEmail().fillSenha().clickSignIn();

        HomePo homePo = new HomePo(driver);
        homePo.fillBuscar().clickItem().clickAddItem().clickAddCarrinho();

        SacolaPo sacolaPo = new SacolaPo(driver);
        sacolaPo.clickCheckout();
        sacolaPo.fillMensagem().clickCheckout();
        sacolaPo.checkAgree().clickProcessShipping();
        sacolaPo.clickPagamento();
        sacolaPo.clickConfirmaOrdem();

        Assert.assertTrue(sacolaPo.checkMensagemSucesso());
    }
}
