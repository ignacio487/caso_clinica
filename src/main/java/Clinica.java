import java.util.ArrayList;
import java.util.Vector;

public class Clinica {
	private String nombre;
	private String direccionesAsociadas;
	private String tipoDeClinica;
	private Vector<EspecialidadMedica> especialidadMedica = new Vector<EspecialidadMedica>();
	private Vector<Trabajador> trabajador = new Vector<Trabajador>();

	public ArrayList<Medico> obtenerMedicos() {
		return obtenerMedicos();
	}

	public ArrayList<Administrativo> obtenerAdministrativos() {
		return obtenerAdministrativos();
	}

	public ArrayList<Medico> obtenerMedicoPorEspecialidad(EspecialidadMedica especialidad) {
		ArrayList<Medico> medicosEspecialidad = new ArrayList<>();
		for (Medico medico : obtenerMedicos()) {
			String nombreEspecialidad=new String();
			if (medico.getEspecializacion().equalsIgnoreCase(nombreEspecialidad)) {
				medicosEspecialidad.add(medico);
			}
		}
		return medicosEspecialidad;
	}

	public Administrativo obtenerAdministrativoPorEspecialidad(EspecialidadMedica especialidad) {
		for (Administrativo administrativo : obtenerAdministrativos()) {
			String nombreRutAdministrativo = new String();
			if (administrativo.getTipo().equalsIgnoreCase("Administrativo") &&
					(administrativo.getNombre().equalsIgnoreCase(nombreRutAdministrativo) || administrativo.getRut().equalsIgnoreCase(nombreRutAdministrativo))) {
				return administrativo;
			}
		}
		return null;
	}
}