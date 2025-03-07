package PIBTarea1;

public class Horarios {

    private String dia;
    private String hora;
    private String docente;

    public Horarios(String dia, String hora, String docente) {
        this.dia = dia;
        this.hora = hora;
        this.docente = docente;
    }

    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }

    public String getDocente() {
        return docente;
    }

    @Override
    public String toString() {
        return " " + dia + "  Hora: " + hora + "   Docente: " + docente;
    }
    
}
