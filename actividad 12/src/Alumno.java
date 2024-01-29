
public class Alumno extends Persona {
	
	private String curso;
	
	public Alumno() {
		super();
		this.curso = "";
	}


	public Alumno(String nombre, int anyoNacimiento, String curso) {
		super(nombre, anyoNacimiento);
		this.curso = curso;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	@Override
	public double calcularDescuento(double precio) {
		return (precio * 10)/100;
	}


	@Override
	public String toString() {
		return "Alumno [curso=" + curso + ", getNombre()=" + getNombre() + ", año Nacimiento()="
				+ getAnyoNacimiento() + "]";
	}
	
	
	
}
