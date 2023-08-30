public class Medico extends Trabajador {
	private String nombre;
	private String especializacion;
	private String horarioDeAtencion;
	private int pacientesAsignados;
	private EspecialidadMedica especialidadMedica;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecializacion() {
		return this.especializacion;
	}

	public void setEspecializacion(String especializacion) {
		this.especializacion = especializacion;
	}

	public String getHorarioDeAtencion() {
		return this.horarioDeAtencion;
	}

	public void setHorarioDeAtencion(String horarioDeAtencion) {
		this.horarioDeAtencion = horarioDeAtencion;
	}

	public int getPacientesAsignados() {
		return this.pacientesAsignados;
	}

	public void setPacientesAsignados(int pacientesAsignados) {
		this.pacientesAsignados = pacientesAsignados;
	}

	public Medico(String horarioDeAtencion, int pacientesAsignados) {
		throw new UnsupportedOperationException();
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}