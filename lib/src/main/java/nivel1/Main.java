package nivel1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Subject subject = new Subject();
		new Agencia1(subject);
		new Agencia2(subject);
		
		System.out.println("Las siguientes notificaciones han sido enviadas: ");
		subject.setEstado("SUBIDO 4.01� en el d�a 21/10");
		
		
		System.out.println("\nLas siguientes notificaciones han sido enviadas: ");
		subject.setEstado("BAJADO 3.02 en el d�a 22/10");
	}

}
