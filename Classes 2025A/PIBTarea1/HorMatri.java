package PIBTarea1;

public class HorMatri {

    private String materia;
    private String dia;
    private String hora;
    private String docente;

    public HorMatri(String materia, String dia, String hora, String docente) {
        this.materia = materia;
        this.dia = dia;
        this.hora = hora;
        this.docente = docente;
    }

    public String getMateria() {
        return materia;
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
        return "Asignatura:  " + materia + "   Dia: " + dia + "  Hora: " + hora + "   Docente: " + docente;
    }
    
}
