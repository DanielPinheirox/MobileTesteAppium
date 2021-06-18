package com.Mobile;

import com.PageObjects.HomePage;
import com.PageObjects.Hooks;
import com.PageObjects.NovoUsuarioSeuBarrigaPage;
import org.junit.Assert;
import org.junit.Test;

public class ValidarUsuarioNovoSeuBaarrigaHibrido extends Hooks {

    HomePage hp = new HomePage();
    NovoUsuarioSeuBarrigaPage lbh = new NovoUsuarioSeuBarrigaPage();

    @Test
    public void criar_um_novo_usuario() {

        hp.clicarNoSeuBarrigaHibrido();
        lbh.novoUsuario();
        lbh.camposNovousuario();
        lbh.setCampos("danielQAFullStack","daniel955@hotmail.com","12345678");
        Assert.assertTrue("True", lbh.retornoDaMensagem("Usuário inserido com sucesso"));
    }
    @Test
    public void criar_um_novo_usuario_sem_dados(){
        hp.clicarNoSeuBarrigaHibrido();
        lbh.novoUsuario();
        lbh.camposNovousuario();
        lbh.setCampos("","","");
        Assert.assertTrue("True", lbh.retornoDaMensagem("Nome é um campo obrigatório"));
        Assert.assertTrue("True", lbh.retornoDaMensagem("Email é um campo obrigatório"));
        Assert.assertTrue("True", lbh.retornoDaMensagem("Senha é um campo obrigatório"));
    }
    @Test
    public void criar_um_usuario_ja_cadastrado(){
        hp.clicarNoSeuBarrigaHibrido();
        lbh.novoUsuario();
        lbh.camposNovousuario();
        lbh.setCampos("daniel","daniel@hotmail.com","123456");
        Assert.assertTrue("True", lbh.retornoDaMensagem("Endereço de email já utilizado"));
    }


}
