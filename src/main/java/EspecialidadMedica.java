import java.util.Vector;

public class EspecialidadMedica {
	private String nombre;
	private String latitud;
	private String longitud;
	private Vector<Administrativo> administrativo = new Vector<Administrativo>();
	private Vector<Medico> medico = new Vector<Medico>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLatitud() {
		return this.latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return this.longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public Medico agregarMedico(Medico medico) {
		throw new UnsupportedOperationException();
	}

	public Administrativo agregarAdministrativo(Administrativo administrativo) {
		throw new UnsupportedOperationException();
	}

	public EspecialidadMedica(String nombre, String latitud, String longitud) {
		throw new UnsupportedOperationException();
	}
}