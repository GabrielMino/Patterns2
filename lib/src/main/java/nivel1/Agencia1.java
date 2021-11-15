package nivel1;

public class Agencia1 extends Observador {
	
	public Agencia1(Subject sujeto) {
		this.sujeto=sujeto;
		this.sujeto.agregar(this);
		
	}

	@Override
	public void actualizar() {
		System.out.println("Notificación para la Agencia1. La bolsa ha " + sujeto.getEstado());
		
	}

}
