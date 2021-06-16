package modelo;


public class Contexto {

    private Ajedrez ajedrez;

    public void setEstrategia(Ajedrez ajedrez) {
        this.ajedrez = ajedrez;
    }

    public void ejecutarEstrategia() {
        ajedrez.mover();
    }
}
