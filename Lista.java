package banco;
/**
 *
 * @author Jorge Márquez
 */
public class Lista {
     private Nodo inicio, fin;

    public Lista() {
        inicio = fin = null;
    }

    public void insertarInicio(Nodo n) {
        if (inicio == null) {
            inicio = fin = n;
        } else {
            n.setSig(inicio);
            inicio.setAnt(n);
            inicio = n;
        }
    }

    public void insertarFin(Nodo n) {
        if (inicio == null) {
            inicio = fin = n;
        } else {
            n.setAnt(fin);
            fin.setSig(n);
            fin = n;
        }
    }

    public Nodo elimnarInicio() {
        Nodo n = inicio;
        if (inicio == null) {
            return n;
        }
        if (inicio == fin) {
            inicio = fin = null;
            return n;
        }
        inicio = inicio.getSig();
        n.setSig(null);
        inicio.setAnt(null);
        return n;
    }

    public Nodo elimnarFin() {
        Nodo n = fin;
        if (inicio == null) {
            return n;
        }
        if (inicio == fin) {
            inicio = fin = null;
            return n;
        }
        fin = fin.getAnt();
        n.setAnt(null);
        fin.setSig(null);
        return n;
    }

    public String toString() {
        String cad = "Clientes del banco Mapache\n\n";
        Nodo n = inicio;
        while (n != null) {
            cad += n.getDato() + "\n";
            n = n.getSig();
        }
        return cad;
    }
}

