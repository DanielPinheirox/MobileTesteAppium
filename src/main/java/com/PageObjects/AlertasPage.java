package com.PageObjects;



public class AlertasPage extends BasePage {


    public void clickAlertaSimples(){
        clicarPorTexto("ALERTA SIMPLES");
    }

    public void  clickAlertaRestricao(){
        clicarPorTexto("ALERTA RESTRITIVO");
    }

    public  void  clickAlertaConfirma(){
        clicarPorTexto("ALERTA CONFIRM");
    }
}
