import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Clinica clinica = new Clinica("Clinica Ejemplo", new ArrayList<>(), "Privada");
        ArrayList<Medico> todosLosMedicos = clinica.obtenerMedicos();
        ArrayList<Administrativo> todosLosAdministrativos = clinica.obtenerAdministrativos();

        ArrayList<Medico> medicosEspecialidad = clinica.obtenerMedicoPorEspecialidad("Especialidad");
        ArrayList<Administrativo> administrativosEspecialidad = clinica.obtenerAdministrativoPorEspecialidad("Especialidad");

    }
}
