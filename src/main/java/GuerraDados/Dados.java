package GuerraDados;
public class Dados {
    private int caras;

    public Dados(int caras) {
        this.caras = caras;
    }

    public int lanzar() {
        return (int) (Math.random() * caras) + 1;
    }
}
