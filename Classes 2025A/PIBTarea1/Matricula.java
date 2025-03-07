package PIBTarea1;

public class Matricula {

    private String nombre;
    private int nivel;
    private int creditos;

    public Matricula(String nombre, int nivel, int creditos) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getCreditos() {
        return creditos;
    }

    @Override
    public String toString() {
        return "Asignatura: " + nombre + "   Nivel: " + nivel + "   Creditos: " + creditos;
    }
    
}
