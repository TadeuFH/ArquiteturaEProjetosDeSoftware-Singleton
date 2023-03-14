package padroescriacao.factorymethodex1;

public class Teste {

    public static void main(String[] args) {
        Poligono triangulo = PoligonoFactory.getPoligono(3);
        System.out.println(triangulo.getDescripition());

        Poligono quadrado = PoligonoFactory.getPoligono(4);
        System.out.println(quadrado.getDescripition());

        Poligono pentagono = PoligonoFactory.getPoligono(5);
        System.out.println(pentagono.getDescripition());



    }

}
