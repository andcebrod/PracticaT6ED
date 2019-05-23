package practica6;
/**
 * Clase en la que guarda una moto y sus atributos.
 * @author andcebrod
 * @version 2019
 */
public class Moto {
	private String matricula;
	private int cilindrada;
	/**
	 * 	Constructor un objeto moto vacío.
	 *  
	 */ 
	public Moto() {
		setMatricula("");
		setCilindrada(0);
	}
	/**
	 * Constructor principal de la clase matrícula.
	 * @param m = Matrícula.
	 * @param c = Cilindrada.
	 */
	public Moto(String m, int c) {
		setMatricula(m);
		setCilindrada(c);
	}
	/**
	 * @return Devuelve la matricula de una moto. 
	 */ 
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @return Devuelve la cilindrada de una moto. 
	 */
	public int getCilindrada() {
		return cilindrada;
	}
	/**
	 * Establece una matricula para una moto.
	 * @param m, matricula que inserta en una moto.
	 */  
	public void setMatricula(String m) {
		matricula = m;
	}
	/**
	 * Establece una cilindrada para una moto.
	 * @param c, cilindrada que inserta en una moto.
	 */
	public void setCilindrada(int c) {
		cilindrada = c;
	}
}
