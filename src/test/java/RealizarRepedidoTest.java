import ecommercePages.LoginPo;
import ecommercePages.MyAccountPO;
import ecommercePages.SacolaPo;
import org.junit.Assert;
import org.junit.Test;
import support.TestBase;

public class RealizarRepedidoTest extends TestBase {

    @Test
    public void realizarRepedido(){
        LoginPo loginPo = new LoginPo(driver);
        loginPo.clickLogin().fillEmail().fillSenha().clickSignIn();

        MyAccountPO myAccountPO = new MyAccountPO(driver);
        myAccountPO.clickOrder().clickReorderButton();

        SacolaPo sacolaPo = new SacolaPo(driver);
        sacolaPo.clickCheckout();
        sacolaPo.fillMensagem().clickCheckout();
        sacolaPo.checkAgree().clickProcessShipping();
        sacolaPo.clickPagamento();
        sacolaPo.clickConfirmaOrdem();

        Assert.assertTrue(sacolaPo.checkMensagemSucesso());
    }
}
