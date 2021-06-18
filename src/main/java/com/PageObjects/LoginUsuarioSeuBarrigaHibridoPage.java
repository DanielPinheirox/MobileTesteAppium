package com.PageObjects;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginUsuarioSeuBarrigaHibridoPage extends BasePage{

    private MobileElement email;
    private MobileElement senha;

    public void camposDeLogin() {
        email = (MobileElement) getDriver().findElement(By.xpath("//android.widget.EditText[@index='1']"));
        senha = (MobileElement) getDriver().findElement(By.xpath("//android.widget.EditText[@index='3']"));
    }
    public void setCampos(String email, String senha) {
        digitar(this.email, email);
        digitar(this.senha, senha);
        clicarPorTexto("Entrar");
    }
    public Boolean retornoDaMensagem(String retornoDaMensagem) {

        return driver.findElement(By.xpath("//*[@text='" + retornoDaMensagem + "']")).isEnabled();

    }
}
