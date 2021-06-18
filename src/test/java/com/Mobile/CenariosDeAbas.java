package com.Mobile;

import com.PageObjects.Aba_Page;
import com.PageObjects.HomePage;
import com.PageObjects.Hooks;
import org.junit.Assert;
import org.junit.Test;

public class CenariosDeAbas extends Hooks {

    HomePage homePage = new HomePage();
    Aba_Page aba_page = new Aba_Page();

    @Test
    public void consultar_conteudo_da_primeira_aba() {

        homePage.clicarAbas();
        aba_page.validar_primeira_aba();
        Assert.assertTrue("True",
                aba_page.retornoDaMensagem
                        ("Este é o conteúdo da Aba 1"));
    }

    @Test
    public void consultar_conteudo_da_segunda_aba() {

        homePage.clicarAbas();
        aba_page.validar_segunda_aba();
        Assert.assertTrue("True",
                aba_page.retornoDaMensagem("Este é o conteúdo da Aba 2"));
    }

}
