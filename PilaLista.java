package banco;
/**
 *
 * @author Jorge Márquez
 */
public class PilaLista {
    private Lista lista;
    
    public PilaLista(){
        lista = new Lista();
    }
    
    public void meter(Nodo n){
        lista.insertarFin(n);
    }
    
    public Nodo sacar(){
        return lista.elimnarFin();
    }
    
    public String toString(){
        return lista.toString();
    }
}
