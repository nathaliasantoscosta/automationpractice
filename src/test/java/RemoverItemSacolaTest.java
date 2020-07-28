import ecommercePages.HomePo;
import ecommercePages.LoginPo;
import ecommercePages.SacolaPo;
import org.junit.Assert;
import org.junit.Test;
import support.TestBase;

public class RemoverItemSacolaTest extends TestBase {

    @Test
    public void removerItemSacola() {
        LoginPo loginPo = new LoginPo(driver);
        loginPo.clickLogin().fillEmail().fillSenha().clickSignIn();

        HomePo homePo = new HomePo(driver);
        homePo.fillBuscar().clickItem().clickCollorWhite().clickAddItem().clickAddCarrinho();

        SacolaPo sacolaPo = new SacolaPo(driver);
        sacolaPo.clickTrash();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Assert.assertTrue(sacolaPo.checkMensagemCarrinho());
    }
}
