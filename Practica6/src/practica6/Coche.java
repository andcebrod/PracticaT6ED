package practica6;

public class Coche {
	//Atributos sin encapsular
	//Faltan Getters y Setters
	String matricula;
	String atrib;
	String modelo;
	String fabricante;

	public Coche() {
		matricula = "";
		atrib = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		atrib = c;
		modelo = mo;
		fabricante = f;
	}
	
	//Cambiar nombre al m�todo
	public String metodoA (String model, String fabric) 
	{
		//Extraer constante
		//Extraer variable
		String resultado="es un "+fabric+" "+model+" y gasta 1,337 euros por litro.";
		return resultado;
		
	}
	//Cambiar nombre al m�todo
	public String metodoB (String model, String fabric) 
	{
		//Extraer constante
		//Extraer variable
		String resultado="es un "+fabric+" "+model+" y gasta 1,052 euros por litro.";
		return resultado;
	}
	//Cambiar nombre al m�todo
	public String metodoC (String model, String fabric) 
	{
		//Extraer constante
		//Extraer variable
		String resultado="es un "+fabric+" "+model+" y no necesita combustible.";
		return resultado;
	}
	//Cambiar nombre al m�todo
	public String metodo1() {
		String resultado = "";
		if (atrib == "Gasolina") {
			//Duplicaci�n de c�digo
			//Extraer constante
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoA(modelo, fabricante);
		} else if (atrib == "Diesel") {
			//Duplicaci�n de c�digo
			//Extraer constante
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoB(modelo, fabricante);
		} else if (atrib == "H�brido") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoC(modelo, fabricante);
		} else {
			//Duplicaci�n de c�digo
			//Extraer constante
			resultado += "El coche con matricula " + matricula + " ";
			resultado += "no dispone de informaci�n";
		}
		return resultado;
	}
}
