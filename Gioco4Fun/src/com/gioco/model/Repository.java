package com.gioco.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Repository {
	
	private Random rand;
	private List<String> listaCategorie;
	private List<String> listaLettere;
	private List<String> listaIstruzioniLettere;
	private List<String> listaParole;
	private List<String> listaMimo;
	private List<String> listaImitazione;
	private List<String> listaCanzone;
	private List<String> listaDisegno;
	private List<ArrayList<String>> listaGiocoSquadra;
	
	
	public Repository(){
		rand = new Random();
		
		listaCategorie =  new ArrayList<String>();
		listaCategorie.add("Lettere");
		listaCategorie.add("Fantasia");
		listaCategorie.add("Gioco di Squadra");
		
		listaLettere = new ArrayList<String>();
		listaLettere.add("A");  listaLettere.add("N");
		listaLettere.add("B");	listaLettere.add("O");
		listaLettere.add("C");	listaLettere.add("P");
		listaLettere.add("D");	listaLettere.add("Q");
		listaLettere.add("E");	listaLettere.add("R");
		listaLettere.add("F");	listaLettere.add("S");
		listaLettere.add("G");	listaLettere.add("T");
		listaLettere.add("H");	listaLettere.add("U");
		listaLettere.add("I");	listaLettere.add("V");
		listaLettere.add("J");	listaLettere.add("W");
		listaLettere.add("K");	listaLettere.add("X");
		listaLettere.add("L");	listaLettere.add("Y");
		listaLettere.add("M");	listaLettere.add("Z");
		
		listaIstruzioniLettere = new ArrayList<String>();
		listaIstruzioniLettere.add("Pesca 1 lettera e formula una frase di senso compiuto , le cui parole inizino tutte con tale lettera.");
		listaIstruzioniLettere.add("Pesca 3 lettere e formula 7  parole che contengano tali lettere.");
		listaIstruzioniLettere.add("Pesca 4  lettere e formula 4  parole che contengano tali lettere.");
		listaIstruzioniLettere.add("Pesca 2 lettere e formula 10 parole che contengano tali lettere.");
		listaIstruzioniLettere.add("Pesca 5  lettere e formula 2 parole che contengano tali lettere.");
		listaIstruzioniLettere.add("Pesca 6 lettere e formula 1 parola che contenga tali lettere.");
		listaIstruzioniLettere.add("Pesca 1 lettera e trova 3 titoli di film che inizino on tale lettera.");
		listaIstruzioniLettere.add("Pesca 1 lettera e trova 5  nomi di calciatori che inizino con tale lettera.");
		listaIstruzioniLettere.add("Pesca 1 lettera e trova 5 nomi di animali che inizino con tale lettera.");
		listaIstruzioniLettere.add("Pesca 1 lettera e trova 5 nazioni che inizino con tale lettera.");
		listaIstruzioniLettere.add("Pesca 1 lettera e trova 5 attori che inizino con tale lettera.");
		listaIstruzioniLettere.add("Pesca 1 lettera e trova 10 nomi propri che inizino con tale lettera.");
		listaIstruzioniLettere.add("Pesca 1 lettera e trova 4 titoli di canzoni che inizino con tale lettera.");
		listaIstruzioniLettere.add("Pesca 1 lettera e trova 2 titoli di libri che inizino con tale lettera.");
		listaIstruzioniLettere.add("Pesca 1 lettera e trova 3 titoli di cartoni animati che inizino con tale lettera.");
		listaIstruzioniLettere.add("Pesca 6 lettere e formula 2 parole che contengano tali lettere.");
		listaIstruzioniLettere.add("Pesca 1 lettera e trova un aggettivo per ogni avversario che inizi con tale lettera.");
		listaIstruzioniLettere.add("Pesca 6 lettere  e formula 3 parole che contengano tali lettere.");
		listaIstruzioniLettere.add("Pesca 3 lettere e trova 3 tipi di cibo che contengano tali lettere. ");
		listaIstruzioniLettere.add("Pesca  1 lettera e trova 4 titoli di canzoni che contengano tali lettere.");
		listaIstruzioniLettere.add("Pesca 1 lettera e formula 1 frase di senso compiuto, le cui parole inizino tutte con tale lettera.");
		listaIstruzioniLettere.add("Pesca 5 lettere e formula 2 parole che contengano tali lettere.");
		listaIstruzioniLettere.add("Pesca 4 lettere e trova 3 nomi di città che contengano tali lettere.");
		listaIstruzioniLettere.add("Pesca 3 lettere e formula 7 parole che contengano tali lettere.");
		listaIstruzioniLettere.add("Pesca 1 lettera e trova 3 aspetti di te stesso che inizino con tale lettera.");
		listaIstruzioniLettere.add("Pesca 4 lettere e formula 4 parole che contengano tali lettere.");
		listaIstruzioniLettere.add("Pesca 1 lettera e trova 3 personaggi mitologici che inizino con tale lettera.");
		listaIstruzioniLettere.add("Pesca 1 lettera e trova 2 titoli di opere d’arte che inizino con tale lettera.");
		listaIstruzioniLettere.add("Pesca 1 lettera e formula 1 frase di senso compiuto, le cui parole inizino tutte con tali lettere.");
		listaIstruzioniLettere.add("Pesca 5 lettere e formula 2 parole che inizino con tale lettera.");
		listaIstruzioniLettere.add("Pesca 1 lettera e trova 3 personaggi storici  che inizino con tale lettera.");
		listaIstruzioniLettere.add("Pesca 3 lettere e formula 7 parole che contengano tali lettere.");
		listaIstruzioniLettere.add("Pesca 2 lettere e formula 10 parole che contengano tali lettere.");
		listaIstruzioniLettere.add("Pesca 2 lettere e trova uno sport che contenga tali lettere.");
		listaIstruzioniLettere.add("Pesca 1 vocale e 1 consonante e trova 5 parole che inizino con questa sillaba.");
		listaIstruzioniLettere.add("Pesca 4 lettere e formula 4 parole che contengano tali lettere.");
		listaIstruzioniLettere.add("Pesca 2 lettere e formula 10 parole che contengano tali lettere.");
		listaIstruzioniLettere.add("Pesca 1 vocale e 1 consonante e trova 3 parole che inizino con questa sillaba.");
		listaIstruzioniLettere.add("Pesca 1 vocale e 1 consonante e trova 4 parole che inizino con questa sillaba.");
		listaIstruzioniLettere.add("Pesca 2 lettere e trova 1 indumento che contenga tali lettere.");//40
		
		listaParole = new ArrayList<String>();
		listaParole.add("casa");          listaParole.add("capelli");     listaParole.add("torre");		    listaParole.add("tablet");
		listaParole.add("patate");		  listaParole.add("vestito");     listaParole.add("destino");		listaParole.add("fragola");
		listaParole.add("orologio");	  listaParole.add("piatto");	  listaParole.add("gioielli");	    listaParole.add("banana");
		listaParole.add("televisione");   listaParole.add("computer");	  listaParole.add("ciambella");	    listaParole.add("cugino");
		listaParole.add("vecchio");	      listaParole.add("amicizia");    listaParole.add("anno");			listaParole.add("tempesta");
		listaParole.add("sedia");		  listaParole.add("nave");		  listaParole.add("cattivo");		listaParole.add("ladro");
		listaParole.add("fiori");		  listaParole.add("amore");	      listaParole.add("forte");		    listaParole.add("incendio");
		listaParole.add("matrimonio");    listaParole.add("attore");	  listaParole.add("speranza");		listaParole.add("sabbia");
		listaParole.add("cane");	      listaParole.add("prato");	      listaParole.add("avvocato");		listaParole.add("castoro");
		listaParole.add("tavolo");		  listaParole.add("rosso");	      listaParole.add("nemico");		listaParole.add("occhiolino");
		listaParole.add("albero");		  listaParole.add("mano");		  listaParole.add("topo");			//100
		listaParole.add("pagliaccio");    listaParole.add("cantare");     listaParole.add("cinema");		
		listaParole.add("lavoro");		  listaParole.add("foto");		  listaParole.add("freddo");		
		listaParole.add("vaso");		  listaParole.add("orso");		  listaParole.add("parrucca");		
		listaParole.add("musica");        listaParole.add("macchina");    listaParole.add("dentista");		
		listaParole.add("letto");		  listaParole.add("montagna");    listaParole.add("dolce");		    
		listaParole.add("mare");		  listaParole.add("sorpresa");	  listaParole.add("amaro");		   
		listaParole.add("stelle");		  listaParole.add("lama");        listaParole.add("vita");			
		listaParole.add("barba");		  listaParole.add("sole");	      listaParole.add("barca");		    
		listaParole.add("fiocco");		  listaParole.add("fiume");	      listaParole.add("medioevo");		
		listaParole.add("festa");		  listaParole.add("consiglio");   listaParole.add("scale");		    
		listaParole.add("cena");		  listaParole.add("bomba");	      listaParole.add("brivido");		
		listaParole.add("compleanno");    listaParole.add("amico");	      listaParole.add("isola");		    
		listaParole.add("testa");         listaParole.add("guerra");	  listaParole.add("fontana");		
		listaParole.add("fulmine");	  	  listaParole.add("piazza");	  listaParole.add("paese");		   
		listaParole.add("mondo");		  listaParole.add("chiesa");      listaParole.add("divinità");		
		listaParole.add("terrazza");	  listaParole.add("allegria");    listaParole.add("biliardo");		
		listaParole.add("pizza");/* 30 */ listaParole.add("scatola");     listaParole.add("sigaretta"); 	
		
		listaGiocoSquadra = new ArrayList<ArrayList<String>>();	
		
		//mimo
		listaMimo = new ArrayList<String>();
		listaMimo.add("Mimo: Animale/Volatile");
		listaMimo.add("Mimo: Animale/Felino");
		listaMimo.add("Mimo: Animale/Mammifero");
		listaMimo.add("Mimo: Animale/Preistorico");
		listaMimo.add("Mimo: Animale/Domestico");
		listaMimo.add("Mimo: Animale/Fattoria");
		listaMimo.add("Mimo: Animale/Insetto");
		listaMimo.add("Mimo: Animale/Pesce");
		listaMimo.add("Mimo: Animale/Erbivoro");
		
		listaMimo.add("Mimo: Oggetto/Da tavolo");
		listaMimo.add("Mimo: Oggetto/Da giardino");
		listaMimo.add("Mimo: Oggetto/Da spiaggia");
		listaMimo.add("Mimo: Oggetto/Da borsa");
		listaMimo.add("Mimo: Oggetto/Da bagno");
		listaMimo.add("Mimo: Oggetto/Prezioso");
		listaMimo.add("Mimo: Oggetto/Giocattolo");
		listaMimo.add("Mimo: Oggetto/Da strada");
		listaMimo.add("Mimo: Oggetto/Articolo sportivo");
		listaMimo.add("Mimo: Oggetto/Da ufficio");
		listaMimo.add("Mimo: Oggetto/Scolastico");
		listaMimo.add("Mimo: Oggetto/Che si muove");
		listaMimo.add("Mimo: Oggetto/Che vola");
		listaMimo.add("Mimo: Oggetto/Di grandi dimensioni");
		listaMimo.add("Mimo: Oggetto/Cibo");
		
		listaMimo.add("Mimo: Sport/Invernali");
		listaMimo.add("Mimo: Sport/Individuali");
		listaMimo.add("Mimo: Sport/Di squadra");
		listaMimo.add("Mimo: Sport/Acquatici");
		listaMimo.add("Mimo: Sport/Atletica");
		listaMimo.add("Mimo: Sport/Estremi");
		listaMimo.add("Mimo: Sport/Su strada");
		
		listaMimo.add("Mimo: Tuo compagno di squadra");
		listaMimo.add("Mimo: Tuo avversario");//33
		listaGiocoSquadra.add((ArrayList<String>) listaMimo);//0  
		
		//imitazione
		listaImitazione = new ArrayList<String>();
		listaImitazione.add("Imitazione: Personaggio/Attore");
		listaImitazione.add("Imitazione: Personaggio/Attrice");
		listaImitazione.add("Imitazione: Personaggio/Comico");
		listaImitazione.add("Imitazione: Personaggio/Comica");
		listaImitazione.add("Imitazione: Personaggio/Presentatore");
		listaImitazione.add("Imitazione: Personaggio/Presentatrice");
		listaImitazione.add("Imitazione: Personaggio/Dei videogiochi");
		listaImitazione.add("Imitazione: Personaggio/Dei cartoni animati (uomo)");
		listaImitazione.add("Imitazione: Personaggio/Dei cartoni animati (donna)");
		listaImitazione.add("Imitazione: Personaggio/Dello sport (uomo)");
		listaImitazione.add("Imitazione: Personaggio/Dello sport (donna)");
		listaImitazione.add("Imitazione: Personaggio/Mestiere da uomo");
		listaImitazione.add("Imitazione: Personaggio/Mestiere da donna");
		listaImitazione.add("Imitazione: Personaggio/Storico ");
		listaImitazione.add("Imitazione: Personaggio/Mitologico");
		
		listaImitazione.add("Imitazione: Scena Film/Horror");
		listaImitazione.add("Imitazione: Scena Film/Avventura");
		listaImitazione.add("Imitazione: Scena Film/Azione");
		listaImitazione.add("Imitazione: Scena Film/Thriller");
		listaImitazione.add("Imitazione: Scena Film/Romantico");
		listaImitazione.add("Imitazione: Scena Film/Comico");
		listaImitazione.add("Imitazione: Scena Film/Classico");
		listaImitazione.add("Imitazione: Scena Film/Cartone animato");
		listaImitazione.add("Imitazione: Scena Film/Commedia");
		
		listaImitazione.add("Imitazione: Tuo amico di squadra");
		listaImitazione.add("Imitazione: Tuo avversario");//26	
		listaGiocoSquadra.add((ArrayList<String>) listaImitazione);//1   
		
		//canzone
		listaCanzone = new ArrayList<String>();
		listaCanzone.add("Indovina canzone: Canzone/Italiana");
		listaCanzone.add("Indovina canzone: Canzone/Straniera");
		listaCanzone.add("Indovina canzone: Canzone/Italiana (uomo)");
		listaCanzone.add("Indovina canzone: Canzone/Italiana (donna)");
		listaCanzone.add("Indovina canzone: Canzone/Italiana (gruppo)");
		listaCanzone.add("Indovina canzone: Canzone/Straniera (uomo)");
		listaCanzone.add("Indovina canzone: Canzone/Straniera (donna)");
		listaCanzone.add("Indovina canzone: Canzone/Straniera (gruppo)");
		
		listaCanzone.add("Indovina canzone: Canzone/Genere: Dance");
		listaCanzone.add("Indovina canzone: Canzone/Genere: Pop");
		listaCanzone.add("Indovina canzone: Canzone/Genere: Rock");
		listaCanzone.add("Indovina canzone: Canzone/Genere: Punk");
		listaCanzone.add("Indovina canzone: Canzone/Genere: Colonne sonore");
		
		listaCanzone.add("Indovina canzone: Canzone/Anni 60'");
		listaCanzone.add("Indovina canzone: Canzone/Anni 70'");
		listaCanzone.add("Indovina canzone: Canzone/Anni 80'");
		listaCanzone.add("Indovina canzone: Canzone/Anni 90'");
		listaCanzone.add("Indovina canzone: Canzone/Anni 2000");
		listaCanzone.add("Indovina canzone: Canzone/Recente");//19		
		listaGiocoSquadra.add((ArrayList<String>) listaCanzone);//2
		
		//disegno
		listaDisegno = new ArrayList<String>();
		listaDisegno.add("Disegno: Animale/Volatile");
		listaDisegno.add("Disegno: Animale/Felino");
		listaDisegno.add("Disegno: Animale/Mammifero");
		listaDisegno.add("Disegno: Animale/Preistorico");
		listaDisegno.add("Disegno: Animale/Domestico");
		listaDisegno.add("Disegno: Animale/Fattoria");
		listaDisegno.add("Disegno: Animale/Insetto");
		listaDisegno.add("Disegno: Animale/Pesce");
		listaDisegno.add("Disegno: Animale/Erbivoro");
		
		listaDisegno.add("Disegno: Oggetto/Da tavolo");
		listaDisegno.add("Disegno: Oggetto/Da giardino");
		listaDisegno.add("Disegno: Oggetto/Da spiaggia");
		listaDisegno.add("Disegno: Oggetto/Da borsa");
		listaDisegno.add("Disegno: Oggetto/Da bagno");
		listaDisegno.add("Disegno: Oggetto/Prezioso");
		listaDisegno.add("Disegno: Oggetto/Giocattolo");
		listaDisegno.add("Disegno: Oggetto/Da strada");
		listaDisegno.add("Disegno: Oggetto/Articolo sportivo");
		listaDisegno.add("Disegno: Oggetto/Da ufficio");
		listaDisegno.add("Disegno: Oggetto/Scolastico");
		listaDisegno.add("Disegno: Oggetto/Che si muove");
		listaDisegno.add("Disegno: Oggetto/Che vola");
		listaDisegno.add("Disegno: Oggetto/Di grandi dimensioni");
		listaDisegno.add("Disegno: Oggetto/Cibo");
		
		listaDisegno.add("Disegno: Sport/Invernali");
		listaDisegno.add("Disegno: Sport/Individuali");
		listaDisegno.add("Disegno: Sport/Di squadra");
		listaDisegno.add("Disegno: Sport/Acquatici");
		listaDisegno.add("Disegno: Sport/Atletica");
		listaDisegno.add("Disegno: Sport/Estremi");
		listaDisegno.add("Disegno: Sport/Su strada");
		
		listaDisegno.add("Disegno: Tuo compagno di squadra");
		listaDisegno.add("Disegno: Tuo avversario");//33		
		listaGiocoSquadra.add((ArrayList<String>) listaDisegno);//3  
		
	}
	
	public List<String> getListaCategorie() {
		return listaCategorie;
	}
	
	public String sceltaLettere(){
		return listaLettere.get(rand.nextInt(26));//0-25
	}
	
	public String sceltaIstruzioneLettere(){
		return listaIstruzioniLettere.get(rand.nextInt(40));//0-39
	}
	
	public int dado(){
		return rand.nextInt(6)+1;//1-6
	}

	public String sceltaParole(){
		return listaParole.get(rand.nextInt(100));//0-99
	}
	
	public String giocoSquadra(){		
		int n = rand.nextInt((4));//0-3		
		return listaGiocoSquadra.get(n).get(rand.nextInt(listaGiocoSquadra.get(n).size()));	//ogni sottoinsieme
	}
	
}
