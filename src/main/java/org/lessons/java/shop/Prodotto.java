package org.lessons.java.shop;

public class Prodotto {

	// VARIABILI D'ISTANZA
	private int code;
	private String name;
	private String description;
	private double price, iva;
	
	// COSTRUTTORE
	public Prodotto(String name, String description, double price, double iva) {
		
		this.code = (int) Math.random() * 1000;
		this.name = name;
		this.description = description;
		this.price = price;
		this.iva = iva;
		
	}
	
	
	// METODO CHE RESTITUISCE IL PREZZO BASE
	public double getPrice() {
		return this.price;
	}
	

	// METODO CHE RESTITUISCE IL PREZZO COMPRENSIVO D'IVA
	public double getPriceIva() {
		
		this.iva = (this.price/100) * this.iva;
		System.out.printf("- IVA CALCOLATA ---> %.3f€ \n", this.iva);
		
		return this.price + this.iva;
	}
	
	// METODO CHE RESTITUISCE IL NOME-CODICE
	public String getNameCode() {
		return this.code + "-" + this.name;
	}
	
	// METODO CHE RESTITUISCE LA DESCRIZIONE
	public String getDescription() {
		return this.description;
	}
	
}
