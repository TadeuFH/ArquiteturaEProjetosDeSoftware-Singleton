package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ServicoContratarTest {

    @Test
    void deveExecutarContratar() {
        IServico servico = ServicoFactory.obterServico("Contratar");
        assertEquals("Contratacao efetivada", servico.executar());
    }

    @Test
    void deveCancelarContratar() {
        IServico servico = ServicoFactory.obterServico("Contratar");
        assertEquals("Contratacao cancelada", servico.cancelar());
    }
}
