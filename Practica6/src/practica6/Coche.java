package practica6;

public class Coche {
	private static final String EL_COCHE_CON_MATRICULA = "El coche con matricula ";
	private static final String ES_UN = "es un ";
	private String matricula;
	private String atrib;
	private String modelo;
	private String fabricante;

	String getFabricante() {
		return fabricante;
	}

	void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	String getModelo() {
		return modelo;
	}

	void setModelo(String modelo) {
		this.modelo = modelo;
	}

	String getAtrib() {
		return atrib;
	}

	void setAtrib(String atrib) {
		this.atrib = atrib;
	}

	String getMatricula() {
		return matricula;
	}

	void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Coche() {
		setMatricula("");
		setAtrib("");
		setModelo("");
		setFabricante("");
	}

	public Coche(String m, String c, String mo, String f) {
		setMatricula(m);
		setAtrib(c);
		setModelo(mo);
		setFabricante(f);
	}
	
	public String esGasolina (String model, String fabric) 
	{
		String Gasolina = " y gasta 1,337 euros por litro.";
		String resultado=ES_UN+fabric+" "+model+Gasolina;
		return resultado;
		
	}
	public String esDiesel (String model, String fabric) 
	{
		String Diesel = " y gasta 1,052 euros por litro.";
		String resultado=ES_UN+fabric+" "+model+Diesel;
		return resultado;
	}
	public String esHibrido (String model, String fabric) 
	{
		String Hibrido = " y no necesita combustible.";
		String resultado=ES_UN+fabric+" "+model+Hibrido;
		return resultado;
	}
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
