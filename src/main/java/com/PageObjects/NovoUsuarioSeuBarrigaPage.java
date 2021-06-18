package com.PageObjects;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class NovoUsuarioSeuBarrigaPage extends BasePage {

    private MobileElement nome;
    private MobileElement email;
    private MobileElement senha;

    public void novoUsuario() {
        clicarPorTexto("Novo usuário?");
    }

    public void camposNovousuario() {

        nome = (MobileElement) getDriver().findElement(By.xpath("//android.widget.EditText[@index='1']"));
        email = (MobileElement) getDriver().findElement(By.xpath("//android.widget.EditText[@index='3']"));
        senha = (MobileElement) getDriver().findElement(By.xpath("//android.widget.EditText[@index='5']"));
    }

    public void setCampos(String nome, String email, String senha) {
        digitar(this.nome, nome);
        digitar(this.email, email);
        digitar(this.senha, senha);
        clicarPorTexto("Cadastrar");
    }

    public Boolean retornoDaMensagem(String retornoDaMensagem) {

        return driver.findElement(By.xpath("//*[@text='" + retornoDaMensagem + "']")).isEnabled();

    }
}

