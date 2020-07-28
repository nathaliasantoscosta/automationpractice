import ecommercePages.HomePo;
import ecommercePages.LoginPo;
import org.junit.Test;
import support.TestBase;

public class RealizarLoginTest extends TestBase {

    @Test
    public void realizarLogin(){
        LoginPo loginPo = new LoginPo(driver);
        loginPo.clickLogin().fillEmail().fillSenha().clickSignIn();
    }
}
