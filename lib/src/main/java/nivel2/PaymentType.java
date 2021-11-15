package nivel2;

public class PaymentType implements Transaction {

	public PaymentType(int option) {
		if (option==1) {
			System.out.println("Pay Pal selected");
		}
		
		else if (option==2) {
			System.out.println("Credit Card selected");
		}
		else if(option==3) {
			System.out.println("Bank Account selected");

		}
	}

	@Override
	public void Paid() {
		
	}
	
}
