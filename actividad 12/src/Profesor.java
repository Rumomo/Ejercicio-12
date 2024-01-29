
public class Profesor extends Persona {

	private double salario;

	public Profesor() {
		super();
		this.salario = 0;
	}

	public Profesor(String nombre, int anyoNacimiento, int salario) {
		super(nombre, anyoNacimiento);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public double calcularDescuento(double precio) {
		return (precio * 2)/100;
	}
	
	@Override
	public String toString() {
	    return "Profesor [Nombre=" + getNombre() 
	    + ", añoNacimiento=" + getAnyoNacimiento() 
	    + ", salario=" + salario + "]";
	} 
	
}
