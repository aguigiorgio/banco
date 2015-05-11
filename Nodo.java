package banco;
/**
 *
 * @author Jorge Márquez
 */
public class Nodo {

    private Cliente dato;
    private Nodo ant, sig;

    public Nodo() {
        dato = null;
        ant = sig = null;

    }

    public Cliente getDato() {
        return dato;
    }

    public void setDato(Cliente dato) {
        this.dato = dato;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

}
