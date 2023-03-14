package padroescriacao.singletonex1;

public class BancoDeDados {

    private static BancoDeDados instance;
    private BancoDeDados(){
    }
    public static BancoDeDados getInstance(){
        if( instance == null ){
            instance = new BancoDeDados();
        }
        return instance;
    }

    private String NomeBDD;
    public String getNomeBDD(){return NomeBDD; }

    public void setNomeBDD(String NomeBDD) {
        this.NomeBDD = NomeBDD;
    }

}
