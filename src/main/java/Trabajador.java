public class Trabajador {
	private String nombre;
	private String rut;
	private String direccion;
	private String horarioDeTrabajo;
	private String tituloProfesional;
	private String estadoCivil;
	private String especializacion;
	private Clinica clinica;

	public Trabajador() {
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getHorarioDeTrabajo() {
		return this.horarioDeTrabajo;
	}

	public void setHorarioDeTrabajo(String horarioDeTrabajo) {
		this.horarioDeTrabajo = horarioDeTrabajo;
	}

	public String getTituloProfesional() {
		return this.tituloProfesional;
	}

	public void setTituloProfesional(String tituloProfesional) {
		this.tituloProfesional = tituloProfesional;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Trabajador(String nombre, String rut, String direccion, String horarioDetrabajo, String tituloProfesional, String estadoCivil) {
		throw new UnsupportedOperationException();
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}