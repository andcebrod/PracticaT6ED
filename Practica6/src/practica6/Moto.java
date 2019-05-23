package practica6;

public class Moto {
	private String matricula;
	private int cilindrada;

	public Moto() {
		setMatricula("");
		setCilindrada(0);
	}

	public Moto(String m, int c) {
		setMatricula(m);
		setCilindrada(c);
	}

	public String getMatricula() {
		return matricula;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setMatricula(String m) {
		matricula = m;
	}

	public void setCilindrada(int c) {
		cilindrada = c;
	}
}
