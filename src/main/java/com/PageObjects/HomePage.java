package com.PageObjects;

public class HomePage extends BasePage {


    public void clicarAlertas() {

        clicarPorTexto("Alertas");
    }

    public void clickAlertas() {
        clicarAlertas();
    }

    public void clicarAbas() {
        clicarPorTexto("Abas");
    }

    public void clicarNoSeuBarrigaHibrido() {
        clicarPorTexto("SeuBarriga Híbrido");
    }
}
