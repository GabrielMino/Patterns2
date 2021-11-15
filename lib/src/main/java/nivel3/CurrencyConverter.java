package nivel3;



public class CurrencyConverter {
	
	private double dollar,pound;


	public CurrencyConverter(double dollar, double pound) {
		super();
		this.dollar = dollar;
		this.pound = pound;
	}
	
	
	public String convertToDollar(double price) {
		
		return String.format("%.2f",price/dollar);
	}
	
	public String convertToPound(double price) {
		
		return String.format("%.2f",price/pound);
		}
	
	

}
