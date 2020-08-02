import ecommercePages.HomePo;
import ecommercePages.LoginPo;
import ecommercePages.SacolaPo;
import org.junit.Assert;
import org.junit.Test;
import support.TestBase;

public class RealizarCompraAlterandoCorTest extends TestBase {

    @Test
    public void realizarCompraAlterandoCor(){
        LoginPo loginPo = new LoginPo(driver);
        loginPo.clickLogin().fillEmail().fillSenha().clickSignIn();

        HomePo homePo = new HomePo(driver);
        homePo.fillBuscar().clickItem().clickCollorWhite().clickAddItem().clickAddCarrinho();

        SacolaPo sacolaPo = new SacolaPo(driver);
        sacolaPo.clickCheckout()
                .fillMensagem().clickCheckout()
                .checkAgree().clickProcessShipping()
                .clickPagamento()
                .clickConfirmaOrdem();

        Assert.assertTrue(sacolaPo.checkMensagemSucesso());
    }
}
