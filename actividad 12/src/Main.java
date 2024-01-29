
public class Main {

	public static void main(String[] args) {
		// Crear un objeto Profesor
        Profesor profesor = new Profesor("Juan", 1980, 2000);

        // Crear un objeto Alumno
        Alumno alumno = new Alumno("Pedro", 2005, "1º ESO");

        // Imprimir información del profesor
        System.out.println("Información del Profesor:");
        System.out.println(profesor);
        System.out.println("Descuento para profesor: " + profesor.calcularDescuento(100));

        // Imprimir información del alumno
        System.out.println("\nInformación del Alumno:");
        System.out.println(alumno);
        System.out.println("Descuento para alumno: " + alumno.calcularDescuento(100));

	}

}
