import java.util.Comparator;

public class Comparadores implements Comparator<Productos> {

    @Override
    public int compare(Productos o1, Productos o2) {
        return o1.getPrecio() - o2.getPrecio();
    }
    
}
