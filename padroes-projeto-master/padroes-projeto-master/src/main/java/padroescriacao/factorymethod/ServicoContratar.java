package padroescriacao.factorymethod;

public class ServicoContratar implements IServico{

    public String executar() {
        return "Contratacao efetivada";
    }

    public String cancelar() {
        return "Contratacao cancelada";
    }
}
