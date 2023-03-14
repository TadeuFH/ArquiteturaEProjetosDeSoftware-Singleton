package padroescriacao.factorymethodex1;

public class PoligonoFactory {

    public static Poligono getPoligono(int numberOfSides) {
        if (numberOfSides == 3) {
            return new Triangulo();
        }
        if (numberOfSides == 4) {
            return new Quadrado();
        }
        if (numberOfSides == 5) {
            return new Pentagono();
        }
        return null;
    }
}
