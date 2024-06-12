package org.lessons.java.shop;


public class Main {

	public static void main(String[] args) {
		
		// INZIALIZZAZIONE OGGETTO PRODOTTO
		Prodotto remotControl = new Prodotto("telecomando", "E' un telecomando per televisione", 20.99, 25);
		Prodotto card = new Prodotto("macchina", "E' un tesla", 40.999, 25);
		
		// RICHIAMO METODI OGGETTO
		System.out.println("-*-*-*-*-*- TELECOMANDO -*-*-*-*-*-");
		System.out.printf("- PREZZO TELECOMANDO ---> %.3f€ \n", remotControl.getPrice());
		System.out.printf("- PREZZO TELECOMANDO CON IVA ---> %.3f€ \n", remotControl.getPriceIva());
		System.out.println("- NOME ESTESO TELECOMANDO ---> " + remotControl.getNameCode());
		
		System.out.println("");
		
		System.out.println("-*-*-*-*-*- MACCHINA -*-*-*-*-*-");
		System.out.printf("- PREZZO MACCHINA ---> %.3f€ \n", card.getPrice());
		System.out.printf("- PREZZO MACCHINA CON IVA ---> %.3f€ \n", card.getPriceIva());
		System.out.println("- NOME ESTESO MACCHINA ---> " + card.getNameCode());
		
	}

}
