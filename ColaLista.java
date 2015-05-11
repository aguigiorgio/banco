package banco;
/**
 *
 * @author Jorge Márquez
 */
public class ColaLista {
    private Lista lista;

    public ColaLista() {
        lista = new Lista();
    }
    
    public void meter(Nodo n){
        lista.insertarFin(n);
    }
    
    public Nodo sacar(){
        return lista.elimnarInicio();
    }
    
    public String toString(){
        return lista.toString();
    }
    
}

    

