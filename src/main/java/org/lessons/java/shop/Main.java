package org.lessons.java.shop;


public class Main {

	public static void main(String[] args) {
		
		// INZIALIZZAZIONE OGGETTO PRODOTTO
		Prodotto remotControl = new Prodotto("telecomando", "E' un telecomando per televisione", 20.99, 25);
		Prodotto card = new Prodotto("macchina", "E' un tesla", 40.999, 25);
		
		// RICHIAMO METODI OGGETTO
		System.out.println("-*-*-*-*-*- TELECOMANDO -*-*-*-*-*-");
		System.out.println("- PREZZO TELECOMANDO ---> " + remotControl.getPrice() + "€");
		System.out.println("- PREZZO TELECOMANDO CON IVA ---> " + remotControl.getPriceIva() + "€");
		System.out.println("- NOME ESTESO TELECOMANDO ---> " + remotControl.getNameCode());
		
		System.out.println("");
		
		System.out.println("-*-*-*-*-*- MACCHINA -*-*-*-*-*-");
		System.out.println("- PREZZO MACCHINA ---> " + card.getPrice() + "€");
		System.out.println("- PREZZO MACCHINA CON IVA ---> " + card.getPriceIva() + "€" );
		System.out.println("- NOME ESTESO MACCHINA ---> " + card.getNameCode());
		
	}

}
