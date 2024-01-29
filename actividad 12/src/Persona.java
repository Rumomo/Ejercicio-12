
public abstract class Persona {
	
	protected String nombre;
	protected int anyoNacimiento;
	
	public Persona() {
		this.nombre = "";
		this.anyoNacimiento = 0;
	}

	public Persona(String nombre, int anyoNacimiento) {
		this.nombre = nombre;
		this.anyoNacimiento = anyoNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setAnyoNacimiento(int anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}
	
	public abstract double calcularDescuento(double precio);
	

}
