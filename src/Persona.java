
public class Persona {
	private Mascota miMascota;
	
	public Mascota getMiMascota() {
		return miMascota;
	}

	public void setMiMascota(Mascota miMascota) {
		this.miMascota = miMascota;
	}

	public  Persona (Mascota mascota){
		this.miMascota = mascota;
	}
	
	public void moverMascota (){
		this.miMascota.moverse();
	}

}
