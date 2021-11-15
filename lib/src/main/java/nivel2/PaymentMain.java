package nivel2;
import java.util.*;

public class PaymentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner option = new Scanner(System.in);

        System.out.println("Como desea pagar? : \n 1-PayPal \n 2-Credit Card \n 3-Bank Account");
        int pOption = option.nextInt();

        AskPayment askP = new AskPayment();
        PaymentType payment = new PaymentType(pOption);
        // ask payment as default operation
        askP.Payment(payment);
        AskPayment askP1 = new AskPayment();
        askP1.Payment(new Transaction(){
        	@Override
        	public void Paid(){
        		System.out.println("Payment Done");
        	}
        	
        });
	}

	}


