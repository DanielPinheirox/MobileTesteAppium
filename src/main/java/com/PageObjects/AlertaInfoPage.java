package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AlertaInfoPage extends BasePage {



    public static String validarMensagemAlert() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("android:id/message")));
        return  obterTexto(By.id("android:id/message"));
    }

    public static void clicarBotao(String id) {
        clicarBotao(By.id(id));
    }

    public void clicarBotaoConfirma() {
        clicarPorTexto("CONFIRMAR");
    }
    public void clicarBotaoNegar() {
        clicarPorTexto("NEGAR");
    }

}
