import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String newnombre[] = new String[10];
        int newcodigo[] = new int[10];
        int newprecio[] = new int[10];
        int newcantidad[] = new int[10];
        int j = 0;
        int i = 0;
        int op;

        ArrayList<Productos> Product = new ArrayList<>();
        Product.add(new Productos("Cilantro", 1, 700, 5));
        Product.add(new Productos("Pollo", 2, 15000, 2));
        Product.add(new Productos("Tomate", 3, 500, 3));
        Product.add(new Productos("Cebolla", 4, 600, 1));
        Product.add(new Productos("Costilla", 5, 7000, 2));
        Product.add(new Productos("Mantequilla", 6, 2000, 1));
        Product.add(new Productos("Cerveza", 7, 2500, 3));
        Product.add(new Productos("Gaseosa 1lt", 8, 5000, 1));
        Product.add(new Productos("Barra Chocolate", 9, 3000, 2));
        Product.add(new Productos("Botella Agua", 10, 2000, 1));

        while(i!=5) {
            Scanner sc5 = new Scanner (System.in);
            System.out.print("1. Mostral lista organizada por precio");
            System.out.print("\n2. Mostrar lista organizada por cantidad");
            System.out.print("\n3. Agregar nuevo producto");
            System.out.print("\n4. Buscar producto con codigo");
            System.out.print("\n5. Salir");
            System.out.print("\n\nIngrese el numero de la opcion que desea: ");
            op = sc5.nextInt();
            System.out.print("\n\n");

            switch(op) {
                case 1:
                Collections.sort(Product, new Comparadores());
                mostrarLista(Product);
                System.out.print("\n\n");
                break;

                case 2:
                Collections.sort(Product, new Comparadores2());
                mostrarLista(Product);
                System.out.print("\n\n");
                break;

                case 3:
                Scanner sc1 = new Scanner (System.in);
                System.out.print("Ingrese el nombre del nuevo producto: ");
                newnombre[j] = sc1.nextLine();
                Scanner sc2 = new Scanner (System.in);
                System.out.print("\nIngrese el codigo del nuevo producto: ");
                newcodigo[j] = sc2.nextInt();
                Scanner sc3 = new Scanner (System.in);
                System.out.print("\nIngrese el precio del nuevo producto: ");
                newprecio[j] = sc3.nextInt();
                Scanner sc4 = new Scanner (System.in);
                System.out.print("\nIngrese la cantidad del nuevo producto: ");
                newcantidad[j] = sc4.nextInt();
                Product.add(new Productos("" + newnombre[j], newcodigo[j], newprecio[j], newcantidad[j]));
                System.out.print("\n\n");
                j++;
                break;

                case 4:
                int busc;
                Scanner sc6 = new Scanner (System.in);
                System.out.print("\nIngrese el codigo del producto que desea buscar: ");
                busc = sc6.nextInt();
                Productos a = null;
                Productos productoEncontrado = null;
                Iterator<Productos> it = Product.iterator();
                while(it.hasNext() && productoEncontrado == null) {
                    a = it.next();
                    if(a.getCodigo() == busc) {
                        productoEncontrado = a;
                    }
                }
                if(a == null) {
                    System.out.print("\nNo se encontro ningun producto con ese codigo");
                } else {
                    System.out.print("\nSe encontro: " + a);
                }
                System.out.print("\n\n");
                break;

                case 5:
                i = 5;
                break;
            }
        }
    }

    public static void mostrarLista(List<?> lista) {
        for (Object x : lista) {
            System.out.println(x);
        }
    }
}