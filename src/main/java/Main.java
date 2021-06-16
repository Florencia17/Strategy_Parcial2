
import modelo.Contexto;
import ui.MoverPiezas;


public class Main {

    public static void main(String[] args) {
        MoverPiezas moverPiezas = new MoverPiezas(new Contexto());
        moverPiezas.setVisible(true);
    }
}

