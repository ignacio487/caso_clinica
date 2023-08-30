public class Administrativo extends Trabajador {
	private String correoElectronico;
	private EspecialidadMedica especialidadMedica;

	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}

	public Administrativo(String correoElectronico) {
		throw new UnsupportedOperationException();
	}
}