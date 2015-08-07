package com.gioco.model;

import java.util.List;
import java.util.Random;

public class GamePageModel implements Model {

	private Repository repository;
	private Random rand;
	private int maxTurni;
	private int indiceSquadraCorrente;
	private List<Squadra> listaSquadre;
	private String stringaCategoria;
	private String stringaSquadraCorrente;
	private int turnoCorrente;
	
	public GamePageModel(List<Squadra> listaSquadre, int maxTurni) {
		repository = new Repository();
		rand = new Random();
		this.listaSquadre = listaSquadre;
		this.maxTurni = maxTurni;
		this.turnoCorrente = 0;
		this.indiceSquadraCorrente = 0;
	}

	public String getLettera() {
		return repository.sceltaLettere();
	}

	public String getNumero() {
		return String.valueOf(repository.dado());
	}

	public String getParola() {
		return repository.sceltaParole();
	}

	public List<Squadra> getListaSquadre() {
		return listaSquadre;
	}

	public String getStringaCategoria() {
		return stringaCategoria;
	}

	public String getStringaSquadraCorrente() {
		return stringaSquadraCorrente;
	}

	public void setStringaSquadraCorrente(String stringaSquadraCorrente) {
		this.stringaSquadraCorrente = stringaSquadraCorrente;
	}

	public int getTurnoCorrente() {
		return turnoCorrente;
	}

	public String getCategoriaLettere(){
		return repository.sceltaIstruzioneLettere();
	}
	
	public String getCategoriaGiocoSquadra(){
		return repository.giocoSquadra();
	}

	public boolean hasNextTurno() {
		return turnoCorrente <= maxTurni;
	}

	private boolean hasNextSquadra() {
		return indiceSquadraCorrente < listaSquadre.size();
	}

	public Squadra nextSquadra() {
		if (!hasNextSquadra()) {
			indiceSquadraCorrente = 0;
		}
		return listaSquadre.get(indiceSquadraCorrente);
	}

	public void calcolaTurno() {
		stringaCategoria = repository.getListaCategorie().get(rand.nextInt(3));
		if (hasNextTurno()) {
			stringaSquadraCorrente = nextSquadra().getNome();
			turnoCorrente = nextSquadra().nextTurno();
			indiceSquadraCorrente++;
		}
	}

}
