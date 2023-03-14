package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoTransferenciaTest {

    @Test
    void deveExecutarTransferencia() {
        IServico servico = ServicoFactory.obterServico("Transferencia");
        assertEquals("Transferencia efetivada", servico.executar());
    }

    @Test
    void deveCancelarTransferencia() {
        IServico servico = ServicoFactory.obterServico("Transferencia");
        assertEquals("Transferencia cancelada", servico.cancelar());
    }
}
