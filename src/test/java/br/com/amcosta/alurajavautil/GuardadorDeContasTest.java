package br.com.amcosta.alurajavautil;

import br.com.amcosta.alurajavautil.conta.ContaCorrente;
import br.com.amcosta.alurajavautil.conta.ContaPoupanca;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GuardadorDeContasTest {

    private GuardadorDeContas guardador;

    @Before
    public void setUp() {
        this.guardador = new GuardadorDeContas();
    }

    @Test
    public void testDeveGuardarAsReferencias() {
        ContaCorrente cc = new ContaCorrente(123, 1234);
        ContaPoupanca cp = new ContaPoupanca(123, 123450);

        this.guardador.adicionar(cc);
        this.guardador.adicionar(cp);

        Assert.assertEquals(2, this.guardador.getQuantidade());
    }

}
