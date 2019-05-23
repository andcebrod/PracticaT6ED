package practica6;

public class Coche {
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
	
	public String metodoA (String model, String fabric) 
	{
		String resultado="es un "+fabric+" "+model+" y gasta 1,337 euros por litro.";
		return resultado;
		
	}
	public String metodoB (String model, String fabric) 
	{
		String resultado="es un "+fabric+" "+model+" y gasta 1,052 euros por litro.";
		return resultado;
		
	}
	public String metodoC (String model, String fabric) 
	{
		String resultado="es un "+fabric+" "+model+" y no necesita combustible.";
		return resultado;
	}

	public String metodo1() {
		String resultado = "";
		if (atrib == "Gasolina") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoA(modelo, fabricante);
		} else if (atrib == "Diesel") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoB(modelo, fabricante);
		} else if (atrib == "Híbrido") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoC(modelo, fabricante);
		} else {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += "no dispone de información";
		}
		return resultado;
	}
}
