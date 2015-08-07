package com.gioco.model;

public class Squadra {
	
	private int punteggio;
	private int maxTurno;
	private int turnoCorrente;
	private String nome;

	public Squadra(int punteggio, int maxTurno, String nome){
		this.punteggio = punteggio;
		this.maxTurno = maxTurno;
		this.turnoCorrente = 1;
		this.nome = nome;
	}
	
	public int getPunteggio() {
		return punteggio;
	}
	
	public void setPunteggio(int punteggio) {
		this.punteggio = punteggio;
	}
	
	public String getNome() {
		return nome;
	}
	
	private boolean hasNextTurno(){
		return turnoCorrente <= maxTurno;
	}
	
	public int nextTurno() {
		if(hasNextTurno())
			return turnoCorrente++;
		return -1;
	}
}
