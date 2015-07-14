
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ave Pajaro = new Ave ();
		Perro Pan = new Perro ();
		Pez Plup = new Pez ();
		
		Persona Mengano = new Persona (Plup);
		
		Mengano.moverMascota();
		
		Mengano.setMiMascota(Pan);
		
		Mengano.moverMascota();

	}

}
