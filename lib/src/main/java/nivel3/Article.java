package nivel3;

public class Article {
	private String name;
	private double price;
	
	public Article(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	
	public void showPrices (CurrencyConverter cc) {
		
		System.out.println("\nThe price of "+name +" is: " +String.format("%.2f",price)+"€"+" , (USD) $"+
		cc.convertToDollar(price)+" ,and £"+ cc.convertToPound(price));
		
	}



	

	
	
	
	
	

}
