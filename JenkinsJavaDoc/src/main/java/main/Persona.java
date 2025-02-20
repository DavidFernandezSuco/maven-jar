package main;

// TODO: Auto-generated Javadoc
/**
 * The Class Persona.
 */
public class Persona {

	/** The nombre. */
	//atributos
	String nombre;
	
	/** The edad. */
	int edad;
	
	/**
	 * Instantiates a new persona.
	 *
	 * @param nombre the nombre
	 * @param edad the edad
	 */
	//constructor
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	/**
	 * Hablar.
	 */
	//metodos
	public void hablar() {
		System.out.println("Estoy hablando");
	}
	
	/**
	 * Caminar.
	 */
	public void caminar() {
		System.out.println("Estoy caminando");
	}
	
	/**
	 * Dormir.
	 */
	public void dormir() {
		System.out.println("Estoy durmiendo");
	}
}
