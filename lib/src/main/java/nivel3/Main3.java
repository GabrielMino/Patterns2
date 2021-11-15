package nivel3;

public class Main3 {
	
	public static void main(String[] args) {
		
		
		
		Article article1= new Article("Té",1.50);
		Article article2 = new Article("Café",1.20);
		Article article3= new Article("Café con leche",1.45);
		Article article4= new Article("Croissant",1.0);
		
		CurrencyConverter cc = new CurrencyConverter(0.8,1.2);
	
		article1.showPrices(cc);
		article2.showPrices(cc);
		article3.showPrices(cc);
		article4.showPrices(cc);
		


}
}