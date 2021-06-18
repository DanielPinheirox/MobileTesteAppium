package com.Mobile;

import com.PageObjects.HomePage;
import com.PageObjects.Hooks;
import com.PageObjects.LoginUsuarioSeuBarrigaHibridoPage;
import org.junit.Assert;
import org.junit.Test;

public class ValidarLoginUsuarioSeuBarrigaHibrido extends Hooks {

    HomePage hp = new HomePage();
    LoginUsuarioSeuBarrigaHibridoPage lbh = new LoginUsuarioSeuBarrigaHibridoPage();

    @Test
    public void realizar_login_com_sucesso(){
        hp.clicarNoSeuBarrigaHibrido();
        lbh.clicarPorTexto("Login");
        lbh.camposDeLogin();
        lbh.setCampos("danielpinho12@hotmail.com","123");
        Assert.assertTrue("True", lbh.retornoDaMensagem("Bem vindo, Daniel P!"));
    }
    @Test
    public void realizar_login_sem_dados(){
        hp.clicarNoSeuBarrigaHibrido();
        lbh.clicarPorTexto("Login");
        lbh.camposDeLogin();
        lbh.setCampos("","");
        Assert.assertTrue("True", lbh.retornoDaMensagem("Email é um campo obrigatório"));
        Assert.assertTrue("True", lbh.retornoDaMensagem("Senha é um campo obrigatório"));
    }
    @Test
    public void realizar_login_que_nao_existe(){
        hp.clicarNoSeuBarrigaHibrido();
        lbh.clicarPorTexto("Login");
        lbh.camposDeLogin();
        lbh.setCampos("null@hotmail.com","null");
        Assert.assertTrue("True", lbh.retornoDaMensagem("Problemas com o login do usuário"));
    }
}
