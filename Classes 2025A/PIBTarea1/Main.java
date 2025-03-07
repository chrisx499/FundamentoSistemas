package PIBTarea1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        String Usuario[] = new String[10];
        String materias[] = new String[3];
        String dias[] = new String[3];
        String horas[] = new String[3];
        String docentes[] = new String[3];
        String ingreso;
        int Contraseña[] = new int[10];
        int totalCreditos[] = new int[10];
        int numUsuarios = 1;
        int i = 1;
        int j = 1;
        int k = 0;
        int w = 0;
        int op1, op2, t, cont, matr, hor, elim;


        Usuario[0] = "Christopher";
        Contraseña[0] = 2442;
        totalCreditos[0] = 10;

        while(i!=3) {
            System.out.print("\n\nMENU\n");
            System.out.print("\nSi ya tiene un usuario ingrese: 1 ");
            System.out.print("\nSi no tiene y desea crear un usuario ingrese: 2 ");
            System.out.print("\n");
            Scanner sc1 = new Scanner (System.in);
            op1 = sc1.nextInt();

            if(op1==1) {
                Scanner sc5 = new Scanner (System.in);
                System.out.print("\nIngrese su nombre de usuario (Solo letras): ");
                ingreso = sc5.nextLine();
                Scanner sc6 = new Scanner (System.in);
                System.out.print("\nIngrese su contraseña (Solo 4 numeros): ");
                cont = sc6.nextInt();
                for(t=0;t<numUsuarios;t++) {
                    if(ingreso.equals(Usuario[t]) && cont==Contraseña[t]) {
                        System.out.print("\nIngreso Exitoso\n");
                        k = t;
                        i = 3;
                    } else {
                        System.out.print("\nUsuario o contraseña incorrectos");
                    }
                }
            } else if(op1==2) {
                Scanner sc2 = new Scanner (System.in);
                System.out.print("\nIngrese el nuevo nombre de usuario (Solo letras): ");
                Usuario[numUsuarios] = sc2.nextLine();
                Scanner sc3 = new Scanner (System.in);
                System.out.print("\nIngrese la contraseña el nuevo usuario (Solo 4 numeros): ");
                Contraseña[numUsuarios] = sc3.nextInt();
                totalCreditos[numUsuarios] = 15;
                numUsuarios++;
            }
        }

        ArrayList<Matricula> Asignaturas = new ArrayList<>();
        Asignaturas.add(new Matricula("1.Calculo 1", 3, 5));
        Asignaturas.add(new Matricula("2.Estructura de Datos", 3, 5));
        Asignaturas.add(new Matricula("3.Base de datos", 3, 5));
        Asignaturas.add(new Matricula("4.Ingles IV", 5, 5));
        Asignaturas.add(new Matricula("5.Constitucion Politica", 6, 5));

        ArrayList<Horarios> Horarios1 = new ArrayList<>();
        Horarios1.add(new Horarios("Lunes", "10:00 - 13:00", "Jorge Cortez"));
        Horarios1.add(new Horarios("Miercoles", "18:30 - 21:30", "Jorge Cortez"));
        Horarios1.add(new Horarios("Viernes", "7:00 - 10:00", "Jorge Cortez"));

        ArrayList<Horarios> Horarios2 = new ArrayList<>();
        Horarios2.add(new Horarios("Martes", "7:00 - 10:00", "Floralba Miranda"));
        Horarios2.add(new Horarios("Miercoles", "10:00 - 13:00", "Floralba Miranda"));
        Horarios2.add(new Horarios("Sabado", "7:00 - 10:00", "Floralba Miranda"));

        ArrayList<Horarios> Horarios3 = new ArrayList<>();
        Horarios3.add(new Horarios("Martes", "10:00 - 13:00", "Luisa Valencia"));
        Horarios3.add(new Horarios("Jueves", "18:30 - 21:30", "Luisa Valencia"));
        Horarios3.add(new Horarios("Viernes", "10:00 - 13:00", "Luisa Valencia"));

        ArrayList<Horarios> Horarios4 = new ArrayList<>();
        Horarios4.add(new Horarios("Miercoles", "7:00 - 10:00", "Natalia Torres"));
        Horarios4.add(new Horarios("Jueves", "10:00 - 13:00", "Natalia Torres"));
        Horarios4.add(new Horarios("Viernes", "18:30 - 21:30", "Natalia Torres"));

        ArrayList<Horarios> Horarios5 = new ArrayList<>();
        Horarios5.add(new Horarios("Lunes", "7:00 - 10:00", "Nicolas Fernandez"));
        Horarios5.add(new Horarios("Martes", "18:30 - 21:30", "Nicolas Fernandez"));
        Horarios5.add(new Horarios("Sabado", "10:00 - 13:00", "Nicolas Fernandez"));

        while(j!=5) {
            System.out.print("\n\nMATRICULA\n");
            System.out.print("\n1.Ver numero de creditos actuales");
            System.out.print("\n2.Ver horario actual");
            System.out.print("\n3.Matricular materias");
            System.out.print("\n4.Cancelar materias");
            System.out.print("\n5.Salir");
            System.out.print("\n");
            Scanner sc4 = new Scanner (System.in);
            op2 = sc4.nextInt();

            ArrayList<HorMatri> Estudiante = new ArrayList<>();
            Estudiante.add(new HorMatri(materias[0], dias[0], horas[0], docentes[0]));
            Estudiante.add(new HorMatri(materias[1], dias[1], horas[1], docentes[1]));
            Estudiante.add(new HorMatri(materias[2], dias[2], horas[2], docentes[2]));

            switch(op2) {
                case 1:
                System.out.print("\nEn Este momento cuenta con: " + totalCreditos[k]);
                break;

                case 2:
                mostrarLista(Estudiante);
                break;

                case 3:
                if(totalCreditos[k]<5) {
                    System.out.print("\nNo tiene suficientes creditos para matricular\n");
                    break;
                }
                System.out.print("\n\n");
                mostrarLista(Asignaturas);
                Scanner sc7 = new Scanner (System.in);
                System.out.print("\nEscriba el numero de la asignatura que desea matricular: ");
                matr = sc7.nextInt();
                switch(matr) {
                    case 1:
                    materias[w] = "Calculo 1";
                    docentes[w] = "Jorge Cortez";
                    System.out.print("\n");
                    mostrarLista(Horarios1);
                    Scanner sc8 = new Scanner (System.in);
                    System.out.print("\nEscriba el numero del horario que desea matricular: ");
                    hor = sc8.nextInt();
                    switch(hor) {
                        case 1:
                        dias[w] = "Lunes";
                        horas[w] = "10:00 - 13:00";
                        System.out.print("\nRegistro Exitoso\n");
                        totalCreditos[k] = totalCreditos[k] - 5;
                        w++;
                        break;

                        case 2:
                        dias[w] = "Miercoles";
                        horas[w] = "18:30 - 21:30";
                        System.out.print("\nRegistro Exitoso\n");
                        totalCreditos[k] = totalCreditos[k] - 5;
                        w++;
                        break;

                        case 3:
                        dias[w] = "Viernes";
                        horas[w] = "7:00 - 10:00";
                        System.out.print("\nRegistro Exitoso\n");
                        totalCreditos[k] = totalCreditos[k] - 5;
                        w++;
                        break;
                    }
                    break;

                    case 2:
                    materias[w] = "Estructura de Datos";
                    docentes[w] = "Floralba Miranda";
                    System.out.print("\n");
                    mostrarLista(Horarios2);
                    Scanner sc9 = new Scanner (System.in);
                    System.out.print("\nEscriba el numero del horario que desea matricular: ");
                    hor = sc9.nextInt();
                    switch(hor) {
                        case 1:
                        dias[w] = "Martes";
                        horas[w] = "7:00 - 10:00";
                        System.out.print("\nRegistro Exitoso\n");
                        totalCreditos[k] = totalCreditos[k] - 5;
                        w++;
                        break;

                        case 2:
                        dias[w] = "Miercoles";
                        horas[w] = "10:00 - 13:00";
                        System.out.print("\nRegistro Exitoso\n");
                        totalCreditos[k] = totalCreditos[k] - 5;
                        w++;
                        break;

                        case 3:
                        dias[w] = "Sabado";
                        horas[w] = "7:00 - 10:00";
                        System.out.print("\nRegistro Exitoso\n");
                        totalCreditos[k] = totalCreditos[k] - 5;
                        w++;
                        break;
                    }
                    break;

                    case 3:
                    materias[w] = "Base de Datos";
                    docentes[w] = "Luisa Valencia";
                    System.out.print("\n");
                    mostrarLista(Horarios3);
                    Scanner sc10 = new Scanner (System.in);
                    System.out.print("\nEscriba el numero del horario que desea matricular: ");
                    hor = sc10.nextInt();
                    switch(hor) {
                        case 1:
                        dias[w] = "Martes";
                        horas[w] = "10:00 - 13:00";
                        System.out.print("\nRegistro Exitoso\n");
                        totalCreditos[k] = totalCreditos[k] - 5;
                        w++;
                        break;

                        case 2:
                        dias[w] = "Jueves";
                        horas[w] = "18:30 - 21:30";
                        System.out.print("\nRegistro Exitoso\n");
                        totalCreditos[k] = totalCreditos[k] - 5;
                        w++;
                        break;

                        case 3:
                        dias[w] = "Viernes";
                        horas[w] = "10:00 - 13:00";
                        System.out.print("\nRegistro Exitoso\n");
                        totalCreditos[k] = totalCreditos[k] - 5;
                        w++;
                        break;
                    }
                    break;

                    case 4:
                    materias[w] = "Ingles IV";
                    docentes[w] = "Natalia Torres";
                    System.out.print("\n");
                    mostrarLista(Horarios4);
                    Scanner sc11 = new Scanner (System.in);
                    System.out.print("\nEscriba el numero del horario que desea matricular: ");
                    hor = sc11.nextInt();
                    switch(hor) {
                        case 1:
                        dias[w] = "Miercoles";
                        horas[w] = "7:00 - 10:00";
                        System.out.print("\nRegistro Exitoso\n");
                        totalCreditos[k] = totalCreditos[k] - 5;
                        w++;
                        break;

                        case 2:
                        dias[w] = "Jueves";
                        horas[w] = "10:00 - 13:00";
                        System.out.print("\nRegistro Exitoso\n");
                        totalCreditos[k] = totalCreditos[k] - 5;
                        w++;
                        break;

                        case 3:
                        dias[w] = "Viernes";
                        horas[w] = "18:30 - 21:30";
                        System.out.print("\nRegistro Exitoso\n");
                        totalCreditos[k] = totalCreditos[k] - 5;
                        w++;
                        break;
                    }
                    break;

                    case 5:
                    materias[w] = "Constitucion Politica";
                    docentes[w] = "Nicolas Fernandez";
                    System.out.print("\n");
                    mostrarLista(Horarios5);
                    Scanner sc12 = new Scanner (System.in);
                    System.out.print("\nEscriba el numero del horario que desea matricular: ");
                    hor = sc12.nextInt();
                    switch(hor) {
                        case 1:
                        dias[w] = "Lunes";
                        horas[w] = "7:00 - 10:00";
                        System.out.print("\nRegistro Exitoso\n");
                        totalCreditos[k] = totalCreditos[k] - 5;
                        w++;
                        break;

                        case 2:
                        dias[w] = "Martes";
                        horas[w] = "18:30 - 21:30";
                        System.out.print("\nRegistro Exitoso\n");
                        totalCreditos[k] = totalCreditos[k] - 5;
                        w++;
                        break;

                        case 3:
                        dias[w] = "Sabado";
                        horas[w] = "10:00 - 13:00";
                        System.out.print("\nRegistro Exitoso\n");
                        totalCreditos[k] = totalCreditos[k] - 5;
                        w++;
                        break;
                    }
                    break;
                }
                break;

                case 4:
                System.out.print("\n1." + materias[0]);
                System.out.print("\n2." + materias[1]);
                System.out.print("\n1." + materias[2]);
                Scanner sc13 = new Scanner (System.in);
                System.out.print("\nIngrese el numero de la materia que desea cancelar: ");
                elim = sc13.nextInt();
                switch(elim) {
                    case 1:
                    materias[0] = null;
                    dias[0] = null;
                    horas[0] = null;
                    docentes[0] = null;
                    totalCreditos[k] = totalCreditos[k] + 5;
                    System.out.print("\nCancelacion Exitosa\n");
                    break;

                    case 2:
                    materias[1] = null;
                    dias[1] = null;
                    horas[1] = null;
                    docentes[1] = null;
                    totalCreditos[k] = totalCreditos[k] + 5;
                    System.out.print("\nCancelacion Exitosa\n");
                    break;

                    case 3:
                    materias[2] = null;
                    dias[2] = null;
                    horas[2] = null;
                    docentes[2] = null;
                    totalCreditos[k] = totalCreditos[k] + 5;
                    System.out.print("\nCancelacion Exitosa\n");
                    break;
                }
                break;

                case 5:
                j = 5;
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