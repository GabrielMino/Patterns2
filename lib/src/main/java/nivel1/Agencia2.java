package nivel1;

public class Agencia2 extends Observador {
	
	public Agencia2(Subject sujeto) {
		this.sujeto=sujeto;
		this.sujeto.agregar(this);
		
	}

	@Override
	public void actualizar() {
		System.out.println("Notificación para la Agencia2. La bolsa ha " + sujeto.getEstado());
		
	}

}
