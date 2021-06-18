package com.Mobile;
import com.PageObjects.*;
import org.junit.Assert;
import org.junit.Test;

/*
    Projeto: Mobile
    Orientador: Thiago BN
*/

public class ValidarMensagensDoAlert extends Hooks {


   AlertasPage ap = new AlertasPage();
   HomePage hp = new HomePage();
   AlertaInfoPage al = new AlertaInfoPage();


    //CT - Thiago
    @Test
    public void clicar_No_Alerta_Simples_Com_Sucesso() {
        hp.clickAlertas();
        ap.clickAlertaSimples();
        String text = AlertaInfoPage.validarMensagemAlert();
        Assert.assertEquals("Pode clicar no OK ou fora da caixa para sair",text);
        AlertaInfoPage.clicarBotao("android:id/button1");
    }

    //CT - Thiago
    @Test
    public void clicar_No_Alerta_Restritivo_Com_Sucesso()  {
        hp.clickAlertas();
        ap.clickAlertaRestricao();
        String text = AlertaInfoPage.validarMensagemAlert();
        Assert.assertEquals("Não pode clicar fora, apenas no SAIR",text);
        AlertaInfoPage.clicarBotao("android:id/button1");
    }
    //CT - Thiago
    @Test
    public void clicar_No_Alerta_De_Confirmacao_Com_Sucesso()  {
        hp.clickAlertas();
        ap.clickAlertaConfirma();
        al.clicarBotaoConfirma();
        String text = AlertaInfoPage.validarMensagemAlert();
        Assert.assertEquals("Confirmado",text);
        AlertaInfoPage.clicarBotao("android:id/button1");
    }
    //CT - Daniel
    @Test
    public void clicar_No_Alerta_De_Confirmacao_Sem_Sucesso() {
        hp.clickAlertas();
        ap.clickAlertaConfirma();
        al.clicarBotaoNegar();
        String text = AlertaInfoPage.validarMensagemAlert();
        Assert.assertEquals("Negado",text);
        AlertaInfoPage.clicarBotao("android:id/button1");
    }
    }
