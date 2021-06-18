package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Aba_Page extends BasePage {

    public Boolean retornoDaMensagem(String retornoDaMensagemAba) {

        return driver.findElement(By.xpath("//*[@text='" + retornoDaMensagemAba + "']")).isEnabled();

    }

    public void validar_primeira_aba() {
        clicarPorTexto("ABA 1");
    }

    public void validar_segunda_aba() {
        clicarPorTexto("ABA 2");
    }
}
