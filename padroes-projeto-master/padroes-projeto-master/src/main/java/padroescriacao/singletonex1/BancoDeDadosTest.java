package padroescriacao.singletonex1;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class BancoDeDadosTest {

    @Test
    public void deveRetornarNomeBDD(){
        BancoDeDados.getInstance().setNomeBDD("banco 123");
        assertEquals("banco 123",BancoDeDados.getInstance().getNomeBDD());
    }

}
