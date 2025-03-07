import java.util.Comparator;

public class Comparadores2 implements Comparator<Productos> {

    @Override
    public int compare(Productos o1, Productos o2) {
        return o1.getCantidad() - o2.getCantidad();
    }
    
}
