package practica6;
/**
 * Clase en la que guarda un coche y sus atributos.
 * @author andcebrod
 * @version 2019
 */
public class Coche {
	private static final String EL_COCHE_CON_MATRICULA = "El coche con matricula ";
	private static final String ES_UN = "es un ";
	private String matricula;
	private String atrib;
	private String modelo;
	private String fabricante;
	/**
	 * @return Devuelve el fabricante de un Coche. 
	 */  
	String getFabricante() {
		return fabricante;
	}
	/**
	 * Establece un fabricante de un coche (Astra,León, etc).
	 * @param Fabricante que inserta en un coche.
	 */  
	void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	/**
	 * @return Devuelve el modelo de un Coche. 
	 */  
	String getModelo() {
		return modelo;
	}
	/**
	 * Establece un modelo de un coche (Astra,León, etc).
	 * @param Modelo que inserta en un coche.
	 */  
	void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return Devuelve el atributo de un Coche. 
	 */ 
	String getAtrib() {
		return atrib;
	}
	/**
	 * Establece un atributo para un coche (Gasolina, diésel, etc).
	 * @param Atributo que inserta en un coche.
	 */   
	void setAtrib(String atrib) {
		this.atrib = atrib;
	}
	/**
	 * @return Devuelve la matricula de un Coche. 
	 */   
	String getMatricula() {
		return matricula;
	}
	/**
	 * Establece una matricula para un coche.
	 * @param Matricula que inserta en un coche.
	 */ 
	void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * 	Constructor un objeto coche vacío.
	 *  
	 */  
	public Coche() {
		setMatricula("");
		setAtrib("");
		setModelo("");
		setFabricante("");
	}
	/**
	 * Constructor principal de la clase Coche.
	 * @param m = Matrícula.
	 * @param c = Atributo.
	 * @param mo = Modelo.
	 * @param f = Fabricante.
	 */  
	public Coche(String m, String c, String mo, String f) {
		setMatricula(m);
		setAtrib(c);
		setModelo(mo);
		setFabricante(f);
	}
	/**
	 * Devuelve una cadena en la que te explica el gasto por litro de un coche
	 * @param model = Modelo de coche que aparecerá en el mensaje.
	 * @param fabric = Fabricante que aparecerá en el mensaje.
	 * @return Devuelve una cadena en la que explica lo que gasta por litro un coche de gasolina
	 */ 
	public String esGasolina (String model, String fabric) 
	{
		String Gasolina = " y gasta 1,337 euros por litro.";
		String resultado=ES_UN+fabric+" "+model+Gasolina;
		return resultado;

	}
	/**
	 * Devuelve una cadena en la que te explica el gasto por litro de un coche
	 * @param model = Modelo de coche que aparecerá en el mensaje.
	 * @param fabric = Fabricante que aparecerá en el mensaje.
	 * @return Devuelve una cadena en la que explica lo que gasta por litro un coche de diesel
	 */ 
	public String esDiesel (String model, String fabric) 
	{
		String Diesel = " y gasta 1,052 euros por litro.";
		String resultado=ES_UN+fabric+" "+model+Diesel;
		return resultado;
	}
	/**
	 * Establece un modelo de un coche (Astra,León, etc).
	 * @param model = Modelo de coche que aparecerá en el mensaje.
	 * @param fabric = Fabricante que aparecerá en el mensaje.
	 * @return Devuelve una cadena en la que explica que no gasta combustible.
	 */  
	public String esHibrido (String model, String fabric) 
	{
		String Hibrido = " y no necesita combustible.";
		String resultado=ES_UN+fabric+" "+model+Hibrido;
		return resultado;
	}
	/**
	 * Introduce una cadena en la que te explica que un coche con matricula gasta una determinada cantidad dependiendo del atributo.
	 *  @see #esGasolina(String, String)
	 *  @see #esDiesel(String, String)
	 *  @see #esHibrido(String, String)
	 * @return Devuelve una cadena en la que explica lo que gasta por litro un coche con una matricula concreta llamando a un metodo.
	 */  
	public String mostrarGastoYMatricula() {
		String resultado = "";
		if (getAtrib() == "Gasolina") {
			resultado = EL_COCHE_CON_MATRICULA + getMatricula() + " "+esGasolina(getModelo(), getFabricante());
		} else if (getAtrib() == "Diesel") {
			resultado = EL_COCHE_CON_MATRICULA + getMatricula() + " "+esDiesel(getModelo(), getFabricante());
		} else if (getAtrib() == "Híbrido") {
			resultado = EL_COCHE_CON_MATRICULA + getMatricula() + " "+esHibrido(getModelo(), getFabricante());
		} else {
			String SinInformacion = "no dispone de información";
			resultado = EL_COCHE_CON_MATRICULA + getMatricula() + " "+SinInformacion;
		}
		return resultado;
	}
}